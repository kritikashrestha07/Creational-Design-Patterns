package org.example.Assignment;

import org.example.Builder_Pattern.Student;
import org.example.Factory_Method_Pattern.Notification;
import org.example.Factory_Method_Pattern.NotificationFactory;
import org.example.Singleton_Design_Pattern.CollegeConfig;

public class StudentAdmissionService {

    public void admitStudent(Student student, String notificationType) {

        // Load configuration (Singleton)
        CollegeConfig config = CollegeConfig.getInstance();

        System.out.println("=======================================");
        System.out.println("      PCPS COLLEGE ADMISSION");
        System.out.println("=======================================");
        System.out.println("College Name   : " + config.getCollegeName());
        System.out.println("System Version : " + config.getSystemVersion());

        System.out.println("\nStudent admitted successfully.\n");

        System.out.println("----------- Student Profile -----------");
        System.out.println("Student ID     : " + student.getStudentId());
        System.out.println("Name           : " + student.getName());
        System.out.println("Email          : " + student.getEmail());
        System.out.println("Phone Number   : " + student.getPhoneNumber());
        System.out.println("Department     : " + student.getDepartment());
        System.out.println("Semester       : " + student.getSemester());
        System.out.println("Address        : " + student.getAddress());
        System.out.println("Guardian Name  : " + student.getGuardianName());

        Notification notification =
                NotificationFactory.createNotification(notificationType);

        System.out.println("\n----------- Notification -----------");
        notification.send("Welcome to " + config.getCollegeName()
                + ", " + student.getName() + "!");

        System.out.println("\nAdmission completed successfully.");
    }
}
