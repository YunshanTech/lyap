package com.lyap.server.common;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.lyap.entity.TcpConnection;
import io.netty.channel.Channel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


@Component
public class ChannelManager {
    private BiMap<String, Channel> channelBiMap = HashBiMap.create();
    private LinkedHashMap<String, Long> timeMap = new LinkedHashMap<>();

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
            timeMap.put(key, System.currentTimeMillis());
        } finally {
            readWriteLock.writeLock().unlock();
        }

    }

    public boolean unregister(String key) {
        readWriteLock.writeLock().lock();
        try {
            timeMap.remove(key);
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
            timeMap.remove(key);
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
                    connectList.add(new TcpConnection(key, timeMap.get(key)));
                }
            } else {
                connectList = new ArrayList<>(timeMap.size());
                timeMap.forEach((k, v) -> {
                    connectList.add(new TcpConnection(k, v));
                });
                Collections.reverse(connectList);
            }
            return connectList;
        } finally {
            readWriteLock.readLock().unlock();
        }
    }


}
