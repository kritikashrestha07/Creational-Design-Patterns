package org.example.Proxy_Pattern.BadDesign;

public class StudentRecord {

    private String studentName;
    private String course;
    private double marks;

    public StudentRecord(String studentName, String course, double marks) {
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }
}