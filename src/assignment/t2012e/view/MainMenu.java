package assignment.t2012e.view;

import java.util.Scanner;

public class MainMenu {
    private Scanner scanner = new Scanner(System.in);

    public void generateMainMenu() {
        while (true) {
            System.out.println("Menu");
            System.out.println("--------------------");
            System.out.println("1. Student manager.");
            System.out.println("2. Teacher manager.");
            System.out.println("0. Exit program.");
            System.out.println("--------------------");
            System.out.println("Please enter your choice (0-2): ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    StudentMenu studentMenu = new StudentMenu();
                    studentMenu.generateStudentMenu();
                    break;
                case 2:
                    TeacherMenu teacherMenu = new TeacherMenu();
                    teacherMenu.generateTeacherMenu();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    break;
                default:
                    break;
            }
            if (choice == 0) {
                break;
            }
            scanner.nextLine();
        }
    }
}
