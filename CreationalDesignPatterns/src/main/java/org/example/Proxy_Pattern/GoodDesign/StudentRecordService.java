package org.example.Proxy_Pattern.GoodDesign;

public class StudentRecordService {

    public void viewRecord(StudentRecord record) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          CONFIDENTIAL STUDENT RECORD");
        System.out.println("==============================================");

        System.out.printf("%-18s : %s%n", "Student", record.getStudentName());
        System.out.printf("%-18s : %s%n", "Course", record.getCourse());
        System.out.printf("%-18s : %.2f%n", "Marks", record.getMarks());

        System.out.println("==============================================");

    }

}