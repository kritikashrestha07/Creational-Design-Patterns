package org.example.Factory_Method_Pattern;

public class FactoryMethodDemo {

    public static void main(String[] args) {

        Notification email = NotificationFactory.createNotification("EMAIL");
        email.send("Assignment uploaded");

        Notification sms = NotificationFactory.createNotification("SMS");
        sms.send("Exam starts tomorrow");

        Notification push = NotificationFactory.createNotification("PUSH");
        push.send("New notice published");
    }
}
