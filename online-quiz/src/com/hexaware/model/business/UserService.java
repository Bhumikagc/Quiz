package com.hexaware.model.business;

import com.hexaware.model.beans.User;

public interface UserService {
	
	public int store(User user);
	public User login(String userId, String password);
	public User findById(int userId);

}
