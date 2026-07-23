package org.example.Decorator_Pattern.BadDesign;

public class SignatureReport extends BasicReport {

    @Override
    public void generateReport(String name,
                               String course,
                               double gpa) {

        super.generateReport(name, course, gpa);

        System.out.println("Digital Signature Added");

    }

}