package org.example.Proxy_Pattern.GoodDesign;

import java.util.Scanner;

public class ProxyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("         PCPS COLLEGE STUDENT SERVICES");
        System.out.println("              PROXY PATTERN");
        System.out.println("==================================================");

        System.out.println();
        System.out.println("Login As");
        System.out.println("1. ADMIN");
        System.out.println("2. STUDENT");

        System.out.print("\nChoose Role : ");

        int choice = sc.nextInt();
        sc.nextLine();

        String role;

        if(choice==1){
            role="ADMIN";
        }
        else{
            role="STUDENT";
        }

        System.out.println();

        System.out.print("Student Name : ");
        String name=sc.nextLine();

        System.out.print("Course : ");
        String course=sc.nextLine();

        System.out.print("Marks : ");
        double marks=sc.nextDouble();

        StudentRecord record=
                new StudentRecord(
                        name,
                        course,
                        marks
                );

        StudentRecordProxy proxy=
                new StudentRecordProxy();

        proxy.viewRecord(role,record);

    }

}