package org.example.Decorator_Pattern.GoodDesign;

public class BasicReport implements Report {

    private final String studentName;
    private final String course;
    private final double gpa;

    public BasicReport(String studentName,
                       String course,
                       double gpa) {

        this.studentName = studentName;
        this.course = course;
        this.gpa = gpa;

    }

    @Override
    public void generate() {

        System.out.println();
        System.out.println("=================================================");
        System.out.println("             PCPS STUDENT REPORT");
        System.out.println("=================================================");

        System.out.printf("%-15s : %s%n", "Student", studentName);
        System.out.printf("%-15s : %s%n", "Course", course);
        System.out.printf("%-15s : %.2f%n", "GPA", gpa);

        System.out.println("=================================================");

    }

}