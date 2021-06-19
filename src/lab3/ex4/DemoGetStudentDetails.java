package lab3.ex4;

import java.util.Scanner;

public class DemoGetStudentDetails {
    public static void main(String[] args) {
        String name;
        int age;
        float weight;
        Scanner keyBoard = new Scanner(System.in);
        System.out.println("student name:");
        name = keyBoard.nextLine();
        System.out.println("student age:");
        age = keyBoard.nextInt();
        keyBoard.nextLine();
        System.out.println("weight:");
        weight = keyBoard.nextFloat();
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("weight: " + weight);
    }
}
