package com.deepika.model;

public class Parent {

	public String houseType = "Individual house";
	public int bankBalance = 5000000;
	
	public int businessIncome() {
		System.out.println("Running a business");
		return 50000;
	}
	
	public int rentalHouseIncome() {
		System.out.println("Renting a house");
		return 7500;
	}
}
