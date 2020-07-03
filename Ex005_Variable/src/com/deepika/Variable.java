package com.deepika;

public class Variable {

	/* 
		instance variable. 
		1. This can be called anywhere within the class and 
		2. outside the class, using object of this Variable class 
	*/
	int a = 10;
	
	String _ = "underscore"; // underscore wont work from jdk 9
	
	/* Syntax:
	 * int a = 10;
	 * 
	 * int 	-> data type (see Ex002_DataType project for more example)
	 * a	-> variable name
	 * 10	-> value that we are assigning to the variable "a" using assignment operator "=".
	 */
	
	void display() {	//method name "display" with no return type "void" 
		
		String msg = "Hi";	//local variable. 
		/*
			Local variable will only available within this display method. 
			Will be destroyed once display() method execution completed.
			Can not be accessed outside this method
		*/
		System.out.println(msg);
		System.out.println(_);
		
	}
	
	
	// Static variable
	static int cen = 100;
	/*
		This static variable can be accessed without creating object of this "Variable" class.
		If we change the value of the static variable in any instance/object it will  be modified across the JVM.
		i.e: Variable.cen
	*/
	
	// Static variable
	final static float PI = 3.14f;

}
