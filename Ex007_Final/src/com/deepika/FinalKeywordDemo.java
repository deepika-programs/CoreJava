package com.deepika;

//public class FinalKeywordDemo { // extends FinalClass { // -> this will give error. So, can not be sub classed or inherited
public class FinalKeywordDemo extends FinalMethod {
	//final is used to not to allow modification
	//final can be used on variable, class, method, constructor (similar to modifier)
	/*
	 * final class	->	prevent inheritance (see line # 3)
	 * final variable	->	prevent to modify the value or to create constant value	(see line 20 & 21)
	 * final method	->	prevent method override (see line from 32 to 42)
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		int a = 100;
		a = a+1;
		
		final float pi = 3.14f;	// declaring a variable using final
	//	finA = 3.15f;		//	-> this will give error saying like remove final modifier
	//	finA = finA+1;		//	-> this will give error saying like remove final modifier
		
		final int init;		// will allow to initialize the value only once
		init = 1000;	//	-> assigned the value. This can't be altered/removed later
	//	init = 1001;	// -> this will give error since a value already been assigned
		
		System.out.println(FinalStaticVariable.varNam1);	// static can be accessed without creating object
	//	FinalStaticVariable.varNam1 = "Modifying the value";	// can't modify because of final
	}
	
	//overriding the actual behavior of the parent class
	String defaultMethod() {
		return "modified value of default method";
	}
	
	// cannot override the final method. the below method will give error
	/*
	String finalMethod() {
		return "final value";
	}
	*/
	
}
