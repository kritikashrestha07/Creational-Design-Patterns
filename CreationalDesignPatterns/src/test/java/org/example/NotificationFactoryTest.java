package org.example;

import org.example.Factory_Method_Pattern.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationFactoryTest {

    @Test
    void shouldCreateEmailNotification() {

        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void shouldCreateSMSNotification() {

        Notification notification =
                NotificationFactory.createNotification("SMS");

        assertTrue(notification instanceof SMSNotification);
    }

    @Test
    void shouldCreatePushNotification() {

        Notification notification =
                NotificationFactory.createNotification("PUSH");

        assertTrue(notification instanceof PushNotification);
    }

    @Test
    void shouldThrowExceptionForInvalidType() {

        assertThrows(
                IllegalArgumentException.class,
                () -> NotificationFactory.createNotification("ABC")
        );
    }
}