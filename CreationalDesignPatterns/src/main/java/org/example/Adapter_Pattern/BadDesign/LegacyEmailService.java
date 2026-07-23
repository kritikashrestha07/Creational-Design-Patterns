package org.example.Adapter_Pattern.BadDesign;

public class LegacyEmailService {

    public void sendMail(String text) {

        System.out.println();
        System.out.println("========== LEGACY EMAIL ==========");
        System.out.println(text);
        System.out.println("==================================");

    }

}