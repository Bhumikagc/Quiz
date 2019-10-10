package com.hexaware.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility {
	public static Connection establishConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/domaindb",
					"root", "Password123");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void main(String[] args) {
		Connection con = establishConnection();
		System.out.println(con);
	}

}
