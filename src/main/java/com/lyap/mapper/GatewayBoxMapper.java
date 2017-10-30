package com.lyap.mapper;

import com.lyap.entity.GatewayBox;
import com.lyap.entity.GatewayBoxExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GatewayBoxMapper {
    long countByExample(GatewayBoxExample example);

    int deleteByExample(GatewayBoxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GatewayBox record);

    int insertSelective(GatewayBox record);

    List<GatewayBox> selectByExample(GatewayBoxExample example);

    GatewayBox selectByGatewayBoxId(String gatewayBoxId);

    GatewayBox selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GatewayBox record, @Param("example") GatewayBoxExample example);

    int updateByExample(@Param("record") GatewayBox record, @Param("example") GatewayBoxExample example);

    int updateByPrimaryKeySelective(GatewayBox record);

    int updateByPrimaryKey(GatewayBox record);
}