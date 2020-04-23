package com.deepika.model;

public abstract class AnimalAbstract {	//add a keyword "abstract" in front of class to change it as abstract class

	abstract public void eat();
	// abstract String crawl;		// This is not allowed. Variable declaration with "abstract" is not possible
	
	final String s = "Sound";
	
	public void makeSound() {	//non abstract method
		System.out.println("Making sound...");
	}
}
