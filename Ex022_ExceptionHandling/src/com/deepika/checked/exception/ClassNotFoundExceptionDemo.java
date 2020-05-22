package com.deepika.checked.exception;

public class ClassNotFoundExceptionDemo {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.deepika.ExceptionHandleDemo");
			
		} catch (ClassNotFoundException e) {
			System.out.println("The given class is not loaded. Please verify.");
			e.printStackTrace();
		}
		
	}
	
}
