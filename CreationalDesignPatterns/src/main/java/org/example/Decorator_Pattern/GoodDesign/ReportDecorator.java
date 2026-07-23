package org.example.Decorator_Pattern.GoodDesign;

public abstract class ReportDecorator implements Report {

    protected Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public void generate() {
        report.generate();
    }
}