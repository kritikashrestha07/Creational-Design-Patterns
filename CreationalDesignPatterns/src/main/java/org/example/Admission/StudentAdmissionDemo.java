package org.example.Admission;

import org.example.Builder_Pattern.Student;

import java.util.Scanner;

public class StudentAdmissionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("     PCPS COLLEGE ADMISSION SYSTEM");
        System.out.println("=======================================");

        System.out.print("Enter Student ID: ");
        int studentId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Semester: ");
        int semester = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Guardian Name: ");
        String guardian = sc.nextLine();

        Student student = new Student.StudentBuilder()
                .setStudentId(studentId)
                .setName(name)
                .setEmail(email)
                .setPhoneNumber(phone)
                .setDepartment(department)
                .setSemester(semester)
                .setAddress(address)
                .setGuardianName(guardian)
                .build();

        System.out.println();
        System.out.println("Choose Notification Method");
        System.out.println("1. Email");
        System.out.println("2. SMS");
        System.out.println("3. Push");
        System.out.print("Enter Choice: ");

        int choice = sc.nextInt();

        String notificationType;

        switch (choice) {
            case 1:
                notificationType = "email";
                break;
            case 2:
                notificationType = "sms";
                break;
            case 3:
                notificationType = "push";
                break;
            default:
                System.out.println("Invalid choice! Defaulting to Email.");
                notificationType = "email";
        }

        StudentAdmissionService admissionService = new StudentAdmissionService();
        admissionService.admitStudent(student, notificationType);

        sc.close();
    }
}