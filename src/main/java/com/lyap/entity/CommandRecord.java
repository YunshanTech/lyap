package com.lyap.entity;

import java.util.Date;

public class CommandRecord {
    private Integer id;

    private Byte commandFunction;

    private String returnData;

    private Boolean returnStatus;

    private String managerPassword;

    private String guestPassword;

    private String cardno;

    private Boolean lockStatus;

    private String gatewayboxCommunicationcode;

    private Date time;

    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Byte getCommandFunction() {
        return commandFunction;
    }

    public void setCommandFunction(Byte commandFunction) {
        this.commandFunction = commandFunction;
    }

    public String getReturnData() {
        return returnData;
    }

    public void setReturnData(String returnData) {
        this.returnData = returnData;
    }

    public Boolean getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getGuestPassword() {
        return guestPassword;
    }

    public void setGuestPassword(String guestPassword) {
        this.guestPassword = guestPassword;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public Boolean getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Boolean lockStatus) {
        this.lockStatus = lockStatus;
    }

    public String getGatewayboxCommunicationcode() {
        return gatewayboxCommunicationcode;
    }

    public void setGatewayboxCommunicationcode(String gatewayboxCommunicationcode) {
        this.gatewayboxCommunicationcode = gatewayboxCommunicationcode;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}