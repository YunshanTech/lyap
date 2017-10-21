package com.lyap.entity;

public class NewIO {
    private Integer id;
    private String deviceId;
    private String power;

    public NewIO(String deviceId, String power) {
        this.deviceId = deviceId;
        this.power = power;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
