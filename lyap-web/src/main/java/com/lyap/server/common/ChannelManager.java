package com.lyap.server.common;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.lyap.entity.TcpConnection;
import io.netty.channel.Channel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


@Component
public class ChannelManager {
    private BiMap<String, Channel> channelBiMap = HashBiMap.create();
    private LinkedHashMap<String, Long> connectTimeMap = new LinkedHashMap<>();
    private Map<String, Long> recentHeartBeatTimeMap = new ConcurrentHashMap<>();

    private ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public void register(String key, Channel channel) {
        if(StringUtils.isEmpty(key)) {
            throw new IllegalArgumentException("channel key为空.");
        }


        readWriteLock.writeLock().lock();
        try {
            if(channelBiMap.containsKey(key)) {
                throw new IllegalArgumentException("key已存在.");
            }
            channelBiMap.put(key, channel);
            connectTimeMap.put(key, System.currentTimeMillis());
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

    public boolean unregister(String key) {
        readWriteLock.writeLock().lock();
        try {
            connectTimeMap.remove(key);
            return channelBiMap.remove(key) != null;
        } finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public boolean unregister(Channel channel) {
        String key;
        readWriteLock.writeLock().lock();
        try {
            key = channelBiMap.inverse().remove(channel);
            connectTimeMap.remove(key);
        } finally {
            readWriteLock.writeLock().unlock();
        }
        return StringUtils.isNotEmpty(key);
    }

    public Channel get(String key) {
        readWriteLock.readLock().lock();
        try {
            return channelBiMap.get(key);
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public List<TcpConnection> list(String key) {
        readWriteLock.readLock().lock();
        try {
            List<TcpConnection> connectList;
            if(StringUtils.isNotEmpty(key)) {
                connectList = new ArrayList<>(1);
                if(channelBiMap.containsKey(key)) {
                    connectList.add(new TcpConnection(key, connectTimeMap.get(key), recentHeartBeatTimeMap.get(key)));
                }
            } else {
                connectList = new ArrayList<>(connectTimeMap.size());
                connectTimeMap.forEach((k, v) -> {
                    connectList.add(new TcpConnection(k, v, recentHeartBeatTimeMap.get(k)));
                });
                Collections.reverse(connectList);
            }
            return connectList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }

    public void updateHeartBeatTime(Channel channel, Long time) {
        String key = channelBiMap.inverse().get(channel);
        if(StringUtils.isNotEmpty(key)) {
            recentHeartBeatTimeMap.put(key, time);
        }
    }


}
