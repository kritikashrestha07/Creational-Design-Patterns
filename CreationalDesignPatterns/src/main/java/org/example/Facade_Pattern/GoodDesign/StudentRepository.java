package org.example.Facade_Pattern.GoodDesign;

import org.example.Builder_Pattern.Student;

public class StudentRepository {

    public void save(Student student) {

        System.out.println("✅ Student saved into database.");

    }

}