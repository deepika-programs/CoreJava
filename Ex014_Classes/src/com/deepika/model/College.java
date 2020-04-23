package com.deepika.model;

public class College {	//outer class

	//Since this is not a public class, this can't be accessed from outside of the class
	class Student {	//inner class
		public void learn() {
			System.out.println("Learning");
		}
	}

	//this inner class(non-static inner class) can only be used within this class
	public class Staff {		//can be accessed globally because of "public"
		public void teaching() {
			System.out.println("Teaching");
		}
		public void attendance() {
			System.out.println("Attendance");
		}
	}
	
	public static int hundred = 100;
	
	//Example of static inner class
	public static class Library {	//static class or static inner class
		public void books() {
			System.out.println("Books Method");
		}
	}
	
	
	public static void main(String[] args) {
		
		College.Staff staff = new College().new Staff();
		staff.teaching();
		staff.attendance();
		
		College.Student student = new College().new Student();
		student.learn();
	}
}
