package com.deepika.dao;

import java.sql.SQLException;
import java.util.List;

import com.deepika.dto.UserInfoDTO;

public interface AuthenticationDAO {

	public boolean login(String username, String passwd) throws SQLException;

	public String resetpassword(String email);

	public void homepage();

	public List<UserInfoDTO> listUsers();

	public String findUserByEmail(String email);

}
