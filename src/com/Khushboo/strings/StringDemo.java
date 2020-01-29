package com.Khushboo.strings;

public class StringDemo {

	public static void main(String[] args) {

		String name = "IBM";
		System.out.println(name);
		
		name = name + "Corp";
		System.out.println(name);
		
		String myName = "Khsuhboo Garg";
		String fullName = new String("Khushboo Garg");
		String check = "Khushboo Garg";
		String checkAgain = "Khushboo Garg";
		
		System.out.println(fullName == check);
		System.out.println(check == checkAgain);
		
		if(myName.equals(fullName)) {
			System.out.println("both are equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
