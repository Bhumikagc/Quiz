package com.hexaware.model.dao;

import com.hexaware.model.beans.User;

public interface UserDAO {
	
	public int store(User user);
	public User login(String userId, String password);
	public User findById(int userId);
	
	

}
