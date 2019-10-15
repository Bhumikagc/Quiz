package com.hexaware.model.dao;

import com.hexaware.model.beans.User;

public interface UserDAO {
	
	public int store(User user);
	public User login(int userId, String password);
	public User findById(int userId);
	public int updateUserPwd(int userId, String password);
	public int updateUserMNo(int userId, String mobileNo);
	

}
