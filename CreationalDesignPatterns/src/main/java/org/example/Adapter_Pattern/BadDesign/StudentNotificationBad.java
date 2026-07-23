package org.example.Adapter_Pattern.BadDesign;

public class StudentNotificationBad {

    private LegacyEmailService emailService;

    public StudentNotificationBad() {

        emailService = new LegacyEmailService();

    }

    public void sendNotification(String message) {

        emailService.sendMail(message);

    }

}