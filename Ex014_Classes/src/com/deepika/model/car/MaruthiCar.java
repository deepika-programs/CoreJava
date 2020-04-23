package com.deepika.model.car;

public class MaruthiCar {

	public Car car = new Car() {	//anonymous inner class. Doesn't have the class name like line# 13.
		@Override
		public String carFeature() {
			String yourLogo = car + " with Maruthi Logo";
			return yourLogo;
		}
	};

	class CarDemo {	//inner class - has class name "CarDemo" followed by the keyword "class"
		
	}
	
	
}
