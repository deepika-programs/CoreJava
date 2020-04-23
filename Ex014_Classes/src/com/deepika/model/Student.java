package com.deepika.model;

import java.util.Date;

public class Student {

	private int rollNum;
	private String name;
	private Date dob;
	private String gender;
	private String address;
	
	public int getRollNum() {
		return rollNum;
	}
	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//overriding toString method
	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address + "]";
	}
	
	
	
}
