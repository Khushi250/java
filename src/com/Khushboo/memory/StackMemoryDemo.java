package com.Khushboo.memory;

public class StackMemoryDemo {
	public static void main(String[] args) {
		//since the hello method is static, we dont need a code to create an object to call it
		hello();
		
	}

	private static void hello() {
		//this recursion will give a stack overflow error

		System.out.println("StackMemoryDemo.hello()");
		hello();
	}

}
