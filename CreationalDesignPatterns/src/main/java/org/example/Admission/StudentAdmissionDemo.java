package org.example.Admission;

import org.example.Builder_Pattern.Student;

public class StudentAdmissionDemo {

    public static void main(String[] args) {

        Student student = new Student.StudentBuilder()
                .setStudentId(101)
                .setName("Ram")
                .setEmail("ram@gmail.com")
                .setPhoneNumber("9800000000")
                .setDepartment("BCA")
                .setSemester(5)
                .setAddress("Kathmandu")
                .setGuardianName("Hari")
                .build();

        StudentAdmissionService admissionService =
                new StudentAdmissionService();

        admissionService.admitStudent(student, "EMAIL");
    }
}