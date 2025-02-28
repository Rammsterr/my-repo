package se.rajo;

import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {

        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("\n--- To-Do List ---");
            System.out.println("1. Add task");
            System.out.println("2. Show tasks");
            System.out.println("3. Remove task");
            System.out.println("Exit");
            System.out.println("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter task description");
            }
        }
    }
}
