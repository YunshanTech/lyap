package com.lyap.entity;

import java.util.Date;

public class GatewayBox {
    private Integer id;

    private String gatewayboxId;

    private String productCode;

    private String hardwareVersion;

    private String softwareVersion;

    private String relatedLockId;

    private Boolean status;

    private Date createTime;

    private Date lastModTime;

    private String modUserId;

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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getHardwareVersion() {
        return hardwareVersion;
    }

    public void setHardwareVersion(String hardwareVersion) {
        this.hardwareVersion = hardwareVersion;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public String getRelatedLockId() {
        return relatedLockId;
    }

    public void setRelatedLockId(String relatedLockId) {
        this.relatedLockId = relatedLockId;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }

    public String getModUserId() {
        return modUserId;
    }

    public void setModUserId(String modUserId) {
        this.modUserId = modUserId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}