package com.lyap.service.impl;


import com.lyap.entity.GatewayBox;
import com.lyap.mapper.GatewayBoxMapper;
import com.lyap.service.GatewayBoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * Created by liangxiao on 2017/10/29.
 */
@Service
public class GatewayBoxServiceImpl implements GatewayBoxService {


    @Autowired
    private GatewayBoxMapper gatewayBoxMapper;

    @Override
    public GatewayBox selectByGatewayBoxId(String gatewayBoxId) {
        return gatewayBoxMapper.selectByGatewayBoxId(gatewayBoxId);
    }

}
