package org.example.Proxy_Pattern.BadDesign;

import java.util.Scanner;

public class ProxyBadDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("      PCPS COLLEGE STUDENT SERVICES");
        System.out.println("           PROXY PATTERN");
        System.out.println("            BAD DESIGN");
        System.out.println("==========================================");

        System.out.print("Student Name : ");
        String name = sc.nextLine();

        System.out.print("Course : ");
        String course = sc.nextLine();

        System.out.print("Marks : ");
        double marks = sc.nextDouble();

        StudentRecord record =
                new StudentRecord(name, course, marks);

        StudentRecordService service =
                new StudentRecordService();

        service.viewRecord(record);

    }

}