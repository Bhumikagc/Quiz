package com.hexaware.model.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hexaware.model.beans.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public int store(User user) {
		int status = 0;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "INSERT INTO user_details values(?, ?, ?,?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getUserId() );
			pstmt.setString(3, user.getPassword());
			pstmt.setDate(4, Date.valueOf(user.getDate()));
			status = pstmt.executeUpdate();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public User login(String userId, String password) {
		User user = null;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "SELECT * FROM user_details where userId = ? and  password=?";
			PreparedStatement pstmt = con.prepareStatement(query);			
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				 user = new User(rs.getString(1), rs.getString(2), rs.getString(3), null);
				 user.setDate(rs.getDate(4).toLocalDate());
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

}
