package com.Khushboo.strings;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		String name = "Khushboo";
		name = name + "Rajesh";
		name = name + "Garg";
		
		StringBuffer b = new StringBuffer();
		b.append("IBM");
		b.append("Corporation");
		
		StringBuilder sb = new StringBuilder("Mr. ");
		sb.append("Khushboo");
		System.out.println(sb);
		
		sb.append("Rajesh");
		System.out.println(sb);
		
		sb.append("Garg");
		System.out.println(sb);
		
	}

}
