package com.lyap.mapper;

import com.lyap.entity.DoorPperationRecord;
import com.lyap.entity.DoorPperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorPperationRecordMapper {
    long countByExample(DoorPperationRecordExample example);

    int deleteByExample(DoorPperationRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorPperationRecord record);

    int insertSelective(DoorPperationRecord record);

    List<DoorPperationRecord> selectByExample(DoorPperationRecordExample example);

    DoorPperationRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorPperationRecord record, @Param("example") DoorPperationRecordExample example);

    int updateByExample(@Param("record") DoorPperationRecord record, @Param("example") DoorPperationRecordExample example);

    int updateByPrimaryKeySelective(DoorPperationRecord record);

    int updateByPrimaryKey(DoorPperationRecord record);
}