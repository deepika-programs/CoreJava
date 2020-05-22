package com.deepika.dao;

import com.deepika.dto.UserInfoDTO;

public interface RegistrationDAO {
	
	public boolean register(UserInfoDTO userinf);
}