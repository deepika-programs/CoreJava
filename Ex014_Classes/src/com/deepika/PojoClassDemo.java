package com.deepika;

import java.util.Date;
import java.util.Scanner;

import com.deepika.model.Student;

public class PojoClassDemo {

	/*
		POJO - POJO stands for "Plain Old Java Object"
			A class which contains only "private variables" and "setter and getter methods" to use those variables is called POJO class
			It does not have the behavior of its own
			
			Ref: Student.java in this example
	*/
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in); //getting input using scanner obj
		
		
		Student stu = new Student();	//creating object for Student
		//Assign values for each property in the Student class using setter method
		stu.setRollNum(sc.nextInt());
		
		
		stu.setName("Deepika");
		
		Date d = new Date("08/29/1998");	//mm/dd/yyyy
		stu.setDob(d);	//stu.setDob(Date("08/29/1998"));	-> best approach
		
		stu.setGender("Female");
		stu.setAddress("Chennai");
		
		PojoClassDemo pjc = new PojoClassDemo();
		pjc.print(stu);
		
		System.out.println(stu);
		
	}
	
	void print(Student st) {
		System.out.println("RollNum: "+ st.getRollNum());
		System.out.println("Name: "+ st.getName());
		System.out.println("Dob: "+  st.getDob());
		System.out.println("Gender: "+ st.getGender());
		System.out.println("Address: "+ st.getAddress());
	}

}
