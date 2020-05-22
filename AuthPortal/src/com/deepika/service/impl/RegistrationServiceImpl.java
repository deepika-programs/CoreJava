package com.deepika.service.impl;

import com.deepika.dao.RegistrationDAO;
import com.deepika.dao.impl.RegistrationDAOImpl;
import com.deepika.dto.UserInfoDTO;
import com.deepika.service.RegistrationService;

public class RegistrationServiceImpl implements RegistrationService{
 
	RegistrationDAO regr=new RegistrationDAOImpl();
	
	public boolean register(UserInfoDTO userinf) {
		return regr.register(userinf);
	}
	
	

}
