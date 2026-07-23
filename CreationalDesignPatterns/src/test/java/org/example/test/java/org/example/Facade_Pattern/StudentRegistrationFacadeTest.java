package org.example.Facade_Pattern;

import org.example.Builder_Pattern.Student;
import org.example.Facade_Pattern.GoodDesign.DepartmentService;
import org.example.Facade_Pattern.GoodDesign.StudentRegistrationFacade;
import org.example.Facade_Pattern.GoodDesign.StudentValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentRegistrationFacadeTest {

    @Test
    void verifyRegistrationStartsSuccessfully() {

        Student student = new Student.StudentBuilder()
                .setName("Kritika")
                .setAge(20)
                .setEmail("kritika@gmail.com")
                .build();

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        assertDoesNotThrow(() ->
                facade.registerStudent(student, "Computing"));

    }

    @Test
    void verifyValidationServiceExecuted() {

        Student student = new Student.StudentBuilder()
                .setName("Kritika")
                .setEmail("kritika@gmail.com")
                .build();

        StudentValidator validator = new StudentValidator();

        assertTrue(validator.validate(student));

    }

    @Test
    void verifyDepartmentAllocationExecuted() {

        DepartmentService department =
                new DepartmentService();

        assertDoesNotThrow(() ->
                department.assignDepartment("Computing"));

    }

    @Test
    void verifyNotificationServiceExecuted() {

        Student student = new Student.StudentBuilder()
                .setName("Kritika")
                .setEmail("kritika@gmail.com")
                .build();

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        assertDoesNotThrow(() ->
                facade.registerStudent(student, "Computing"));

    }

    @Test
    void verifyFacadeObjectNotNull() {

        StudentRegistrationFacade facade =
                new StudentRegistrationFacade();

        assertNotNull(facade);

    }

}