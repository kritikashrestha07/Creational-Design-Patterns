package org.example.Facade_Pattern.GoodDesign;

import org.example.Adapter_Pattern.GoodDesign.EmailAdapter;
import org.example.Builder_Pattern.Student;

public class StudentRegistrationFacade {

    private final StudentValidator validator;
    private final RollNumberGenerator generator;
    private final StudentRepository repository;
    private final DepartmentService departmentService;
    private final EmailAdapter adapter;

    public StudentRegistrationFacade() {

        validator = new StudentValidator();
        generator = new RollNumberGenerator();
        repository = new StudentRepository();
        departmentService = new DepartmentService();
        adapter = new EmailAdapter();

    }

    public void registerStudent(Student student,
                                String department) {

        System.out.println();
        System.out.println("==============================================");
        System.out.println("       STUDENT REGISTRATION STARTED");
        System.out.println("==============================================");

        if (!validator.validate(student)) {

            System.out.println("Registration Failed.");

            return;

        }

        String roll = generator.generateRollNumber();

        repository.save(student);

        departmentService.assignDepartment(department);

        adapter.sendNotification(
                "Welcome " + student.getName()
                        + "\nRoll Number : " + roll
                        + "\nDepartment : " + department
        );

        System.out.println();
        System.out.println("==============================================");
        System.out.println("Registration Completed Successfully");
        System.out.println("==============================================");

    }

}