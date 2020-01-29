package com.Khushboo.types;

public class IDemo {

	public static void main(String[] args) {
		
		HPPrnter hp = new HPPrnter();
		System.out.println(hp.canPrintPhotos());
		
		CanonPrinter canon = new CanonPrinter();
		System.out.println(canon.canPrintPhotos());
		
		Printable p =  new CanonPrinter();
		p = new HPPrnter();
		
		Printable another = new Printable() {
			
			@Override
			public boolean canPrintPhotos() {
				System.out.println("IDemo.main(...).new Printable() {...}.canPrintPhotos()");
				return false;
			}
		};
		System.out.println(another.canPrintPhotos());
	}

}
