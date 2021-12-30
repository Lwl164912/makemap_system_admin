package com.ruoyi.web.controller.web;

public class TbVisiLogWeb {

    public TbVisiLogWeb() {
    }


    public TbVisiLogWeb(Integer value, String campusId, String week, String poiName, String campusName) {
        this.value = value;
        this.campusId = campusId;
        this.week = week;
        this.poiName = poiName;
        this.campusName = campusName;
    }

    private Integer value;
                private String campusId;
                private String week;
                private String poiName;
                private String campusName;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getCampusId() {
        return campusId;
    }

    public void setCampusId(String campusId) {
        this.campusId = campusId;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getPoiName() {
        return poiName;
    }

    public void setPoiName(String poiName) {
        this.poiName = poiName;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }
}
