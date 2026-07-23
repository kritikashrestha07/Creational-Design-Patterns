package org.example.Decorator_Pattern;

import org.example.Decorator_Pattern.GoodDesign.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReportDecoratorTest {

    @Test
    void verifyBasicReportGeneration() {

        Report report = new BasicReport(
                "Kritika",
                "Computing",
                3.90
        );

        assertDoesNotThrow(report::generate);

    }

    @Test
    void verifyPDFFeatureWorks() {

        Report report =
                new PDFDecorator(
                        new BasicReport(
                                "Kritika",
                                "Computing",
                                3.90
                        ));

        assertDoesNotThrow(report::generate);

    }

    @Test
    void verifyWatermarkFeatureWorks() {

        Report report =
                new WatermarkDecorator(
                        new BasicReport(
                                "Kritika",
                                "Computing",
                                3.90
                        ));

        assertDoesNotThrow(report::generate);

    }

    @Test
    void verifySignatureFeatureWorks() {

        Report report =
                new SignatureDecorator(
                        new BasicReport(
                                "Kritika",
                                "Computing",
                                3.90
                        ));

        assertDoesNotThrow(report::generate);

    }

    @Test
    void verifyDecoratedReportNotNull() {

        Report report =
                new SignatureDecorator(
                        new WatermarkDecorator(
                                new PDFDecorator(
                                        new BasicReport(
                                                "Kritika",
                                                "Computing",
                                                3.90
                                        )
                                )
                        )
                );

        assertNotNull(report);

    }

}