package com.deepika;

public class DecisionMakingDemo {

	public static void main(String[] args) {
		
		/*
			Decision Making / Conditional Statement
			if
			if-else
			if-else-if
			nested-if
			switch-case
		*/
		
		int a = 5;
		if( a < 10 ) {	// simple if condition
			System.out.println("Value of a is less than 10!");
		}
		
		// if-else
		if( a>5 ) {
			System.out.println("Value of a is greater than 5!");
		} else {
			System.out.println("value is less than or equal to 5 ");
		}
		
		//if-else-if
		int iei = 2 * 6;
		if(iei < 10) {
			System.out.println("The result is less than 10 ");
		} else if( iei >=10 && iei < 20 ) {
			System.out.println("The result is between 10 and 20");
		} else {
			System.out.println("The result is not less than 20");
		}
		
		
		//nested-if
		String customer = "Ms. Deepika";
		int custAge = 22;
		int year = 1998;
		
		if(null != customer) {
			if(customer.startsWith("Ms.")) {
				System.out.println("Custome is female");
				if(custAge>18) {
					System.out.println("Customer is Major");
					if(year < 2000) {
						System.out.println("Not 2k kid");
					}
				}
			} else {
				if(customer.startsWith("Mr.")) {
					System.out.println("The special offer of Womens gift cant't be availed");
					if(custAge<18) {
						System.out.println("Minor aged should have Guardian along with you!");
					}
				}
			}
		}
		
		//switch-case
		//Syntax: switch(int, short, byte, char/number/String(from jdk8 onwards))
		int option = 1;
		switch(option) {
			case 0:
				System.out.println("Value is 0");
			break;
			case 1:
				System.out.println("Value is 1");
			break;
			default:
				System.out.println("Value is not 0 or 1");
			break;
		}
		
		char gender = 'm';
		switch(gender) {
			case 'm':
			case 'M':
				System.out.println("Male");
			break;
			case 'f':
			case 'F':
				System.out.println("Female");
			break;
			default:
				System.out.println("Not given / Third gender");
			break;
		}
		
		String day = "Mon";
		switch(day) {
			case "Mon":
			case "Tue":
			case "Wed":
			case "Thu":
			case "Fri":
				System.out.println("Weekday");
			break;
			case "Sat":
			case "Sun":
				System.out.println("Weekend");
			break;
			default:
				System.out.println("Not given");
			break;
		}

		
		// See what happens if no break.................
		int opt = 0;
		switch(opt) {
			case 0:
				System.out.println("Value is 0");
			case 1:
				System.out.println("Value is 1");
			break;
			default:
				System.out.println("Value is not 0 or 1");
			break;
		}
		
	}
	
}
