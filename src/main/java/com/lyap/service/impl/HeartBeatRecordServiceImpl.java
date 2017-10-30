package com.lyap.service.impl;
import com.lyap.entity.HeartbeatRecord;
import com.lyap.mapper.HeartbeatRecordMapper;
import com.lyap.service.HeartBeatRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.List;
/**
 * Created by liangxiao on 2017/10/29.
 */
@Service
public class HeartBeatRecordServiceImpl implements HeartBeatRecordService {
    @Autowired
    private HeartbeatRecordMapper heartbeatRecordMapper;

    @Override
    public int insert(HeartbeatRecord heartbeatRecord) {
        this.heartbeatRecordMapper.insert(heartbeatRecord);
        return 0;
    }

}

