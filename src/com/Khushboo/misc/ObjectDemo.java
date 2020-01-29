package com.Khushboo.misc;

public class ObjectDemo {
	
	public static void main(String[] args) {
		
		Mobile m = new Mobile();
		m.gettype();
		m.screenSize();
		m.toString();
		
		Object mob = new Mobile();
		Keyboard mobKey = new Mobile();
	}

}

class Mobile extends Keyboard {
	
	void screenSize() {};
}

class Keyboard {
	void gettype() {
		
	}
}