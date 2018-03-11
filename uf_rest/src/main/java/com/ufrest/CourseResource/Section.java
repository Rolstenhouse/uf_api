package com.ufrest.CourseResource;

import java.util.ArrayList;

public class Section {
    private String number = "";
    private String classNumber = "";
    private String gradBasis = "";
    private String acadCareer = "";
    private String display = "";
    private int credits = 0;
    private int credits_min = 0;
    private int credits_max = 0;
    private String note = "";
    private String dnote = "";
    private ArrayList<String> genEd = new ArrayList<>();
    private String sectWeb = "";
    private String rotateTitle = "";
    private int deptCode = 0;
    private String deptName = "";
    private int courseFee = 0;
    private String lateFlag = "";
    private String EEP = "";
    private String LMS = "";
    private ArrayList<Instructor> instructors = new ArrayList<>();
    private ArrayList<MeetTime> meetTimes = new ArrayList<>();
    private String addEligible = "";
    private String grWriting = "";
    private String finalExam = "";

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(String classNumber) {
        this.classNumber = classNumber;
    }

    public String getGradBasis() {
        return gradBasis;
    }

    public void setGradBasis(String gradBasis) {
        this.gradBasis = gradBasis;
    }

    public String getAcadCareer() {
        return acadCareer;
    }

    public void setAcadCareer(String acadCareer) {
        this.acadCareer = acadCareer;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits_min() {
        return credits_min;
    }

    public void setCredits_min(int credits_min) {
        this.credits_min = credits_min;
    }

    public int getCredits_max() {
        return credits_max;
    }

    public void setCredits_max(int credits_max) {
        this.credits_max = credits_max;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDnote() {
        return dnote;
    }

    public void setDnote(String dnote) {
        this.dnote = dnote;
    }

    public ArrayList<String> getGenEd() {
        return genEd;
    }

    public void setGenEd(ArrayList<String> genEd) {
        this.genEd = genEd;
    }

    public String getSectWeb() {
        return sectWeb;
    }

    public void setSectWeb(String sectWeb) {
        this.sectWeb = sectWeb;
    }

    public String getRotateTitle() {
        return rotateTitle;
    }

    public void setRotateTitle(String rotateTitle) {
        this.rotateTitle = rotateTitle;
    }

    public int getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(int deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(int courseFee) {
        this.courseFee = courseFee;
    }

    public String getLateFlag() {
        return lateFlag;
    }

    public void setLateFlag(String lateFlag) {
        this.lateFlag = lateFlag;
    }

    public String getEEP() {
        return EEP;
    }

    public void setEEP(String EEP) {
        this.EEP = EEP;
    }

    public String getLMS() {
        return LMS;
    }

    public void setLMS(String LMS) {
        this.LMS = LMS;
    }

    public ArrayList<Instructor> getInstructors() {
        return instructors;
    }

    public void setInstructors(ArrayList<Instructor> instructors) {
        this.instructors = instructors;
    }

    public ArrayList<MeetTime> getMeetTimes() {
        return meetTimes;
    }

    public void setMeetTimes(ArrayList<MeetTime> meetTimes) {
        this.meetTimes = meetTimes;
    }

    public String getAddEligible() {
        return addEligible;
    }

    public void setAddEligible(String addEligible) {
        this.addEligible = addEligible;
    }

    public String getGrWriting() {
        return grWriting;
    }

    public void setGrWriting(String grWriting) {
        this.grWriting = grWriting;
    }

    public String getFinalExam() {
        return finalExam;
    }

    public void setFinalExam(String finalExam) {
        this.finalExam = finalExam;
    }

}
