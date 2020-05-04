package com.deepika.model;

public class Car implements TyreFactory, PaintFactory {

	@Override
	public void paintTheCar() {
		System.out.println("Car is getting painted...");
	}

	@Override
	public void assembleTyreWithCar() {
		System.out.println("Car is getting assembled with Tyres...");
	}

}
