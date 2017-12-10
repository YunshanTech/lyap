package com.lyap.mapper;

import com.lyap.entity.Lock;
import com.lyap.entity.LockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LockMapper {
    long countByExample(LockExample example);

    int deleteByExample(LockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Lock record);

    int insertSelective(Lock record);

    List<Lock> selectByExample(LockExample example);

    Lock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Lock record, @Param("example") LockExample example);

    int updateByExample(@Param("record") Lock record, @Param("example") LockExample example);

    int updateByPrimaryKeySelective(Lock record);

    int updateByPrimaryKey(Lock record);
}