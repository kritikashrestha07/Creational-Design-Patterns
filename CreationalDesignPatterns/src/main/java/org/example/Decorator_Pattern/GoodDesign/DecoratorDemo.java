package org.example.Decorator_Pattern.GoodDesign;

import java.util.Scanner;

public class DecoratorDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================================");
        System.out.println("         PCPS COLLEGE STUDENT REPORT SYSTEM");
        System.out.println("             DECORATOR PATTERN");
        System.out.println("======================================================");

        System.out.print("Enter Student Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Course       : ");
        String course = sc.nextLine();

        System.out.print("Enter GPA          : ");
        double gpa = sc.nextDouble();

        System.out.println();
        System.out.println("Choose Report Features");
        System.out.println("----------------------");
        System.out.println("1. Basic Report");
        System.out.println("2. PDF");
        System.out.println("3. Watermark");
        System.out.println("4. Signature");
        System.out.println("5. PDF + Watermark");
        System.out.println("6. PDF + Signature");
        System.out.println("7. Watermark + Signature");
        System.out.println("8. All Features");

        System.out.print("\nChoice : ");
        int choice = sc.nextInt();

        Report report = new BasicReport(name, course, gpa);

        switch (choice) {

            case 2:
                report = new PDFDecorator(report);
                break;

            case 3:
                report = new WatermarkDecorator(report);
                break;

            case 4:
                report = new SignatureDecorator(report);
                break;

            case 5:
                report = new WatermarkDecorator(
                        new PDFDecorator(report));
                break;

            case 6:
                report = new SignatureDecorator(
                        new PDFDecorator(report));
                break;

            case 7:
                report = new SignatureDecorator(
                        new WatermarkDecorator(report));
                break;

            case 8:
                report = new SignatureDecorator(
                        new WatermarkDecorator(
                                new PDFDecorator(report)));
                break;

            default:
                break;
        }

        report.generate();

        System.out.println();
        System.out.println("======================================================");
        System.out.println("Report Generated Successfully!");
        System.out.println("======================================================");

    }

}