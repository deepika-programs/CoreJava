package com.deepika;

import com.deepika.model.Pi;

public class FinalClassDemo { // extends Pi {	// This will not be allowed due to the keyword final in Pi

	public static void main(String[] args) {
		
		Pi pi = new Pi();
		
		System.out.println(pi.getPiValue());
		
	}
	
}
