package com.deepika;

import com.deepika.model.AnimalAbstract;

public class ConcreteClassWithAbstractDemo extends AnimalAbstract {

	@Override
	public void eat() {
		System.out.println("Animal is eating...");
	}
	
	public static void main(String[] args) {
		
		ConcreteClassWithAbstractDemo ccad = new ConcreteClassWithAbstractDemo();
		
		ccad.eat();
		
		ccad.makeSound();
		
		// Animal a = new Animal();	// abstract class can't be instantiated like this...
		
		
	}
	
	
}
