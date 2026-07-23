package org.example.Decorator_Pattern.BadDesign;

public class WatermarkReport extends BasicReport {

    @Override
    public void generateReport(String name,
                               String course,
                               double gpa) {

        super.generateReport(name, course, gpa);

        System.out.println("Watermark Added");

    }

}