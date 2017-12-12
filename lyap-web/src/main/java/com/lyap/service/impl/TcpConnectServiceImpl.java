package com.lyap.service.impl;

import com.lyap.entity.TcpConnection;
import com.lyap.page.PageResult;
import com.lyap.server.common.ChannelManager;
import com.lyap.service.TcpConnectService;
import io.netty.channel.Channel;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Service
public class TcpConnectServiceImpl implements TcpConnectService {
    @Resource
    private ChannelManager channelManager;

    @Override
    public PageResult<TcpConnection> findByPage(String key) {
        List<TcpConnection> list = channelManager.list(key);

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
        int draw = Integer.parseInt(request.getParameter("draw"));
        int start = Integer.parseInt(request.getParameter("start"));
        int length = Integer.parseInt(request.getParameter("length"));
        int pageNum = start / length + 1;

        int end = Math.min(start + length, list.size());

        List<TcpConnection> data;
        if(start > end) {
            data = new ArrayList<>(0);
        } else {
            data = list.subList(start, end);
        }

        return new PageResult<>(data, list.size(), pageNum, length, draw);
    }

    @Override
    public boolean sendMsg(String key, String msg) {
        Channel channel = channelManager.get(key);
        if(channel == null || !channel.isActive()) {
            return false;
        }

        channel.writeAndFlush(msg + '\n');
        return true;
    }

    @Override
    public boolean close(String key) {
        Channel channel = channelManager.get(key);

        if(channel != null) {
            channel.close();
        }

        return true;
    }
}
