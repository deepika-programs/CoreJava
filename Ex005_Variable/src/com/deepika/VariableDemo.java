package com.deepika;

public class VariableDemo {

	/*
		variable is a temporary memory location to hold a value
		
		types:
			1. instance variable
			2. local variable
			3. static variable
	*/

	public static void main(String[] args) {
		
		/*
		System.out.println(Variable.cen); 	//calling static variable without creating object
		
		Variable v = new Variable();
		System.out.println(v.a); 	// calling the instance variable by its object
	//	System.out.println(v.cen); 	// This is unnecessary since all the "static" variable(s) can be called directly without object
		
		v.display();	// calling the method display. At this point of execution, the local variable msg will be created and prints the msg then destroys.
		
		System.out.println(v._); // underscore wont work from jdk 9
		*/
		
		Variable v = new Variable();
		System.out.println(v.a);
		v.a = 100;
		System.out.println(v.a);
		
		System.out.println("Static Variable: " + v.cen);
		v.cen = 200; // is equivalent Variable.cen = 200;
		System.out.println("Static Variable: " + v.cen);

		System.out.println("------------------------------------------------");
		
		Variable v2 = new Variable();
		System.out.println(v2.a);
		System.out.println(v2.cen);
		System.out.println(v2.PI);

		System.out.println("------------------------------------------------");
		
		
	}	
	
	
	
}
