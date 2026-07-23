package org.example.Adapter_Pattern.GoodDesign;

import java.util.Scanner;

public class AdapterDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("==========================================================");
        System.out.println("             PCPS COLLEGE STUDENT SERVICES");
        System.out.println("                  ADAPTER PATTERN");
        System.out.println("==========================================================");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Email        : ");
        String email = sc.nextLine();

        System.out.print("Enter Department   : ");
        String department = sc.nextLine();

        NotificationService adapter = new EmailAdapter();

        StudentNotification notification =
                new StudentNotification(adapter);

        notification.sendWelcomeMessage(
                name,
                email,
                department
        );

        System.out.println();
        System.out.println("==========================================================");
        System.out.println("✓ Notification sent successfully.");
        System.out.println("==========================================================");

    }

}