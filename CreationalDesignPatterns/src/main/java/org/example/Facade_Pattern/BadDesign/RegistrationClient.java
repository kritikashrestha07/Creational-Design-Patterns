package org.example.Facade_Pattern.BadDesign;

import org.example.Adapter_Pattern.GoodDesign.EmailAdapter;
import org.example.Builder_Pattern.Student;

import java.util.Scanner;

public class RegistrationClient {

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("============= BAD DESIGN =============");

        System.out.print("Name : ");
        String name=sc.nextLine();

        System.out.print("Email : ");
        String email=sc.nextLine();

        System.out.print("Department : ");
        String department=sc.nextLine();

        Student student=new Student.StudentBuilder()
                .setName(name)
                .setEmail(email)
                .build();

        StudentValidator validator=new StudentValidator();

        if(!validator.validate(student))
            return;

        RollNumberGenerator generator=new RollNumberGenerator();

        String roll=generator.generateRollNumber();

        StudentRepository repository=new StudentRepository();

        repository.save(student);

        DepartmentService departmentService=new DepartmentService();

        departmentService.assignDepartment(department);

        EmailAdapter adapter=new EmailAdapter();

        adapter.sendNotification("Welcome "+name+
                "\nRoll Number : "+roll);

    }

}