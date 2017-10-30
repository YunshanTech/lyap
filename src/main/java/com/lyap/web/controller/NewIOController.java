package com.lyap.web.controller;

import com.lyap.entity.GatewayBox;
import com.lyap.entity.Lock;
import com.lyap.entity.HeartbeatRecord;
import com.lyap.service.DoorOperationRecordService;
import com.lyap.entity.DoorOperationRecord;
import com.lyap.service.GatewayBoxService;
import com.lyap.service.HeartBeatRecordService;
import com.lyap.service.LockService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class NewIOController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private DoorOperationRecordService doorOperationRecordService;
    @Resource
    private HeartBeatRecordService  heartBeatRecordService;
    @Resource
    private GatewayBoxService gatewayBoxService;
    @Resource
    private LockService lockService;

    //newio
    @RequestMapping("/newio")
    public String newio(String id, String power, Byte oper, String pwd, Boolean suc, String card, Boolean p) {
        logger.info(String.format("id: %s, power: %s, oper: %o, pwd: %s, suc: %s, card: %s, p: %s", id, power, oper, pwd, suc, card, p));
        Byte operationFunction = 0 ;
        String operationDescription = "";
        Boolean operationStatus = true;
        String password = "";
        String cardNo = "";

        /**
        *   记录心跳
        *   Created by liangxiao on 17-10-28.
        */
        HeartbeatRecord heartbeatRecord = new HeartbeatRecord();
        heartbeatRecord.setGatewayboxId(id);
        if(p!=null){
            heartbeatRecord.setPowerdownWarning(p);
        }else{
            heartbeatRecord.setPowerdownWarning(false);
        }
        if(oper!=null){
            heartbeatRecord.setDooroperationRecordId(this.doorOperationRecordService.selectMaxId());
        }
        heartbeatRecord.setHeartbeatTime(new Date());
        logger.info(String.format("网关盒%s记录心跳.",id));
        this.heartBeatRecordService.insert(heartbeatRecord);


        /**
         *   记录 门锁操作
         *   Created by liangxiao on 17-10-29.
         */
        DoorOperationRecord doorOperationRecord = new DoorOperationRecord();
        if(oper==null){
            logger.info(String.format("门锁状态无变化."));
            operationFunction = 0;
            doorOperationRecord.setOperationFunction(operationFunction);
            operationDescription = "无操作";
            doorOperationRecord.setOperationDescription(operationDescription);
        }else{
            if(oper == 1){
                logger.info(String.format("内把手开门."));
                operationFunction = 1;
                doorOperationRecord.setOperationFunction(operationFunction);
                operationDescription = "内把手开门";
                doorOperationRecord.setOperationDescription(operationDescription);
                doorOperationRecord.setOperationStatus(operationStatus);
            }else if(oper == 2){
                logger.info(String.format("密码开门."));
                operationFunction = 2;
                doorOperationRecord.setOperationFunction(operationFunction);
                operationDescription = "密码开门";
                doorOperationRecord.setOperationDescription(operationDescription);
                operationStatus = suc;
                doorOperationRecord.setOperationStatus(operationStatus);
                password = pwd;
                doorOperationRecord.setPassword(password);
            }else if(oper == 3){
                logger.info(String.format("用卡开门."));
                operationFunction = 3;
                doorOperationRecord.setOperationFunction(operationFunction);
                operationDescription = "用卡开门";
                doorOperationRecord.setOperationDescription(operationDescription);
                operationStatus = suc;
                doorOperationRecord.setOperationStatus(operationStatus);
                cardNo = card;
                doorOperationRecord.setCardno(cardNo);
            }
            doorOperationRecord.setTime(new Date());
            this.doorOperationRecordService.insert(doorOperationRecord);
        }

        /**
         *   修改 门锁 电量
         *   Created by liangxiao on 17-10-29.
         */
        GatewayBox gatewayBox = this.gatewayBoxService.selectByGatewayBoxId(id);
        if(gatewayBox!=null){
            Lock lock = this.lockService.selectByLockId(gatewayBox.getRelatedLockId());
            if(lock!=null){
                lock.setPower(power);
                logger.info(String.format("修改电量.门锁%s当前电量为:%s",lock.getLockId(),power));
                this.lockService.updateByPrimaryKey(lock);
            }else{
                logger.info(String.format("网关盒未关联门锁."));
            }
        }else{
            logger.info(String.format("网关盒未登记."));
        }
        return "OK";
    }

}
