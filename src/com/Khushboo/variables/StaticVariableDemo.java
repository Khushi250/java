package com.Khushboo.variables;

public class StaticVariableDemo {

	public static void main(String[] args) {

		Vendor iiht = new Vendor();
		iiht.createVendor("IIHT Technologies");
		iiht.totalVendors();
		
		Vendor hungerBox = new Vendor();
		hungerBox.createVendor("HungerBox Food Service");
		hungerBox.totalVendors();

		Vendor srs = new Vendor();
		srs.createVendor("SRS Transportation Service");
		srs.totalVendors();

	}

}

class Vendor {
	//global variable: static variable being used across all the objects
	//if you remove static the total vendors will not add up for different objects. remove static and see the results.
	//global variables are class level and not instance level
	static int totalVendors;

	void createVendor(String name) {
		System.out.println("Creating a Vendor: " + name);
		totalVendors++;
	}

	void totalVendors() {
		System.out.println("No. of vendors: " + totalVendors);
	}
}
