package com.lyap.service;

import com.lyap.entity.Lock;

/**
 * Created by liangxiao on 2017/10/29.
 */
public interface LockService {
    Lock selectByLockId(String lockId);
    int insert(Lock record);
    int updateByPrimaryKey(Lock record);
}
