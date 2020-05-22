package com.deepika.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.deepika.dao.AuthenticationDAO;
import com.deepika.dao.impl.AuthenticationDAOImpl;
import com.deepika.dto.UserInfoDTO;
import com.deepika.service.AuthenticationService;

public class AuthServImpl implements AuthenticationService {
	AuthenticationDAO auth = new AuthenticationDAOImpl();

	@Override
	public boolean login(String username, String passwd) throws SQLException {
		boolean result = auth.login(username, passwd);
		return result;
	}

	@Override
	public String resetpassword(String email) {
		return auth.resetpassword(email);
	}

	@Override
	public void homepage() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<UserInfoDTO> listUsers() {
		return auth.listUsers();
	}

	@Override
	public String findUserByEmail(String email) {
		return auth.findUserByEmail(email);

	}

}
