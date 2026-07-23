package org.example.Proxy_Pattern.GoodDesign;

public class StudentRecordProxy {

    private final StudentRecordService service;

    public StudentRecordProxy() {

        service = new StudentRecordService();

    }

    public void viewRecord(String role,
                           StudentRecord record) {

        System.out.println();

        if(role.equalsIgnoreCase("ADMIN")){

            System.out.println("Access Granted");
            System.out.println();

            service.viewRecord(record);

        }
        else{

            System.out.println("==============================================");
            System.out.println("ACCESS DENIED");
            System.out.println("----------------------------------------------");
            System.out.println("Only ADMIN users can view student records.");
            System.out.println("==============================================");

        }

    }

}