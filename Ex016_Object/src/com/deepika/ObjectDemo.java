package com.deepika;

public class ObjectDemo {
	
	//Object is a instance of a class
	//Object used to hold a memory for the corresponding class and to execute its methods
	
	
	// c1.move();	-> cannot call a method in the class's scope
	
	public static void main(String[] args) {
		
		//creating object "c1" for Car using "new" keyword
		Car c1 = new Car();
		//TODO - Creating object using various ways
		
		/*
		 * Car c1	-> Car Datatype, c1 object name
		 * =	-> assignment operator
		 * new	-> is a keyword which created a space in the memory. The space is allocated for "c1"
		 * Car()	-> calling default constructor of "Car" class
		 * 
		 */
		
		//accessing class members of "Car" using the object "c1"
		
		c1.move();
	}
	
}


class Car {
	
	int tyres = 4;
	String color = "shiny black";
	
	void move() {
		System.out.println("Car is moving...");
	}
	
}