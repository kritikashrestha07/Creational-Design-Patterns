package org.example.Adapter_Pattern.GoodDesign;

public class EmailAdapter implements NotificationService {

    private final LegacyEmailService legacyEmailService;

    public EmailAdapter() {

        legacyEmailService = new LegacyEmailService();

    }

    @Override
    public void sendNotification(String message) {

        legacyEmailService.sendMail(message);

    }

}