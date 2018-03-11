package com.ufrest.CourseResource;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String code = "";
    private String courseId = "";
    private String name = "";
    private String cNote = "";
    private String termInd = "";
    private String description = "";
    private List<Section> sections = new ArrayList<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getcNote() {
        return cNote;
    }

    public void setcNote(String cNote) {
        this.cNote = cNote;
    }

    public String getTermInd() {
        return termInd;
    }

    public void setTermInd(String termInd) {
        this.termInd = termInd;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(ArrayList<Section> sections) {
        this.sections = sections;
    }
}
