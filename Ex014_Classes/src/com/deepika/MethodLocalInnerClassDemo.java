package com.deepika;

import com.deepika.model.Hotel;

public class MethodLocalInnerClassDemo {	// see Hotel.java for example

	public static void main(String[] args) {
		
		Hotel h = new Hotel();
		String food = h.orderFood("Veg");
		System.out.println(food);
		
		System.out.println(h.orderFood("Non-Veg"));
		
	}
	
}
