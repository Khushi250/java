package com.Khushboo.apie;

public class PolymorphismDemo {

	public static void main(String[] args) {
		
		InterestCalc parent =  new InterestCalc();
		CompoundInterestCalc child = new CompoundInterestCalc();
		
		InterestCalc ic = new CompoundInterestCalc();
		ic.calculate(100);
	}

}

class CompoundInterestCalc extends InterestCalc {

	@Override
	void calculate(int principle) {
		System.out.println("CompoundInterestCalc.calculate()");
	}
}

class InterestCalc {
	void calculate(int principle) {
		System.out.println("InterestCalc.claulate( integer)");

	}

}