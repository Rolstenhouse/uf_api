package com.ufrest.CourseResource;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/* This class is the top level object received from the SOC API call and contains the list of course objects
 * along with details about the number of remaining results
 */
public class CoursesWrapper {
    @JsonProperty("COURSES")
    private List<Course> courses;
    @JsonProperty("LASTCONTROLNUMBER")
    private int lastControlNumber = 0;
    @JsonProperty("RETRIEVEDROWS")
    private int retrievedRows = 0;
    @JsonProperty("TOTALROWS")
    private int totalRows = 0;

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public int getLastControlNumber() {
        return lastControlNumber;
    }

    public void setLastControlNumber(int lastControlNumber) {
        this.lastControlNumber = lastControlNumber;
    }

    public int getRetrievedRows() {
        return retrievedRows;
    }

    public void setRetrievedRows(int retrievedRows) {
        this.retrievedRows = retrievedRows;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }
}
