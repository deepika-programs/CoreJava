package com.deepika;

public class ForLoopDemo {
	
	public static void main(String[] args) {
		
		/*
		 * most used for loop contains 3 sections. Each section is separated by semi colon ";"
		 * Syntax:
		 * for(initialization; condition; increment/decrement) {
		 * 	//statement
		 * }
		 * 
		 * other than condition, initialization and increment/decrement section can have 
		 * more than one initialization or operation separated by comma
		 * 
		 */
		//for loop with all 3 sections
		for(int i=0, j=10; i<=j; i++, j--) {
			System.out.println("i="+i+", j="+j);
		}
		
		System.out.println("---------------------------------------");
		
		int i=0;
		int j=0;
		//for loop with only the condition
		for( ; i<=5; ) {		// without init and inc/dec
			System.out.println("++i =" + ++i +", j++ =" + j++ );		// note the ++i and i++ difference
		}
		
		System.out.println("---------------------------------------");
		
		int[] arr = {5, 8, 3, 6, 2, 9};
		//iterate arr using simple for loop
		for(int a=0; a<arr.length; a++) {
			System.out.println(arr[a]);
		}
		System.out.println("-*-*-*-*-*-*-");
		/*
		 * "for-each" loop or "Enhanced for loop"
		 * 
		 * Syntax:
		 * for(T element:collection object/array){
		 * 	//statement
		 * }
		 */
		for(int a: arr) {
			System.out.println(a);
		}
		
		/*
		int in=0;
		//infinite loop
		for( ; ; ) {
			System.out.println(in++);
		}
		*/
	}

}
