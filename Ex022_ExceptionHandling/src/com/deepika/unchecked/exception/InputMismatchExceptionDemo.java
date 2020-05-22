package com.deepika.unchecked.exception;

import java.util.Scanner;

public class InputMismatchExceptionDemo {	//Runtime exception

	public static void main(String[] args) {
		
		/*
		int a = getInput();
		while(a==0) {
			a = getInput();
		}
		
		System.out.println("Received value is: "+ a);
		*/
		test();
	}
	
	public static void test() {
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
	}
	
	//Handled runtime exception
	private static int getInput() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter Input: ");
			return sc.nextInt();
		} catch (RuntimeException e) {	// cann also write Exception e or Throwable t
			System.out.println("Invalid format.");
			e.printStackTrace();
			return 0;
		}
	}
	
	//try can be used along with catch or finally or to the both
	public void trysamp() {
		try {
			
		}
		catch(Exception e) {  }
		finally {  }
	}
	
	
	
}
