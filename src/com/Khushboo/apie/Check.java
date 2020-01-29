package com.Khushboo.apie;

public class Check {

	int count;
	String name;

	void getInfo() {
		personalInfo();
		System.out.println("Khushboo");
	}

	public void livenIn() {
		System.out.println("Bangalore, India");
	}

	protected String companyName() {
		return "IBM Corporation";
	}

	private void personalInfo() {
		System.out.println("Khushboo Garg, Bangalore, India");
	}

}
