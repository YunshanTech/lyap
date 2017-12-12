package com.lyap.entity;

public class TcpConnection {
    private String name;
    private Long time;

    public TcpConnection() {
    }

    public TcpConnection(String name, Long time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }
}
