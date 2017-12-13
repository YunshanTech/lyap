package com.lyap.entity;

public class TcpConnection {
    private String name;
    private Long connectTime;
    private Long recentHeartBeatTime;

    public TcpConnection() {
    }

    public TcpConnection(String name, Long connectTime, Long recentHeartBeatTime) {
        this.name = name;
        this.connectTime = connectTime;
        this.recentHeartBeatTime = recentHeartBeatTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Long connectTime) {
        this.connectTime = connectTime;
    }

    public Long getRecentHeartBeatTime() {
        return recentHeartBeatTime;
    }

    public void setRecentHeartBeatTime(Long recentHeartBeatTime) {
        this.recentHeartBeatTime = recentHeartBeatTime;
    }
}
