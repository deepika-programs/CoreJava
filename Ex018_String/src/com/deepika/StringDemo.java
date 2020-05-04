package com.deepika;

public class StringDemo {

	//String is a Class
	//String is sequence of characters
	//String is immutable
	
	
	public static void main(String[] args) {
		/////	concat	-	joins 2 string
		String s1 = "Hello";
		String s2 = "World";
		System.out.println(s1.concat(s2));	// to join/concatenate another string
		
		/////	indexof	-	returns the ndex value of given string/character
		String s3 = new String("I'm from Ambattur");
		System.out.println(s3.indexOf("I'm"));
	
		String cities = "Chennai, Delhi, Mumbai";
		if(cities.indexOf("Culcutta")>=0) {
			System.out.println("City exists");
		} else {
			System.out.println("Given city not exists!");
		}
		
		if(cities.indexOf("Chennai")>=0) {
			System.out.println("City exists");
		} else {
			System.out.println("Given city not exists!");
		}
		
		/////	replace
		String rep = "He is from India. He is 5.5ft height. He is fair in color.";
		System.out.println(rep.replace("He", "She"));	// case sensitive

		
		System.out.println(rep.substring(18));
		System.out.println(rep.substring(18, 38));
		
		
		String seq = "Individual";
		String[] seqChar = seq.split("");
		/*
		 * for(String s: seqChar) { System.out.println(s); }
		 */
		System.out.println(seqChar[0]);
		System.out.println(seqChar[1]);
		System.out.println(seqChar[2]);
		
		
		
		
		//TODO - Just go through other string methods....
	}
	
	
}
