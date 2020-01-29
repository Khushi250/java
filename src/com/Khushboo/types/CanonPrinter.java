package com.Khushboo.types;

public class CanonPrinter implements Printable {

	@Override
	public boolean canPrintPhotos() {
		System.out.println("CanonPrinter.canPrintPhotos()");
		return false;
	}

}
