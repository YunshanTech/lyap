package com.lyap.service.impl;


import com.lyap.entity.Lock;
import com.lyap.mapper.LockMapper;
import com.lyap.service.LockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liangxiao on 2017/10/29.
 */
@Service
public class LockServiceImpl implements LockService{


    @Autowired
    private LockMapper lockMapper;

    @Override
    public Lock selectByLockId(String lockId) {
        return lockMapper.selectByLockId(lockId);
    }

    @Override
    public int insert(Lock record){
        lockMapper.insert(record);
        return 0;
    }

    @Override
    public int updateByPrimaryKey(Lock record){
        lockMapper.updateByPrimaryKey(record);
        return  0;
    }
}
