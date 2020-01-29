package com.Khushboo.misc;

public class SuperDemo {

	public static void main(String[] args) {

		ServiceCompany sc = new ServiceCompany();
		sc.info();
;		
	}

}

class Company{

	public Company(int value) {
		super(); 
		// when you select ctrl and click on this super it will open up the implementation. 
		//a class which does not has a parent class , it has a in built super class, object.
		// if you del this super, compiler will add it itself while running the program.

		System.out.println("Company.Company(): " + value);
		
	}
	void info() {
		System.out.println("Company.info()");
	}
	
	
}

class ServiceCompany extends Company{

	public ServiceCompany() {
		super(100); // when you select ctrl and click this super it will go to parent company 
		
	}
	
	
	
}