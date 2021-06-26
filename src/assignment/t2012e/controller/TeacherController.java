package assignment.t2012e.controller;

import assignment.t2012e.entity.Teacher;
import assignment.t2012e.model.TeacherModel;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherController {
    Scanner scanner = new Scanner(System.in);
    TeacherModel teacherModel = new TeacherModel();

    public void create() {
        Scanner scanner = new Scanner(System.in);
        Teacher teacher = new Teacher();
        System.out.println("Please enter student roll number: ");
        String rollNumber = scanner.nextLine();
        teacher.setRollNumber(rollNumber);
        System.out.println("Please enter student full name: ");
        String fullName = scanner.nextLine();
        teacher.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        teacher.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        teacher.setPhone(phone);
        if (teacherModel.save(teacher)) {
            System.out.println("Action success");
        } else {
            System.out.println("Action fail");
        }
    }

    public void showList() {
        ArrayList<Teacher> list = teacherModel.findAll();
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
        System.out.println("Enter teacher rollnumber to search: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.err.println("No teacher found");
        } else {
            System.out.println("Teacher found: " + teacher.toString());
        }
    }

    public void update() {
        System.out.println("Enter teacher rollnumber to update: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.err.println("No student found");
        } else {
            System.out.println("Student found: " + teacher.toString());
        }
        Teacher updateTeacher = new Teacher();
        System.out.println("Please enter student full name: ");
        String fullName = scanner.nextLine();
        updateTeacher.setFullName(fullName);
        System.out.println("Please enter student email: ");
        String email = scanner.nextLine();
        updateTeacher.setEmail(email);
        System.out.println("Please enter student phone: ");
        String phone = scanner.nextLine();
        updateTeacher.setPhone(phone);
        if (teacherModel.update(rollNumber, updateTeacher)) {
            System.out.println("Action success");
        } else {
            System.out.println("Action fail");
        }
    }

    public void delete() {
        System.out.println("Enter teacher rollnumber to delete: ");
        String rollNumber = scanner.nextLine();
        Teacher teacher = teacherModel.findById(rollNumber);
        if (teacher == null) {
            System.err.println("No updateTeacher found");
        } else {
            System.out.println("Teacher found: " + teacher.toString());
        }

        System.out.println("Are you sure to delete this teacher (y/n): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("y")) {
            if (teacherModel.delete(rollNumber)) {
                System.out.println("Action success");
            } else {
                System.out.println("Action fail");
            }
        }
    }
}