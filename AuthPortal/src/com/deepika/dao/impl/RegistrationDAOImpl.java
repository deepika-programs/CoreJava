package com.deepika.dao.impl;

import java.sql.SQLException;

import com.deepika.dao.RegistrationDAO;
import com.deepika.dto.UserInfoDTO;
import com.deepika.util.DbUtil;
import com.deepika.util.DbUtil.DbOperation;

public class RegistrationDAOImpl implements RegistrationDAO {
	
	DbUtil dbutil=new DbUtil();

	public boolean register(UserInfoDTO userinf) {
		boolean result = false;
		String qry = "insert into userinfo(Name, Dob, PhoneNumber,EmailAddress,Address,UserName,Password) values ('"
				+ userinf.getName() + "','" + userinf.getDob() + "','" + userinf.getPhnno() + "','"
				+ userinf.getEmail() + "','" + userinf.getAddress() + "','"+ userinf.getUsername() +"','"
				+ userinf.getPasswd() + "')";
		try {
			result = DbUtil.executeDb(qry, DbOperation.INSERT);
			if(result) {
				System.out.println("values inserted");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		

}
}