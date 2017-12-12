package com.lyap.server.handler;

import com.alibaba.fastjson.JSONObject;
import com.lyap.server.common.Handler;
import com.lyap.server.common.MessageHandler;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Handler("0001")
public class TestMessageHandler implements MessageHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String deal(ChannelHandlerContext ctx, JSONObject msg) throws Exception {
        logger.info(msg.toString());
        return null;
    }
}
