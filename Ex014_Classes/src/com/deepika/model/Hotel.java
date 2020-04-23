package com.deepika.model;

public class Hotel {

	public String orderFood(String type) {
		System.out.println("This is prepareFood method");
		
		class VegFood {
			String getFood() {
				return ("Veg Food is ready");
			}
		}
		
		class NonVegFood {
			String getFood() {
				return ("Non Veg Food is ready");
			}
		}
		
		if(type.equals("Veg")) {
			VegFood v = new VegFood();
			return v.getFood();
		} else {
			NonVegFood nv = new NonVegFood();
			return nv.getFood();
		}
		
	}
	
	
}
