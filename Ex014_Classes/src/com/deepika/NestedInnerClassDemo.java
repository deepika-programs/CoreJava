package com.deepika;

import com.deepika.model.College;

public class NestedInnerClassDemo {	//see College.java for example

	public static void main(String[] args) {
		
		College.Staff collegeStaff = new College().new Staff();
		collegeStaff.attendance();
		collegeStaff.teaching();;
		
		//College.Student	//-> cant be accessed because of the access specifier of Student.`1
	}
}
