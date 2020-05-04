package com.deepika.model;

//public class Child extends Parent, Parent2 {		//Wont work because super.businessIncome() can't identify which parent's method
													// to be called



public class Child extends Parent {		//inheriting(extending) the parent class
	
	public int businessIncome() {
		return 10000 + super.businessIncome();
	}
	
}
