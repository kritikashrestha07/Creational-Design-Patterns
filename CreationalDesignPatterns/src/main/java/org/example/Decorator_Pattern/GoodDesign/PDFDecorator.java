package org.example.Decorator_Pattern.GoodDesign;

public class PDFDecorator extends ReportDecorator {

    public PDFDecorator(Report report) {
        super(report);
    }

    @Override
    public void generate() {

        super.generate();

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("✓ PDF Export Enabled");
        System.out.println("-----------------------------------------");

    }

}