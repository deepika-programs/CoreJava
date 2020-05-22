package com.deepika.dto;

import java.util.Date;

public class UserInfoDTO {
	private String Name;
	private Date dob;
	private String Phnno;
	private String email;
	private String address;
	private String username;
	private String passwd;

	public UserInfoDTO() {
		
	}

	public UserInfoDTO(String name) {
		this.Name = name;
	}
	
	
	public UserInfoDTO(String name, Date dob, String phnno, String email, String address, String username, String passwd) {
		this.Name = name;
		this.dob = dob;
		this.Phnno = phnno;
		this.email = email;
		this.address = address;
		this.username = username;
		this.passwd = passwd;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPhnno() {
		return Phnno;
	}

	public void setPhnno(String phnno) {
		Phnno = phnno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public String setUsername(String username) {
		return this.username = username;
	}

	public String getPasswd() {
		return passwd;
	}

	public String setPasswd(String passwd) {
		return this.passwd = passwd;
	}

	@Override
	public String toString() {
		return "UserInfoDTO [Name=" + Name + ", dob=" + dob + ", Phnno=" + Phnno + ", email=" + email + ", address="
				+ address + ", username=" + username + ", passwd=" + passwd + "]";
	}
	
	
	
	
}
