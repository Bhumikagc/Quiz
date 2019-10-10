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
			String query = "INSERT INTO user_details values(?, ?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, user.getUserId());
			pstmt.setString(2, user.getName());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getMobileNo());			
			pstmt.setDate(5, Date.valueOf(user.getDate()));
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
			String query = "SELECT * FROM user_details where user_Id = ? and  user_password = ?";
			PreparedStatement pstmt = con.prepareStatement(query);			
			pstmt.setString(1, userId);
			pstmt.setString(2, password);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				 user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), null);
				 user.setDate(rs.getDate(5).toLocalDate());
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User findById(int userId) {
		User user = null;
		try {
			Connection con = DBUtility.establishConnection();
			String query = "SELECT * FROM user_details WHERE user_Id= ?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userId);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				 user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), null);
				 user.setDate(rs.getDate(5).toLocalDate());
			}
			rs.close();
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
}
		return user;
	}
}
