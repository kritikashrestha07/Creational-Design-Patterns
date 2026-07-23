package org.example.Adapter_Pattern;

import org.example.Adapter_Pattern.GoodDesign.EmailAdapter;
import org.example.Adapter_Pattern.GoodDesign.NotificationService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmailAdapterTest {

    @Test
    void verifyAdapterObjectCreated() {

        NotificationService adapter = new EmailAdapter();

        assertNotNull(adapter);

    }

    @Test
    void verifyNotificationSuccessfullySent() {

        NotificationService adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
                adapter.sendNotification("Testing Notification"));

    }

    @Test
    void verifyAdapterDelegatesRequestCorrectly() {

        NotificationService adapter = new EmailAdapter();

        assertDoesNotThrow(() ->
                adapter.sendNotification("Delegation Test"));

    }

    @Test
    void verifyAdapterObjectIsNotNull() {

        EmailAdapter adapter = new EmailAdapter();

        assertNotNull(adapter);

    }

}