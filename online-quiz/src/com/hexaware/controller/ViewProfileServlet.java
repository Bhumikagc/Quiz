package com.hexaware.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hexaware.model.beans.User;
import com.hexaware.model.business.UserService;
import com.hexaware.model.business.UserServiceImpl;

/**
 * Servlet implementation class ViewProfileServlet
 */
@WebServlet("/ViewProfileServlet")
public class ViewProfileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("View profile");
		//int userId = Integer.parseInt(request.getParameter("userId"));
		request.getRequestDispatcher("viewprofile.jsp").forward(request, response);
		
	}

}
