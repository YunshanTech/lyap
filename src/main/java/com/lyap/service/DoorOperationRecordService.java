package com.lyap.service;

import com.lyap.entity.DoorOperationRecord;

//import java.util.List;
/**
 * Created by liangxiao on 2017/10/28.
 */
public interface DoorOperationRecordService {

    int insert(DoorOperationRecord record);

    int selectMaxId();
}
