package com.hexaware.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hexaware.model.beans.User;
import com.hexaware.model.business.UserService;
import com.hexaware.model.business.UserServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int userId = Integer.parseInt(request.getParameter("userId"));
		String password = request.getParameter("password");
		UserService service = new UserServiceImpl();
		User user = service.login(userId, password);
		
		HttpSession session = request.getSession();
		
		
		if(user != null) {
			session.setAttribute("u", user);
			session.setAttribute("id", user.getUserId());
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		} else {
			request.setAttribute("w", "Sorry, Invalid Credentials");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}

	}

}
