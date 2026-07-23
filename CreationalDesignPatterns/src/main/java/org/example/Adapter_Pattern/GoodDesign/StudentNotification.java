package org.example.Adapter_Pattern.GoodDesign;

public class StudentNotification {

    private final NotificationService notificationService;

    public StudentNotification(NotificationService notificationService) {

        this.notificationService = notificationService;

    }

    public void sendWelcomeMessage(String name,
                                   String email,
                                   String department) {

        String message =
                "\nWELCOME TO PCPS COLLEGE\n\n" +
                        "Student Name : " + name + "\n" +
                        "Email        : " + email + "\n" +
                        "Department   : " + department + "\n\n" +
                        "Your registration has been completed successfully.";

        notificationService.sendNotification(message);

    }

}