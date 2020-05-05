package com.deepika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseUpdateDemo {

	//Database requires additional jar for the DB which we are connecting to..
	//Since we are going to try with mysql, adding mysql.jar with this project
	//created folder "lib" and placed the jar inside
	
	public static void main(String[] args) {
		
		/*  --DB Queries to create database and to create table
			create database sampledb;
			use sampledb;
			create table testtbl(slno int primary key auto_increment, usrname varchar(25), mobilenum varchar(12));
		 */
		
		try {
			//Load mysql driver into memory
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("--- driver class loaded ---");
			
			//Creating connection object
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			System.out.println("--- connection established ---");
			
			//create statement
			Statement stmt = con.createStatement();
			System.out.println("--- Statement created ---");
			
			//creating the query string
			String qry = "update testtbl set usrname='Ms. Deepika' where mobilenum='9876543210'";
			
			//Executing query
			stmt.executeUpdate(qry);
			System.out.println("--- Statement updated ---");
			
			
		} catch (Exception e) {
			System.out.println("Exception Occured...!");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
