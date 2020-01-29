package com.Khushboo.misc;

public class ArrayDemo {
	
	static int[] marks;
	static int val;
	
	public static void main(String[] args) {
	
		int marks1, marks2;
		
		//for primitive variables you'll ger value but for objects you get address reference.
		//array is an object. so here value is printed as 0 but array marks is printed as null.
		
		//allocating statically
		marks = new int[5]; //indicates how many elements it can have
		marks[0] = 50;
		marks[1] = 60;
		marks[2] = 80;
		marks[3] = 70;
		
		System.out.println("marks: " + marks);
		System.out.println("Value: " + val);
		
		//allocating dynamically
		float[] appraisalRaisings = {3.75f, 4.7f, 4.9f, 3.8f};
		
	}

}
