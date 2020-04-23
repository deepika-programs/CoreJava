package com.deepika;

public class DataTypeDemo {
	
	public static void main(String[] args) {
		
		
		/*
		1. Primitive	-	boolean, byte, char, short, int, long, float, double
		2. Non-Primitive-	String, Array, Date, etc...
		*/
		
		/*
			boolean	-	1 bit	-	true or false
			
			byte	-	8 bit	-	(2 pow n)-1 (8)pow7	2*2*2*2*2*2*2	-	signed(-/+)	= from -128 to 127
			
			char	-	16 bit	-	0 to 255
			short	-	16 bit	-	-32768 to 32767
			
			int		-	32 bit	-	-2147483648‬ to 21474836487
			float	-	32 bit	-	0.0, 7 digit decimal point
			
			long	-	64 bit	-	-9223372036854775808 to 9223372036854775807
			double	-	64 bit	-	with floating point that supports 16 digit of decimal point
			
		
		*/
		
		byte b = 127;
		System.out.println(b);
		
		String s = "Hello";	// Sequence of character is a string
		System.out.println(s);
	}

}
