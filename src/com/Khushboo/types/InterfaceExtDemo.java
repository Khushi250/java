package com.Khushboo.types;

public interface InterfaceExtDemo {

	public static void main(String[] args) {

		Validate v = new Validate();
		v.validate();
	}
}

class Validate implements HardwareValidation, SoftwareValidation {

	@Override
	public boolean validate() {
		System.out.println("validate.method");
		return false;
	}

}

interface HardwareValidation {
	boolean validate();
}

interface SoftwareValidation {
	boolean validate();
}