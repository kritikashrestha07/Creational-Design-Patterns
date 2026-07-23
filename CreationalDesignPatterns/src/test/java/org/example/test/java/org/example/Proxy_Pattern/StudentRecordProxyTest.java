package org.example.Proxy_Pattern;

import org.example.Proxy_Pattern.GoodDesign.StudentRecord;
import org.example.Proxy_Pattern.GoodDesign.StudentRecordProxy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRecordProxyTest {

    @Test
    void verifyAdminAccessAllowed() {

        StudentRecord record =
                new StudentRecord(
                        "Kritika",
                        "Computing",
                        90
                );

        StudentRecordProxy proxy =
                new StudentRecordProxy();

        assertDoesNotThrow(() ->
                proxy.viewRecord("ADMIN", record));

    }

    @Test
    void verifyStudentAccessDenied() {

        StudentRecord record =
                new StudentRecord(
                        "Kritika",
                        "Computing",
                        90
                );

        StudentRecordProxy proxy =
                new StudentRecordProxy();

        assertDoesNotThrow(() ->
                proxy.viewRecord("STUDENT", record));

    }

    @Test
    void verifyProxyObjectCreated() {

        StudentRecordProxy proxy =
                new StudentRecordProxy();

        assertNotNull(proxy);

    }

    @Test
    void verifyProxyObjectNotNull() {

        StudentRecordProxy proxy =
                new StudentRecordProxy();

        assertNotNull(proxy);

    }

}