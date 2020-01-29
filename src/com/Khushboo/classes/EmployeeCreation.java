package com.Khushboo.classes;

import java.util.Scanner;

public class EmployeeCreation {
	
	
	static Scanner scan = new Scanner(System.in);
	static Employee[] emps = new Employee[0];
	
	public static void main(String[] args) {
		
		

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
				EmployeeCreation();
			} else {
				exit();
			}

		}
	}
	


