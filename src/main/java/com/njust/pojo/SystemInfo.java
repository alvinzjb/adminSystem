package com.njust.pojo;

import java.util.Date;

public class SystemInfo {
    private Long trainOnlyid;

    private Integer plcState;

    private Integer llaserState;

    private Integer rlaserState;

    private Integer tempState;

    private Integer udFlag;

    private Date trainDate;

    public Long getTrainOnlyid() {
        return trainOnlyid;
    }

    public void setTrainOnlyid(Long trainOnlyid) {
        this.trainOnlyid = trainOnlyid;
    }

    public Integer getPlcState() {
        return plcState;
    }

    public void setPlcState(Integer plcState) {
        this.plcState = plcState;
    }

    public Integer getLlaserState() {
        return llaserState;
    }

    public void setLlaserState(Integer llaserState) {
        this.llaserState = llaserState;
    }

    public Integer getRlaserState() {
        return rlaserState;
    }

    public void setRlaserState(Integer rlaserState) {
        this.rlaserState = rlaserState;
    }

    public Integer getTempState() {
        return tempState;
    }

    public void setTempState(Integer tempState) {
        this.tempState = tempState;
    }

    public Integer getUdFlag() {
        return udFlag;
    }

    public void setUdFlag(Integer udFlag) {
        this.udFlag = udFlag;
    }

    public Date getTrainDate() {
        return trainDate;
    }

    public void setTrainDate(Date trainDate) {
        this.trainDate = trainDate;
    }
}