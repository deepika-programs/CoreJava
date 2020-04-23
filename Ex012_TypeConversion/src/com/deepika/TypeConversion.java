package com.deepika;

public class TypeConversion {

	/*
	 * 1. Widening or Automatic Type Conversion
	 * 		->	byte -> short -> int -> long -> float -> double
	 * 
	 * 2. Narrowing or Explicit Conversion
	 * 		->	double -> float	-> long -> int -> short -> byte 
	 * 
	 */
	
	
	public static void main(String[] args) {
		
		//widening type conversion
		byte b = 5;
		short s = b;
		int i = s;
		long l = i;
		float f = l;
		double d = f;
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		
		System.out.println("------------------------------------");
		
		//narrowing type declaration
		double db = 6.04;
		float fl = (float) db;
		long ln = (long) fl;
		int in = (int) ln;
		short sh = (short) in;
		byte by = (byte) sh;
		
		System.out.println(db);
		System.out.println(fl);
		System.out.println(ln);
		System.out.println(in);
		System.out.println(sh);
		System.out.println(by);
		
		System.out.println("------------------------------------");
	
		char ch = 'c';
		int a = 188;
		ch = (char) a;
		System.out.println(ch);
		
		System.out.println("------------------------------------");
		
		byte byt = 127;
		int num = 515;
		byt = (byte) num;		// will assign the value like num % 128
		System.out.println(byt);
		System.out.println(num%128);
		
		
		/*
		String ss = "Welcome";
		
	//	ss = ch;			//wont work. insted need to change the type of ch to String
	//	ss = (int) a;		//wont work. insted need to change the type of ss to int
	//	ch = (char) ss;		//wont work. insted need to change the type of ch to String
	 
	 */
	}
	
}
