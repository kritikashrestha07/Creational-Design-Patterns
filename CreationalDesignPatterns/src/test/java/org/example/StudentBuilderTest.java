package org.example;

import org.example.Builder_Pattern.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentBuilderTest {

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

    @Test
    void testStudentCreatedSuccessfully() {
        assertNotNull(student);
    }

    @Test
    void testStudentId() {
        assertEquals(101, student.getStudentId());
    }

    @Test
    void testStudentName() {
        assertEquals("Ram", student.getName());
    }

    @Test
    void testDepartment() {
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void testSemester() {
        assertEquals(5, student.getSemester());
    }

    @Test
    void testEmail() {
        assertEquals("ram@gmail.com", student.getEmail());
    }

    @Test
    void testPhoneNumber() {
        assertEquals("9800000000", student.getPhoneNumber());
    }

    @Test
    void testAddress() {
        assertEquals("Kathmandu", student.getAddress());
    }

    @Test
    void testGuardianName() {
        assertEquals("Hari", student.getGuardianName());
    }
}
