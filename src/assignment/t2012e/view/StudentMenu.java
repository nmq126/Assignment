package assignment.t2012e.view;

import assignment.t2012e.controller.StudentController;

import java.util.Scanner;

public class StudentMenu {
    private StudentController studentController = new StudentController();
    private Scanner scanner = new Scanner(System.in);

    public void generateStudentMenu(){
        while (true){
            System.out.println("Student Manager");
            System.out.println("--------------------");
            System.out.println("1. Create student.");
            System.out.println("2. Show list.");
            System.out.println("3. Search.");
            System.out.println("4. Update.");
            System.out.println("5. Delete.");
            System.out.println("0. Return main menu.");
            System.out.println("--------------------");
            System.out.println("Please enter your choice (0-5): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    studentController.create();
                    break;
                case 2:
                    studentController.showList();
                    break;
                case 3:
                    studentController.search();
                    break;
                case 4:
                    studentController.update();
                    break;
                case 5:
                    studentController.delete();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 0){
                break;
            }
            scanner.nextLine();
        }
    }
}
