package com.Khushboo.misc;

public class SystemDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Hello");
		System.err.println("Warning");
		
		System.out.println("SystemDemo.main()");
		
		String name = "Khushboo Garg";
		int empNo = 678;
		
		System.out.println("Employee (" + name + ") id is (" + empNo + ")");
		System.out.printf("Employee (%s) id is (%d)", name, empNo);
	}

}
