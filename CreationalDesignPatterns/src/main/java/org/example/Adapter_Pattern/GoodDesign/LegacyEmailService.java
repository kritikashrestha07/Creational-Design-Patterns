package org.example.Adapter_Pattern.GoodDesign;

public class LegacyEmailService {

    public void sendMail(String text) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("          PCPS LEGACY EMAIL SERVER");
        System.out.println("==============================================");
        System.out.println(text);
        System.out.println("==============================================");

    }

}