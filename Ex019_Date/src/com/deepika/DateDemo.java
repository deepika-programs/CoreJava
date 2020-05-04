package com.deepika;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateDemo {

	
	public static void main(String[] args) {
		
		String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		Date d = new Date();
		
		System.out.println(d);
		System.out.println(d.getHours());
		System.out.println(d.getTime());
		System.out.println(d.getDate());
		System.out.println(d.getYear()+1900);
		System.out.println(d.getDay());
		
		Date d2 = new Date("08/29/1994");
		System.out.println(day[d2.getDay()]);
		
		Date d3 = new Date("May 03, 2020");
		System.out.println(day[d3.getDay()]);
		
		
		Calendar cal1 = Calendar.getInstance();	//current date 2020/5/04
		Calendar cal2 = Calendar.getInstance();
		
		cal2.set(Calendar.YEAR, 2019);
		System.out.println(cal2);
		System.out.println(cal1.after(cal2));	//cal2 after cal1
		
		System.out.println("----------------------------------");
		
		//changing the cal1 date to 13/06/2020
		cal1.set(Calendar.YEAR, 2020);
		cal1.set(Calendar.MONTH, 5);	//5 is Jun
		cal1.set(Calendar.DATE, 13);

		//changing the cal2 date to 07/07/2020
		cal2.set(Calendar.YEAR, 2020);
		cal2.set(Calendar.MONTH, 6);	//5 is Jul
		cal2.set(Calendar.DATE, 07);
		System.out.println("is Jun 2020 before Jul 2020: " + cal2.before(cal1));
		System.out.println("is Jul 2020 before Jun 2020: " + cal1.before(cal2));
		
		
		System.out.println("----------------------------------");
		
		SimpleDateFormat sdf = new SimpleDateFormat("'day is ###' dd 'and year is' yyyy 'then month' MMMM");
		System.out.println(sdf.format(new Date("08/03/2020")));
		
		
	}
	
}
