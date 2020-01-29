package com.Khushboo.classes;

import java.util.Scanner;

public class EmployeeDemo {

	static Scanner scan = new Scanner(System.in);
	static Employee[] emps = new Employee[5];

	public static void main(String[] args) {

		System.out.println("EMPLOYEE APPLICATION PORTAL");

		System.out.println("\nPress 1 to Create a New Employee \nPress 2 to Retrieve an Existing Employee");
		System.out.println("Press 3 ro Update an Existing Employee \nPress 4 to Delete an Existing Employee");
		System.out.println("Press 5 to exit the program.");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();

		System.out.println("You chose option: " + option + "\n");

		if (option == 1) {
			create();
		} else if (option == 2) {
			retrieve();
		} else if (option == 3) {
			update();
		} else if (option == 4) {
			delete();
		} else if (option == 5) {
			exit();
		} else {
			System.out.println("Wrong input. Exit Initialized.");
			exit();
		}

		/*
		 * Employee khushi = new Employee(); khushi.setEmpName("Khushboo Garg");
		 * khushi.setEmpDept("Engg"); khushi.setProjectName("Cloud microservices");
		 * 
		 * System.out.println(khushi.toString());
		 * 
		 * EmployeeOps crud = new EmployeeOps(); int empID =
		 * crud.createEmployee(khushi); System.out.println("Generated Employee ID: " +
		 * empID);
		 * 
		 * 
		 * khushi.setEmpId(empID); System.out.println(khushi);
		 */
	}

	private static void exit() {

		System.out.println("Program terminated.");

	}

	private static void delete() {

		System.out.println("Give the Employee Id which you want to delete?\n");
		int id = scan.nextInt();

	}

	private static void update() {

		System.out.println("Give the Employee id for which you want to update the details?");
		int id = scan.nextInt();

		System.out.println("Which field do you want to update? \nPress 1 to update project. \nPress 2 to update Dept.");
		System.out.println("Press 3 to update both.");
		int update = scan.nextInt();

		if (update == 1) {
			System.out.println("Project: ");
			String project = scan.next();
			System.out.println("updated");
		}

		else if (update == 2) {
			System.out.println("Dept: ");
			String dept = scan.next();
			System.out.println("Updated");
		} else if (update == 3) {
			System.out.println("Project: ");
			String project = scan.next();
			System.out.println("Dept: ");
			String dept = scan.next();

			System.out.println("updated.");
		}
	}

	private static void retrieve() {

		System.out.println("Enter the Employee ID for which you want to fetch the details: ");
		int id = scan.nextInt();
		
		
	

	}
	private static void create() {
		
		

		System.out.println("How many employees do you want to create?");
		int noEmp = scan.nextInt();
		
		int arrayLength = 0;
		arrayLength = arrayLength + noEmp;
		
		if (noEmp > 0) {
			emps = new Employee[arrayLength];
			
			for (int i = 1; i <= noEmp; i++) {
				

				System.out.println("Enter the following details : \nEmployee Name: ");
				String name = scan.next();
				System.out.println("Employee ID : ");
				int id = scan.nextInt();
				System.out.println("Project Name : ");
				String project = scan.next();
				System.out.println("Department: ");
				String dept = scan.next();
				
			// EmployeeOps crud = new EmployeeOps(); 
				// int empID = crud.createEmployee(khushi); 
				 //System.out.println("Generated Employee ID: " + * empID);

				Employee creation = new Employee(name, id, project, dept);
				System.out.println("Employee Created. \n");
				System.out.println(creation);
				emps[arrayLength-1] = creation;

				System.out.println( emps[arrayLength-1] + "\n");
			}

		} else {
			System.out.println("Wrong Input. Exit initialized.");
			exit();

		}

		System.out.println("Do you want to create more employees ? \nPress 0 to exit and Press 1 to create");
		noEmp = scan.nextInt();

		if (noEmp == 1) {
			create();
		} else {
			exit();
		}

	}

	
}
