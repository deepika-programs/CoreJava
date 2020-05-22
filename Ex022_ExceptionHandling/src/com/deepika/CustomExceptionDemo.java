package com.deepika;

import java.util.ArrayList;
import java.util.List;

import com.deepika.custom.exception.AnotherCustomException;
import com.deepika.custom.exception.UserNotFoundException;

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		
		
		CustomExceptionDemo obj = new CustomExceptionDemo();
		try {
			obj.test();
		} catch (UserNotFoundException | AnotherCustomException e) {
			e.printStackTrace();
		}
		
		//System.out.println("Next to the catch line");
		
		
		
		
	}
	
	
	private void test() throws UserNotFoundException, AnotherCustomException {
		
			List<String> users = new ArrayList<String>();
			users.add("Deepika");
			users.add("Pavithra");
			users.add("Sakthi");
			
			System.out.println(users);
			System.out.println(users.get(5));
			
		
		
	}
	
	
}
