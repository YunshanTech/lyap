package com.lyap.service.impl;

import com.lyap.entity.DoorOperationRecord;
import com.lyap.mapper.DoorOperationRecordMapper;
import com.lyap.service.DoorOperationRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.List;
/**
 * Created by liangxiao on 2017/10/28.
 */
@Service
public class DoorOperationRecordServiceImpl implements DoorOperationRecordService {
    @Autowired
    private DoorOperationRecordMapper doorOperationRecordMapper;

    @Override
    public int insert(DoorOperationRecord doorOperationRecord) {
        this.doorOperationRecordMapper.insert(doorOperationRecord);
        return 0;
    }

    @Override
    public int selectMaxId(){
        return this.doorOperationRecordMapper.selectMaxId();
    }
}

