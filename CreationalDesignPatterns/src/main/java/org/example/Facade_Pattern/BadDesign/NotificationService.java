package org.example.Facade_Pattern.BadDesign;

import org.example.Builder_Pattern.Student;

public class NotificationService {

    public void sendNotification(Student student) {
        System.out.println("Notification sent to " + student.getName());
    }

}