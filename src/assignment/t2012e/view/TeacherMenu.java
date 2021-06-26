package assignment.t2012e.view;

import assignment.t2012e.controller.TeacherController;

import java.util.Scanner;

public class TeacherMenu {
    private TeacherController teacherController = new TeacherController();
    private Scanner scanner = new Scanner(System.in);

    public void generateTeacherMenu(){
        while (true){
            System.out.println("Teacher Manager");
            System.out.println("--------------------");
            System.out.println("1. Create teacher.");
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
                    teacherController.create();
                    break;
                case 2:
                    teacherController.showList();
                    break;
                case 3:
                    teacherController.search();
                    break;
                case 4:
                    teacherController.update();
                    break;
                case 5:
                    teacherController.delete();
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
