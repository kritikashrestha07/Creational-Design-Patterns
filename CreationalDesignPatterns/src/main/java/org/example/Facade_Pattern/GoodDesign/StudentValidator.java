package org.example.Facade_Pattern.GoodDesign;

import org.example.Builder_Pattern.Student;

public class StudentValidator {

    public boolean validate(Student student) {

        if (student.getName() == null || student.getName().isBlank()) {
            System.out.println("❌ Student name cannot be empty.");
            return false;
        }

        if (student.getEmail() == null || !student.getEmail().contains("@")) {
            System.out.println("❌ Invalid email.");
            return false;
        }

        System.out.println("✅ Student Validation Successful");

        return true;

    }

}