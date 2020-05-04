package com.deepika;

import com.deepika.model.Child;

public class InheritanceDemo {

	/*
	 * Inheritance:
	 * 	Deriving a sub class from a parent class is known as inheritance
	 * 
	 * Types of Inheritance:
	 * 	1. Single
	 *  2. Multiple Inheritance
	 *  3. Multi-level Inheritance
	 *  4. Hierarchical Inheritance
	 *  5. Hybrid Inheritance
	 * 
	 *  //Refer inheritance.png image for the structure...
	 * 
	 */
	
	public static void main(String[] args) {
		
		Child deepika = new Child();
		
		System.out.println("Deepika's Bank Balance: " + deepika.bankBalance);
		System.out.println("Deepika's Business Income: " + deepika.businessIncome());
		
	}
	
}
