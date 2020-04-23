package com.deepika.model.car;

public class NissanCar {

	public Car car = new Car() {
		@Override
		public String carFeature() {
			String yourLogo = car + " with Nissan Logo";
			return yourLogo;
		}
	};

}
