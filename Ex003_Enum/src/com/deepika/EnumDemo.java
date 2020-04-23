package com.deepika;

public class EnumDemo {

	//TODO	- see enum with get value of method
	//TODO	- enum constructor
	
	enum Mon {
		JAN, FEB, MAR
	}
	
	public static void main(String[] args) {
		Day d = Day.SUN;
		System.out.println(d);
		System.out.println("------------------------------------");
		
		System.out.println(Mon.JAN);
		System.out.println("------------------------------------");
		
		Day[] allDay = Day.values();
		
		for(Day dy: allDay) {
			System.out.println(dy);
		}
		
	}
	
}

