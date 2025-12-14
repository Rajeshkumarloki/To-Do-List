package com;

import java.util.*;
import java.util.ArrayList;

public class TaskManager {

	private ArrayList<Task> tasks = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public void addTask() {
		System.out.println("Enter the Task description");
		String desc = sc.nextLine().trim();
		
		while(desc.isEmpty())
		{
			System.out.println("task is empty,Please enter the task description");
			desc = sc.nextLine().trim();
		}
		
		tasks.add(new Task(desc));
			System.out.println("Task added successfully!✅✅✅");
		
	}
	
	public void viewTasks() {
		if (tasks.isEmpty()) {
			System.out.println("No tasks available");
		}
		System.out.println("\n====================");
        System.out.println("      TASK LIST");
        System.out.println("====================");

        for (int i = 0; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            System.out.println((i + 1) + ". " + t.getDescription()
                    + " [" + t.getStatus() + "]");
        }
		
	}
	
	public void updateTaskStatus()
	{
		viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter the task number to update: ");
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            tasks.get(index).toggleStatus();
            System.out.println("Task status updated successfully✅✅✅!");
        } catch (Exception e) {
            System.out.println("Invalid!");
        }
	}
	
	public void deleteTask() {
	
		viewTasks();
        if (tasks.isEmpty()) return;

        System.out.print("Enter the task number to delete: ");
        try {
            int index = Integer.parseInt(sc.nextLine()) - 1;
            tasks.remove(index);
            System.out.println("Task deleted successfully!✅ ");
        } catch (Exception e) {
            System.out.println("Invalid!");
        }
    }
	
	
	public void validateInput() {
		
	}
	
	public void findTaskByIndex() {
		
	}
}
