package com.lyap.server.handler;

import com.alibaba.fastjson.JSONObject;
import com.lyap.server.common.ChannelManager;
import com.lyap.server.common.Handler;
import com.lyap.server.common.MessageHandler;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;

@Handler("000000")
public class RegisterMessageHandler implements MessageHandler {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private ChannelManager channelManager;

    @Override
    public String deal(ChannelHandlerContext ctx, JSONObject msg) throws Exception {
        String key = msg.getString("key");
        try {
            channelManager.register(key, ctx.channel());
        } catch (Exception e) {
            logger.error("channel[" + key + "]注册失败.", e);
        }
        return null;
    }
}
