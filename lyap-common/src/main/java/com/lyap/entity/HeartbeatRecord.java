package com.lyap.entity;

import java.util.Date;

public class HeartbeatRecord {
    private Integer id;

    private String gatewayboxId;

    private Date heartbeatTime;

    private Integer dooroperationRecordId;

    private Boolean powerdownWarning;

    private Byte returnFunction;

    private Boolean returnStatus;

    private String returnData;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGatewayboxId() {
        return gatewayboxId;
    }

    public void setGatewayboxId(String gatewayboxId) {
        this.gatewayboxId = gatewayboxId;
    }

    public Date getHeartbeatTime() {
        return heartbeatTime;
    }

    public void setHeartbeatTime(Date heartbeatTime) {
        this.heartbeatTime = heartbeatTime;
    }

    public Integer getDooroperationRecordId() {
        return dooroperationRecordId;
    }

    public void setDooroperationRecordId(Integer dooroperationRecordId) {
        this.dooroperationRecordId = dooroperationRecordId;
    }

    public Boolean getPowerdownWarning() {
        return powerdownWarning;
    }

    public void setPowerdownWarning(Boolean powerdownWarning) {
        this.powerdownWarning = powerdownWarning;
    }

    public Byte getReturnFunction() {
        return returnFunction;
    }

    public void setReturnFunction(Byte returnFunction) {
        this.returnFunction = returnFunction;
    }

    public Boolean getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}