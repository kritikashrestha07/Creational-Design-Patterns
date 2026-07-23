package org.example.Decorator_Pattern.BadDesign;

import java.util.Scanner;

public class DecoratorBadDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("      PCPS COLLEGE REPORT SYSTEM");
        System.out.println("          BAD DESIGN");
        System.out.println("==========================================");

        System.out.print("Student Name : ");
        String name = sc.nextLine();

        System.out.print("Course : ");
        String course = sc.nextLine();

        System.out.print("GPA : ");
        double gpa = sc.nextDouble();

        PDFReport report = new PDFReport();

        report.generateReport(name, course, gpa);

    }

}