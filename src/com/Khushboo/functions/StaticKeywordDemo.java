package com.Khushboo.functions;

public class StaticKeywordDemo {
	
	public static void main(String[] args) {
		
		//Company ibm = new Company();
		//ibm.getFounder();
		// warning is generated when you declare the method getFounder as static, because 
		// there is no need of creating an object for static method. you can call the method
		//directly . this saves memory as when object is created it occupies some memory.
		// and that is the reason that you don't need to create an object for main class.
		// jvm with the help of static keyword calls class_name.main method directly.
		// for all other classes or methods you need to create objects.
		// static methods are helper methods. its a starting method.
		//one can have different main methods in one class. it will be overloading of main method.
		Company.getFounder();
	}

}

class Company{
	
	static void getFounder(){
		System.out.println("Thomas J Watson");
	}
}
