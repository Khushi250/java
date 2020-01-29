package com.Khushboo.misc;

public class ThisDemo {

	int count;

	public static void main(String[] args) {

		ThisDemo td = new ThisDemo();
		td.process();

	}

	void process() {

		System.out.println("Count value: " + count);
		setCount(148);
		System.out.println("Updated ount: " + count);
	}

	private void setCount(int count) {
		this.count = count;

	}

}
