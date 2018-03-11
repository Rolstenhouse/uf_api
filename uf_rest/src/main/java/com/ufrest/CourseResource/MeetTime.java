package com.ufrest.CourseResource;

import java.util.ArrayList;
import java.util.List;

public class MeetTime {
    private int meetNo = 0;
    private List<String> meetDays = new ArrayList<>();
    private String meetTimeBegin = "";
    private String meetTimeEnd = "";
    private String meetPeriodBegin = "";
    private String meetPeriodEnd = "";
    private String meetBuilding = "";
    private String meetBldgCode = "";
    private String meetRoom = "";

    public int getMeetNo() {
        return meetNo;
    }

    public void setMeetNo(int meetNo) {
        this.meetNo = meetNo;
    }

    public List<String> getMeetDays() {
        return meetDays;
    }

    public void setMeetDays(ArrayList<String> meetDays) {
        this.meetDays = meetDays;
    }

    public String getMeetTimeBegin() {
        return meetTimeBegin;
    }

    public void setMeetTimeBegin(String meetTimeBegin) {
        this.meetTimeBegin = meetTimeBegin;
    }

    public String getMeetTimeEnd() {
        return meetTimeEnd;
    }

    public void setMeetTimeEnd(String meetTimeEnd) {
        this.meetTimeEnd = meetTimeEnd;
    }

    public String getMeetPeriodBegin() {
        return meetPeriodBegin;
    }

    public void setMeetPeriodBegin(String meetPeriodBegin) {
        this.meetPeriodBegin = meetPeriodBegin;
    }

    public String getMeetPeriodEnd() {
        return meetPeriodEnd;
    }

    public void setMeetPeriodEnd(String meetPeriodEnd) {
        this.meetPeriodEnd = meetPeriodEnd;
    }

    public String getMeetBuilding() {
        return meetBuilding;
    }

    public void setMeetBuilding(String meetBuilding) {
        this.meetBuilding = meetBuilding;
    }

    public String getMeetBldgCode() {
        return meetBldgCode;
    }

    public void setMeetBldgCode(String meetBldgCode) {
        this.meetBldgCode = meetBldgCode;
    }

    public String getMeetRoom() {
        return meetRoom;
    }

    public void setMeetRoom(String meetRoom) {
        this.meetRoom = meetRoom;
    }
}
