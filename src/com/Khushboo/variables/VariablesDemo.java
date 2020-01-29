package com.Khushboo.variables;

public class VariablesDemo {
	//instance variable. can be used across all other methods. across instance.
	//instance variable can be used without pre assigning or initializing. they have default values.
	//but if you try to use local variable without initializing it will throw an error
	static int level;

	public static void main(String[] args) {

		//any variable within a method is called a local variable. local variable should be initialized before using it 
		//local variable
		int count = 10;
		System.out.println("Count value: " + count);
		
		System.out.println("level value: " + level);
	}
	void Calculate() {
	
		System.out.println("level val: " + level);
	}

}
