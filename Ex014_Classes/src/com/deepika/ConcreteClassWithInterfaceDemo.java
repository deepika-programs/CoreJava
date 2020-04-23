package com.deepika;

import com.deepika.model.ShapeInterface;

public class ConcreteClassWithInterfaceDemo implements ShapeInterface {

	/*
		Definition 1:
		A concrete class is a class that has an implementation for all of its methods.
		
		Definition 2:
		A concrete class in Java is a type of "subclass", which implements all the abstract method of its super abstract class which it extends to.
	*/
	
	
	@Override
	public void draw() {
		System.out.println("Drawing...");
	}

	public static void main(String[] args) {
		
		System.out.println(a);
		
		// a=11;	//This can't be done. Bec, all "variable" inside the interface is "final" by default. Can't be reassigned.
		
	}
	
}


/*

	//below example is not a concrete class. Its just inheritance example. Creating Sub class "B" by extending the parent Class "A"

class A {
	
	void method1() {
		System.out.println("Method 1");
	}
	
}

class B extends A {	// This is not a concrete class. Just "inheritance". Extending "A" to subclass "B
	
	void method2() {
		System.out.println("Method 2");
	}
	
}

*/