package com.Khushboo.types;

public class HPPrnter implements Printable {

	@Override
	public boolean canPrintPhotos() {
		System.out.println("HPPrnter.canPrintPhotos()");
		return true;
	}

}
