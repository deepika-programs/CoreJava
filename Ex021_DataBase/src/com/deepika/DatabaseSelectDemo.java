package com.deepika;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseSelectDemo {

	//Database requires additional jar for the DB which we are connecting to..
	//Since we are going to try with mysql, adding mysql.jar with this project
	//created folder "lib" and placed the jar inside
	
	public static void main(String[] args) {
		
		/*  --DB Queries to create database and to create table
			create database sampledb;
			use sampledb;
			create table testtbl(slno int primary key auto_increment, usrname varchar(25), mobilenum varchar(12));
		 */
		
		//CRUD - create, read, update, delete
		
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
			String qry = "select * from testtbl";
			
			//Executing query
			ResultSet rs = stmt.executeQuery(qry);
			System.out.println("--- Statement executed ---");
			
			while(rs.next()) {
				System.out.println("slno: "+rs.getInt("slno") + ", name: "+rs.getString("usrname") + ", mobil: "+rs.getString("mobilenum"));
			}
			
			
		} catch (Exception e) {
			System.out.println("Exception Occured...!");
			e.printStackTrace();
		}
		
	}
	
	
	
	
}
