package com.lyap.server.common;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandlerContext;

public interface MessageHandler {
    String deal(ChannelHandlerContext ctx, JSONObject msg) throws Exception;
}
