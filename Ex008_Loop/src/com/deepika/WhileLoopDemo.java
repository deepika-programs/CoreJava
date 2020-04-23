package com.deepika;

public class WhileLoopDemo {
	
	public static void main(String[] args) {
		
		/*
		 * while loop is known as entry controlled lopp.
		 * Loop will be executed only if the condition is true
		 * and repeats continuously until the condition is satisfied or 
		 * condition remains true
		 * 
		 * Syntax:
		 * while(boolean condition) {
		 * 	//loop statement
		 * }
		 */
		
		boolean f = false;
		while(f) {
			System.out.println("Never prints since the condition returns false");
		}
		
		int a=0;
		//while loop
		while( a<=5 ) {		//entry control
			System.out.println(a++);
		}
		
		System.out.println("---------------------------------------");
		
		boolean b = true;
		int i=0;
		while( b ) {
			System.out.println("iterates...");
			i++;
			if(i==3) {
				b = false;
			}
		}
		
		
	}

}
