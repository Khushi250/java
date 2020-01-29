package com.Khushboo.functions;

public class FinalClassDemo {
	
	public static void main(String[] args) {
		
		AdditionalInfo ai = new AdditionalInfo();
		ai.getInfo();
		
	}

}

final class Info{
	void getInfo() {
		System.out.println("Info.getInfo()");
	}
}

class AdditionalInfo {

	void getInfo( ) {
		Info i = new Info();
		i.getInfo();
	}
}
