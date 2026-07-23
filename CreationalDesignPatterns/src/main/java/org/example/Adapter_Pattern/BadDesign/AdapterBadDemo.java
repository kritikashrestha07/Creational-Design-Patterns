package org.example.Adapter_Pattern.BadDesign;

import java.util.Scanner;

public class AdapterBadDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("      PCPS COLLEGE STUDENT SERVICES");
        System.out.println("          ADAPTER PATTERN");
        System.out.println("             BAD DESIGN");
        System.out.println("==============================================");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Email        : ");
        String email = sc.nextLine();

        StudentNotificationBad notification = new StudentNotificationBad();

        notification.sendNotification(
                "Welcome " + name +
                        "\nEmail : " + email
        );

    }

}