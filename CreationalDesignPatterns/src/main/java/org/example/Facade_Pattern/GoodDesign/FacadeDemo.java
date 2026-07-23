package org.example.Facade_Pattern.GoodDesign;

import org.example.Builder_Pattern.Student;

import java.util.Scanner;

public class FacadeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("          PCPS COLLEGE STUDENT SERVICES");
        System.out.println("                FACADE PATTERN");
        System.out.println("======================================================");

        System.out.print("Student Name : ");
        String name = sc.nextLine();

        System.out.print("Student Email : ");
        String email = sc.nextLine();

        System.out.print("Student Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Department : ");
        String department = sc.nextLine();

        Student student = new Student.StudentBuilder()
                .setName(name)
                .setAge(age)
                .setEmail(email)
                .build();

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        facade.registerStudent(student, department);

    }

}