package com.deepika;

import com.deepika.model.car.MaruthiCar;
import com.deepika.model.car.NissanCar;

public class AnonymousInnerClassDemo {

	//Anonymous inner classes are declared without any name
	//This can be created in 2 ways. (using interface/abstract class)
	
	public static void main(String[] args) {
		
		MaruthiCar maruthi = new MaruthiCar();
		System.out.println(maruthi.car.carFeature());
		
		NissanCar nissan = new NissanCar();
		System.out.println(nissan.car.carFeature());
		
	}
}
