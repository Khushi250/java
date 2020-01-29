package com.Khushboo.types;

import java.io.Serializable;

public interface InterfaceDemo {

	int value = 100;

	int add(int first, int second);

}

interface Info {
	void info();
}

interface Join {
	void info();
}

class Auto {
}

class Bus extends Auto {
}

/*
 * class Check implements Info, Join, Serializable {
 * 
 * @Override public void info() { // TODO Auto-generated method stub
 * 
 * } }
 */

abstract class Calculations implements InterfaceDemo {

}

class Check extends Calculations {

	@Override
	public int add(int first, int second) {
		// TODO Auto-generated method stub
		return 0;
	}

}