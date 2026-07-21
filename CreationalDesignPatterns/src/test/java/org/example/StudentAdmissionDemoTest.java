package org.example;

import org.example.Builder_Pattern.Student;
import org.example.Factory_Method_Pattern.EmailNotification;
import org.example.Factory_Method_Pattern.Notification;
import org.example.Factory_Method_Pattern.NotificationFactory;
import org.example.Singleton_Design_Pattern.CollegeConfig;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentAdmissionDemoTest {

    @Test
    void testSingletonConfiguration() {
        CollegeConfig config1 = CollegeConfig.getInstance();
        CollegeConfig config2 = CollegeConfig.getInstance();

        assertSame(config1, config2);
    }

    @Test
    void testStudentCreation() {
        Student student = new Student.StudentBuilder()
                .setStudentId(101)
                .setName("Ram")
                .setEmail("ram@gmail.com")
                .setPhoneNumber("9800000000")
                .setDepartment("BCA")
                .setSemester(5)
                .setAddress("Kathmandu")
                .setGuardianName("Hari")
                .build();

        assertNotNull(student);
        assertEquals(101, student.getStudentId());
        assertEquals("Ram", student.getName());
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void testFactoryCreatesEmailNotification() {
        Notification notification =
                NotificationFactory.createNotification("EMAIL");

        assertNotNull(notification);
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void testCollegeConfigurationValues() {
        CollegeConfig config = CollegeConfig.getInstance();

        assertEquals("ABC College", config.getCollegeName());
        assertEquals("1.0", config.getSystemVersion());
    }
}