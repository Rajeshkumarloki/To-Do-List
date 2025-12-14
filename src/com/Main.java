package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        TaskManager manager = new TaskManager();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===========================");
            System.out.println("        TO-DO LIST APP");
            System.out.println("===========================");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Update Task Status");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid choice!,use only numbers 1 to 5");
                continue;
            }

            switch (choice) {
                case 1:
                    manager.addTask();
                    break;
                case 2:
                    manager.viewTasks();
                    break;
                case 3:
                    manager.updateTaskStatus();
                    break;
                case 4:
                    manager.deleteTask();
                    break;
                case 5:
                    System.out.println("Exiting To-Do List App...\nThank you!");
                    return;
                default:
                    System.out.println("Invalid option!.");
            }
        }
    }
}

