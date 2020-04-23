package com.deepika;

import com.deepika.model.College;

public class StaticInnerClassDemo {	//see Library class inside the College.java for example

	public static void main(String[] args) {
		
		System.out.println(College.hundred);
		
		College.Library library = new College.Library();	//no need to create like "new College().new Library();"
		library.books();
		
		//College.Student	//-> cant be accessed because of the access specifier of Student.`1
	}
}
