package com.deepika.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;

import com.deepika.Main;
import com.deepika.dto.UserInfoDTO;

public class DbUtil {

	public static enum DbOperation {
		CREATE, DELETE, UPDATE, INSERT, SELECT
	}

	UserInfoDTO userinf = new UserInfoDTO();
	static Main obj=new Main();

	public static boolean executeDb(String query, DbOperation operation) throws SQLException {

		Connection con = null;
		Statement stmt = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.print("[driver loaded, ");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinformation", "root", "root");
			System.out.print("connection established, ");

			stmt = con.createStatement();
			System.out.print("Statement created]");
			System.out.println();

			if (operation == DbOperation.SELECT) {
				ResultSet resultSet = stmt.executeQuery(query);
				while (resultSet.next()) {
					for (int col = 1; col <= resultSet.getMetaData().getColumnCount(); col++) {
						System.out.print(resultSet.getString(col) + ", ");
					}
					System.out.println();
					System.out.println("-------------------------------------------------");
					return true;
				}
			} else {
				int affectedRows = stmt.executeUpdate(query);
				System.out.println("Number of rows affected: " + affectedRows);
				return true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;

	}

	public static void selectall(UserInfoDTO userinf) {
		String qry = "select * from userinfo ";
		try {
			executeDb(qry, DbOperation.SELECT);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static String selectusr(String email) {

		String qry = "select * from userinfo where EmailAddress= '"+ email +"'";

		try {
			executeDb(qry, DbOperation.SELECT);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public static String resetpwd(String email) {
		
		Random random = new Random();
		String pswd = String.valueOf(random.nextInt(1000000));
	    
		String qry = " update userinfo set password= '" + pswd + "' where EmailAddress='"+ email +"'";
		try {
			DbUtil.executeDb(qry, DbOperation.UPDATE);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pswd;
	}

}
