package com.fil.thinkFIL.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fil.thinkFIL.repoInterfaces.UserRepoInterface;
@Component
public class UserAuthenticationImpl implements UserAuthentication {
	
	@Autowired
	private UserRepoInterface userRepo;
	
	@Override
	public boolean checkUnregisteredUser(String corpId) {
		if(userRepo.findByUserName(corpId).get()==null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String passwordEncryption(String password) {
		return password;
	}

	@Override
	public boolean checkValidUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkCredentials(int id, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean passwordValidation(String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
