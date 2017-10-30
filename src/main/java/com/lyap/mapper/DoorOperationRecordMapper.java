package com.lyap.mapper;

import com.lyap.entity.DoorOperationRecord;
import com.lyap.entity.DoorOperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorOperationRecordMapper {
    int selectMaxId();

    long countByExample(DoorOperationRecordExample example);

    int deleteByExample(DoorOperationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorOperationRecord record);

    int insertSelective(DoorOperationRecord record);

    List<DoorOperationRecord> selectByExample(DoorOperationRecordExample example);

    DoorOperationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorOperationRecord record, @Param("example") DoorOperationRecordExample example);

    int updateByExample(@Param("record") DoorOperationRecord record, @Param("example") DoorOperationRecordExample example);

    int updateByPrimaryKeySelective(DoorOperationRecord record);

    int updateByPrimaryKey(DoorOperationRecord record);
}