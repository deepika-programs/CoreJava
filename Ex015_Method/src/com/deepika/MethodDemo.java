 package com.deepika;

/**
 * The Class MethodDemo.
 */
public class MethodDemo {

	/*
	 * functions are also known as methods in java
	 * 
	 * There are 2 type of methods 
	 * 	1. with return type (int/string/boolean/etc)
	 *  2. without return type (void)
 	 * 
	 */
	
	/**
	 * Display.
	 *
	 * @param a the a
	 */
	void display(int a) {	//"void" is no return/will not return any value when we call this method, "display" is method name
		System.out.println(a);
	}
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		MethodDemo md = new MethodDemo();	// creating object
		
		int basic = md.basicSal();
		
		int net = md.pf(basic);
		
		int total = md.hra(net);
		
		md.display(total);
		
	}
	
	/**
	 * Basic sal.
	 *
	 * @return the int
	 */
	int basicSal() {	// method with no parameter, and return type is "int"
		int bs = 5000;
		return bs;		// every method can return only one value
	}
	
	/**
	 * Pf.
	 *
	 * @param bs the bs
	 * @return the int
	 */
	int pf(int bs) {	// method with single parameter "int bs", and return type is "int"
		int net = bs - 1000;
		return net;
	}
	
	/**
	 * Hra.
	 *
	 * @param bs the bs
	 * @return the int
	 */
	int hra(int bs) {	// method with single parameter "int bs", and return type is "int"
		int net = bs + 4500;
		return net;
	}
	
}
