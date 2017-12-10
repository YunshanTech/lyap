package com.lyap.mapper;

import com.lyap.entity.CommandRecord;
import com.lyap.entity.CommandRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommandRecordMapper {
    long countByExample(CommandRecordExample example);

    int deleteByExample(CommandRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CommandRecord record);

    int insertSelective(CommandRecord record);

    List<CommandRecord> selectByExample(CommandRecordExample example);

    CommandRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CommandRecord record, @Param("example") CommandRecordExample example);

    int updateByExample(@Param("record") CommandRecord record, @Param("example") CommandRecordExample example);

    int updateByPrimaryKeySelective(CommandRecord record);

    int updateByPrimaryKey(CommandRecord record);
}