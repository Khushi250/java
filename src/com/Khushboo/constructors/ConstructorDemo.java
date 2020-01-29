package com.Khushboo.constructors;

public class ConstructorDemo {

	public static void main(String[] args) {
		Computer dell = new Computer();
		dell.setManufacturer("Dell Inc");
		dell.setModel("latitude");
		dell.setCost(70000);
		
		System.out.println(dell);
		
		Computer ibm = new Computer("IBM Corp", "Think Pad", 990000);
		System.out.println(ibm);
	}

}

class Computer {
	String manufacturer;
	String model;
	long cost;

	public Computer() {
	}

	public Computer(String manufacturer, String model, long cost) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Computer [manufacturer=" + manufacturer + ", model=" + model + ", cost=" + cost + "]";
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public long getCost() {
		return cost;
	}

	public void setCost(long cost) {
		this.cost = cost;
	}

}
