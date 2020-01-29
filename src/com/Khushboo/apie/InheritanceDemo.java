package com.Khushboo.apie;

public class InheritanceDemo {

	public static void main(String[] args) {
		Calc cal = new Calc();
		cal.add(20, 35);
	}

}

class Calc extends StdCalculation {
	void add(int firstValue, int secondValue) {
		System.out.println("Child Sum: " + (firstValue + firstValue));
	}

}

class StdCalculation extends SciCalculation {
	void add(int firstValue, int sescondValue) {
		System.out.println("Std Sum: " + (firstValue + sescondValue));
	}
}

class SciCalculation {
	void add(int firstValue, int secondValue) {
		System.out.println("Sci Sum: " + (firstValue + firstValue + secondValue));
	}
}
