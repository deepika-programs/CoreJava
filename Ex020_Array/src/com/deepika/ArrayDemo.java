package com.deepika;

import java.util.Random;

public class ArrayDemo {

	
	public static void main(String[] args) {
		
		int[] intArray = new int[10];
		for(int i=0;  i<intArray.length; i++) {
			intArray[i] = new Random().nextInt();	//generate random integer value and assign it in the integer array's block
		}
		System.out.println(intArray[0]);
		System.out.println(intArray[1]);
		System.out.println(intArray[2]);
		System.out.println(intArray[3]);
		
		String[] stringArray = new String[5];
		stringArray[0] = "hi";
		stringArray[1] = "hello";
		stringArray[2] = "shopping";
		stringArray[3] = "Tv";
		stringArray[4] = "Computer";
		for(int i=0; i<stringArray.length; i++) {
			System.out.print(stringArray[i] + ",");
		}
		System.out.println();
		
		System.out.println("-------------------------------");
		
		UserDefinedDataType uddt = new UserDefinedDataType();
		uddt.setAge("22");
		uddt.setName("Deepika");
		uddt.setCountry("India");
		System.out.println(uddt);
		
		uddt = new UserDefinedDataType("Pavithra", "18", "India");
		System.out.println(uddt);
		
		System.out.println("-------------------------------");
		
		UserDefinedDataType[] udArray = new UserDefinedDataType[5];
		udArray[0] = new UserDefinedDataType("Jhon", "30", "USA");
		udArray[1] = new UserDefinedDataType("Jack", "32", "UK");
		udArray[2] = new UserDefinedDataType("Elizabeth", "28", "Rome");
		
		UserDefinedDataType setUD = new UserDefinedDataType();
		setUD.setAge("25");
		setUD.setName("Ruby");
		
		udArray[3] = setUD;
		udArray[4] = new UserDefinedDataType();
		
		for(UserDefinedDataType tmp: udArray) {
			System.out.println(tmp);
		}
	}
	
}

class UserDefinedDataType {
	
	private String name;
	private String age;
	private String country;
	
	//empty or default constructor
	public UserDefinedDataType() { }
	
	//parameterized constructor
	public UserDefinedDataType(String name, String age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}
	
	//overriding tostring to see the data inside the class
	@Override
	public String toString() {
		return "UserDefinedDataType [name=" + name + ", age=" + age + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
