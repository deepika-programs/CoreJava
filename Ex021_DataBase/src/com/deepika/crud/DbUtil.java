package com.deepika.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {
	
	

	public static boolean executeDb(String query, DbOperation operation) throws SQLException {
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			//Load mysql driver into memory
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("[driver loaded, ");
			
			//Creating connection object
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "root");
			System.out.print("connection established, ");
			
			//create statement
			stmt = con.createStatement();
			System.out.print("Statement created]");
			System.out.println();
			
			
			if(operation==DbOperation.SELECT) {
				ResultSet resultSet = stmt.executeQuery(query);
				
				while(resultSet.next()) {
					for(int col=1; col<=resultSet.getMetaData().getColumnCount(); col++) {
						System.out.print(resultSet.getString(col) + ", ");
					}
					System.out.println();
					System.out.println("-------------------------------------------------");
				}
				return true;
			} else {
				int affectedRows = stmt.executeUpdate(query);
				System.out.println("Number of rows affected: "+affectedRows);
				return true;
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(stmt != null) {
				stmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return false;
	}
	
}
