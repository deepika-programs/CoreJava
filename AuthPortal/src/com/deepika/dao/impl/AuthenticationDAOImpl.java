package com.deepika.dao.impl;

import java.sql.SQLException;
import java.util.List;

import com.deepika.dao.AuthenticationDAO;
import com.deepika.dto.UserInfoDTO;
import com.deepika.util.DbUtil;

public class AuthenticationDAOImpl implements AuthenticationDAO {

	UserInfoDTO userinf = new UserInfoDTO();

	@Override
	public boolean login(String username, String passwd) throws SQLException {
		boolean result = false;
		String query = "select * from userinfo where UserName='" + username + "' and Password='" + passwd + "'";
		try {
			result = DbUtil.executeDb(query, DbUtil.DbOperation.SELECT);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String resetpassword(String email) {
		return DbUtil.resetpwd(email);
	}

	@Override
	public void homepage() {
		// TODO Auto-generated method stub
	}

	@Override
	public List<UserInfoDTO> listUsers() {
		DbUtil.selectall(userinf);
		return null;
	}

	@Override
	public String findUserByEmail(String email) {
		return DbUtil.selectusr(email);

	}

}
