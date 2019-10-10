package com.hexaware.model.beans;

import java.time.LocalDate;

public class User {
	private String userId;
	private String name;
	private String password;
	private LocalDate date;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
	public User(String userId, String name, String password, LocalDate date) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.date = date;
	}
	public User() {
		super();
		
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password=" + password + ", date=" + date + "]";
	}
	
	
	
	

}
