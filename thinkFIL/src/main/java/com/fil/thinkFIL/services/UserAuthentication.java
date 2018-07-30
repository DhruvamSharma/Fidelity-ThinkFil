package com.fil.thinkFIL.services;

import org.springframework.stereotype.Service;

@Service
public interface UserAuthentication {
	public boolean checkUnregisteredUser(String corpId);
	public String passwordEncryption(String password);
	public boolean checkValidUser(int id);
	public boolean checkCredentials(int id,String password);
	public boolean passwordValidation(String password);
}
