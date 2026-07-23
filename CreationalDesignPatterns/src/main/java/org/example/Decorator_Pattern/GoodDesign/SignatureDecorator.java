package org.example.Decorator_Pattern.GoodDesign;

public class SignatureDecorator extends ReportDecorator {

    public SignatureDecorator(Report report) {
        super(report);
    }

    @Override
    public void generate() {

        super.generate();

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("✓ Digital Signature Added");
        System.out.println("-----------------------------------------");

    }

}