package com.Khushboo.apie;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		int pCount = 0;
		pCount = Runtime.getRuntime().availableProcessors();
		System.out.println("Available processors : " + pCount);
		
		Check c = new Check();
		c.getInfo();
		c.companyName();
		c.livenIn();
	}

}

