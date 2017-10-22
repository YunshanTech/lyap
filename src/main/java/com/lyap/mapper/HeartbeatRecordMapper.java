package com.lyap.mapper;

import com.lyap.entity.HeartbeatRecord;
import com.lyap.entity.HeartbeatRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HeartbeatRecordMapper {
    long countByExample(HeartbeatRecordExample example);

    int deleteByExample(HeartbeatRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HeartbeatRecord record);

    int insertSelective(HeartbeatRecord record);

    List<HeartbeatRecord> selectByExample(HeartbeatRecordExample example);

    HeartbeatRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HeartbeatRecord record, @Param("example") HeartbeatRecordExample example);

    int updateByExample(@Param("record") HeartbeatRecord record, @Param("example") HeartbeatRecordExample example);

    int updateByPrimaryKeySelective(HeartbeatRecord record);

    int updateByPrimaryKey(HeartbeatRecord record);
}