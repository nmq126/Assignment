package assignment.t2012e.controller;

import assignment.t2012e.entity.Student;
import assignment.t2012e.model.StudentModel;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
    Scanner scanner = new Scanner(System.in);
    StudentModel studentModel = new StudentModel();

    public void create() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Please enter student roll number: ");
        String rollNumber = scanner.nextLine();
        student.setRollNumber(rollNumber);
        System.out.println("Please enter student full name: ");
        String fullName = scanner.nextLine();
        student.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        student.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        student.setPhone(phone);
        if (studentModel.save(student)) {
            System.out.println("Action success");
        } else {
            System.out.println("Action fail");
        }
    }

    public void showList() {
        ArrayList<Student> list = studentModel.findAll();
        System.out.printf("%10s%10s%10s | %10s%15s%10s | %5s%20s%5s | %5s%10s%5s\n",
                "", "Rollnumber", "",
                "", "Fullname", "",
                "", "Email", "",
                "", "Phone", "");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public void search() {
        System.out.println("Enter student rollnumber to search: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.err.println("No student found");
        } else {
            System.out.println("Student found: " + student.toString());
        }
    }

    public void update() {
        System.out.println("Enter student rollnumber to update: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.err.println("No student found");
        } else {
            System.out.println("Student found: " + student.toString());
        }
        Student updateStudent = new Student();
        System.out.println("Please enter student full name: ");
        String fullName = scanner.nextLine();
        updateStudent.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        updateStudent.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        updateStudent.setPhone(phone);
        if (studentModel.update(rollNumber, updateStudent)) {
            System.out.println("Action success");
        } else {
            System.out.println("Action fail");
        }
    }

    public void delete() {
        System.out.println("Enter student rollnumber to delete: ");
        String rollNumber = scanner.nextLine();
        Student student = studentModel.findById(rollNumber);
        if (student == null) {
            System.err.println("No student found");
        } else {
            System.out.println("Student found: " + student.toString());
        }

        System.out.println("Are you sure to delete this student (y/n): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            if (studentModel.delete(rollNumber)) {
                System.out.println("Action success");
            } else {
                System.out.println("Action fail");
            }
        }
    }
}