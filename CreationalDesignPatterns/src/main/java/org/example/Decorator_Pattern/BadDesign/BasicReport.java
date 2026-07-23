package org.example.Decorator_Pattern.BadDesign;

public class BasicReport {

    public void generateReport(String name,
                               String course,
                               double gpa) {

        System.out.println();
        System.out.println("===========================================");
        System.out.println("          STUDENT REPORT");
        System.out.println("===========================================");

        System.out.println("Student Name : " + name);
        System.out.println("Course       : " + course);
        System.out.println("GPA          : " + gpa);

        System.out.println("===========================================");

    }

}