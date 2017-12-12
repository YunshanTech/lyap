package com.lyap.server.common;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Component
@Sharable
public class MessageHandlerDispatcher extends SimpleChannelInboundHandler<String> implements ApplicationContextAware {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private Map<String, MessageHandler> messageHandlerMap = new HashMap<>();

    private ApplicationContext applicationContext;

    @Resource
    private ChannelManager channelManager;

    @PostConstruct
    private void init() {
        Map<String, Object> handlerMaps = applicationContext.getBeansWithAnnotation(Handler.class);
        handlerMaps.forEach((k, v) -> {
            if(v instanceof MessageHandler) {
                if(messageHandlerMap.put(k, (MessageHandler) v) != null) {
                    logger.error("Handler code重复.code=" + k);
                    System.exit(-1);
                }
            }
        });
    }


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, String msg) throws Exception {
        JSONObject msgJson = JSONObject.parseObject(msg);
        String code = msgJson.getString("code");
        MessageHandler messageHandler = messageHandlerMap.get(code);
        if(messageHandler == null) {
            throw new IllegalArgumentException("code[" + code + "]不存在对应的Handler");
        }
        String result = messageHandler.deal(ctx, msgJson);
        if(result != null) {
            ctx.writeAndFlush(result);
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        channelManager.unregister(ctx.channel());
        super.channelInactive(ctx);
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
