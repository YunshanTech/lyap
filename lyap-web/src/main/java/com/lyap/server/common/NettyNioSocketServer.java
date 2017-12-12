package com.lyap.server.common;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class NettyNioSocketServer {
    @Resource
    private MessageServerInitializer messageServerInitializer;

    private ExecutorService exec = Executors.newSingleThreadExecutor();

    @PostConstruct
    private void init() throws InterruptedException {
        exec.submit(() -> {
            EventLoopGroup bossGroup = new NioEventLoopGroup();
            EventLoopGroup workerGroup = new NioEventLoopGroup();

            try {
                ServerBootstrap serverBootstrap = new ServerBootstrap();
                serverBootstrap.group(bossGroup, workerGroup);
                serverBootstrap.channel(NioServerSocketChannel.class);
                serverBootstrap.childHandler(messageServerInitializer);

                ChannelFuture future = serverBootstrap.bind(8888).sync();
                future.channel().closeFuture().sync();

                return null;

            } finally {
                bossGroup.shutdownGracefully();
                workerGroup.shutdownGracefully();
            }
        });
    }

}
