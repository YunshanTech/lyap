package com.lyap.server.handler;

import com.alibaba.fastjson.JSONObject;
import com.lyap.server.common.ChannelManager;
import com.lyap.server.common.Handler;
import com.lyap.server.common.MessageHandler;
import io.netty.channel.ChannelHandlerContext;

import javax.annotation.Resource;

@Handler("PING")
public class HeartBeatMessageHandler implements MessageHandler {
    @Resource
    private ChannelManager channelManager;

    @Override
    public String deal(ChannelHandlerContext ctx, JSONObject msg) throws Exception {
        Long time = System.currentTimeMillis();

        channelManager.updateHeartBeatTime(ctx.channel(), time);

        return null;
    }
}
