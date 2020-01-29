package com.Khushboo.misc;

public class StaticBlockDemo {

	public static void main(String[] args) {

		new Check();
		//Check c = new Check();
		//Check cOne = new Check();
		//Check cTwo = new Check();
		//Check cThree = new Check();
	}

}

class Check {
	
	//static block
	static {
		System.out.println("Corporate, static block!");
	}
	//instance block
	{
		System.out.println("Check object getting created.");
	}
	//constructor
	public Check() {
		System.out.println("Check.Corporate()");
	//static block is executed only once, when the class is called. it is a helper. so whenever you run the code, 
		// jvm will first look for static block (no matter where is it situated) and then it will run other blocks 
		// other blocks are run as many times as object is called but static block runs only once for a class.
	
	}
}
