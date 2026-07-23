package org.example.Facade_Pattern.BadDesign;

import org.example.Builder_Pattern.Student;

public class StudentValidator {

    public boolean validate(Student student){

        if(student.getName()==null || student.getName().isBlank()){
            System.out.println("Validation Failed!");
            return false;
        }

        System.out.println("Student Validated");
        return true;

    }

}