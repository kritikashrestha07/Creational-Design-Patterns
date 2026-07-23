package org.example.Proxy_Pattern.BadDesign;

public class StudentRecordService {

    public void viewRecord(StudentRecord record) {

        System.out.println();
        System.out.println("========== STUDENT RECORD ==========");

        System.out.println("Student : " + record.getStudentName());
        System.out.println("Course  : " + record.getCourse());
        System.out.println("Marks   : " + record.getMarks());

        System.out.println("====================================");

    }

}