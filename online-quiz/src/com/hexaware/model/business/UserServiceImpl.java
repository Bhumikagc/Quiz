package com.hexaware.model.business;

import com.hexaware.ObjectFactory;
import com.hexaware.model.beans.User;
import com.hexaware.model.dao.UserDAO;

public class UserServiceImpl implements UserService{

	private UserDAO dao;
	public UserServiceImpl() {
		//dao = new UserDAOJdbcImpl(); // you must add a factory pattern here instead
										// of you creating object.
		ObjectFactory factory = new ObjectFactory();
		dao = (UserDAO) factory.createObject("dao");
		
	}
	
	
	@Override
	public int store(User user) {
		
		return dao.store(user);
	}	
	
	@Override
	public User login(String userId, String password) {
		
		return dao.login(userId, password);
	}


	@Override
	public User findById(int userId) {
		
		return dao.findById(userId);
	}
}
