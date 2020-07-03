package com.deepika;

//import java.util.Scanner;

public class DoWhileLoopDemo {
	
	public static void main(String[] args) {
		
		//do while loop
		/*
		 * It is similar to while loop
		 * It is also known as exit controlled loop
		 * The loop will be executed once even if the condition is "false"
		 * 
		 * Syntax:
		 * 
		 * do {
		 * 		//statement
		 * } while (boolean condition);
		 * 
		 * 
		 */
		
		do {
			System.out.println("Prints once thou the condition is false!!!");
		} while (false);	//exit control
		
		System.out.println("------------------------");
		
		int i=0;
		do {
			
			System.out.println("i : "+ i);
			i++;
			
		} while (i<=5);
		
		//infinite loop
		/*
		int in=0;
		do {
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			if(s.equalsIgnoreCase("bye")) {
				break;
			}
			System.out.println(in++);
		} while (true);
		
		*/
	}
	
}