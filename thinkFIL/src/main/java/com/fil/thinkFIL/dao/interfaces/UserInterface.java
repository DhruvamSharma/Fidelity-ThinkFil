package com.fil.thinkFIL.dao.interfaces;

import com.fil.thinkFIL.dao.models.User;

public interface UserInterface {
	public User findUserByCorpId(int corpId);
	public void registerNewUser(User user);
}
