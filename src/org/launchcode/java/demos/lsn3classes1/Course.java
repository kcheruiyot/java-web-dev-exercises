package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {
    int courseID;
    HashMap<Student,Integer> students;
    String courseName;

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setStudents(HashMap<Student, Integer> students) {
        this.students = students;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCourseID() {
        return courseID;
    }

    public HashMap<Student, Integer> getStudents() {
        return students;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course(int courseID, HashMap<Student, Integer> students, String courseName) {
        this.courseID = courseID;
        this.students = students;
        this.courseName = courseName;
    }
}
