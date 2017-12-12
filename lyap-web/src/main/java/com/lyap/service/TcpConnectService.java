package com.lyap.service;

import com.lyap.entity.TcpConnection;
import com.lyap.page.PageResult;

public interface TcpConnectService {
    PageResult<TcpConnection> findByPage(String key);

    boolean sendMsg(String key, String msg);

    boolean close(String key);
}
