package org.example.Decorator_Pattern.GoodDesign;

public class WatermarkDecorator extends ReportDecorator {

    public WatermarkDecorator(Report report) {
        super(report);
    }

    @Override
    public void generate() {

        super.generate();

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("✓ Official PCPS Watermark Added");
        System.out.println("-----------------------------------------");

    }

}