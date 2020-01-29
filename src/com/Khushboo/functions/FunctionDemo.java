package com.Khushboo.functions;

import java.io.IOException;

public class FunctionDemo {
	//syntax:
	//access_modifier non_access_modifier  return_type functionName(parameters) throws exception {
		//function body;
	//}
	// non access modifiers: static, final, synchronized, native(native calls internally. it does not have an 
	//implementation), abstract(to use this make your class abstract as well)
	
	synchronized double add(double first, int last) throws IOException {
		
		double sum = first+last;
		return sum;
	}
}
