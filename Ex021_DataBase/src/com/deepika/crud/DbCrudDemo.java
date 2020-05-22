package com.deepika.crud;

import java.sql.SQLException;

public class DbCrudDemo {

	//Reusable component is important key factor in programming
	public static void main(String[] args) {
		
		DbCrudDemo crud = new DbCrudDemo();
		
		//create table operation
		crud.createOperation();
		
		//insert operation
		//crud.insertOperation("Deepika", "9876543210");
		
		//select to see currently inserted value
		crud.selectOperation();
		
		crud.updateOperation("Deepika" , "9876543210");
		crud.selectOperation();
				
		//crud.deleteOperation();
		//crud.selectOperation();
		
	}
	
	
	private void createOperation() {
		String qry = "create table if not exists testtbl(slno int primary key auto_increment, usrname varchar(25), mobilenum varchar(12))";
		try {
			DbUtil.executeDb(qry, DbOperation.CREATE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void selectOperation() {
		String qry = "select * from testtbl";
		try {
			DbUtil.executeDb(qry, DbOperation.SELECT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void insertOperation(String name, String phNumber) {
		String qry = "insert into testtbl(usrname, mobilenum) values ('" + name + "', '" + phNumber + "')";
		try {
			DbUtil.executeDb(qry, DbOperation.INSERT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void updateOperation(String name, String phnum) {
		String qry = " update testtbl set usrname= '"+name+"' where mobilenum= '"+phnum+"' ";
		try {
			DbUtil.executeDb(qry, DbOperation.UPDATE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteOperation() {
		String qry = "delete from testtbl where mobilenum='9876543210'";
		try {
			DbUtil.executeDb(qry, DbOperation.DELETE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
