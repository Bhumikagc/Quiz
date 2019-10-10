package com.hexaware.controller;

import java.io.IOException;
import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hexaware.ObjectFactory;
import com.hexaware.model.beans.User;
import com.hexaware.model.business.UserService;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		LocalDate date = LocalDate.parse(request.getParameter("dob"));
		User user = new User(Integer.parseInt(request.getParameter("userId")), request.getParameter("name"), request.getParameter("password"), request.getParameter("number"), date);
		user.setDate(date);		
		
		//UserService service = new UserServiceImpl(); //use factory pattern
		ObjectFactory factory = new ObjectFactory();
		UserService service = (UserService) factory.createObject("service");
		int status = service.store(user);
		
		if(status>0) {
			request.setAttribute("msg", "Stored Successfully");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "Sorry, User Not Stored");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

}
