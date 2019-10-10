package com.hexaware.model.beans;

import java.time.LocalDate;

public class User {
	private int userId;
	private String name;
	private String password;
	private String mobileNo;
	private LocalDate date;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
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
	
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	

	
	public User(int userId, String name, String password, String mobileNo, LocalDate date) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.mobileNo = mobileNo;
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
