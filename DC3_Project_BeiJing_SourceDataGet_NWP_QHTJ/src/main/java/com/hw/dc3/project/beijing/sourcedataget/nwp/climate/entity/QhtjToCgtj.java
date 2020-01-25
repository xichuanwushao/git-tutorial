package com.hw.dc3.project.beijing.sourcedataget.nwp.climate.entity;

public class QhtjToCgtj {
    private String startTime;
    private String endTime;
    private String elename;
    private String siteInfo;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getElename() {
        return elename;
    }

    public void setElename(String elename) {
        this.elename = elename;
    }

    public String getSiteInfo() {
        return siteInfo;
    }

    public void setSiteInfo(String siteInfo) {
        this.siteInfo = siteInfo;
    }

    @Override
    public String toString() {
        return "QhtjToCgtj [startTime=" + startTime + ", endTime=" + endTime + ", elename=" + elename + ", siteInfo="
                + siteInfo + "]";
    }

}
