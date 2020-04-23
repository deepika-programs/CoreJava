package com.deepika;

public class ScopeDemo {

	
	/*
		1. scope starts from "{" to "}"
		2. variable inside scope is always local variable
	*/
	
	
	public static void main(String[] args) {
		System.out.println("Scope Example...");
		
		{
			//scope
		}
		
		{
			int a = 1;
			System.out.println(a);
			// a is  available
			{
				int b = 2;
				System.out.println(a + ", "+ b);
				//a and b is available
			}
			
			System.out.println(a);
			//only a is available
		}
		
	}
	
}
