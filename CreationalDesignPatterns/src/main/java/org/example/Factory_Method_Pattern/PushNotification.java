package org.example.Factory_Method_Pattern;

public class PushNotification implements Notification {

    @Override
    public void send(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
