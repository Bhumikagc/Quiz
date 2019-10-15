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
 * Servlet implementation class UpdateProfileServlet
 */
@WebServlet("/UpdateUserPwdServlet")
public class UpdateUserPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		int userId = (int)(session.getAttribute("id"));
		String password = request.getParameter("password");
		System.out.println(userId);
		
		UserService service = new UserServiceImpl();
		int status = service.updateUserPwd(userId, password);
		
		if(password != null) {
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		} else {
			request.setAttribute("w", "Sorry, Profile not Updated");
			request.getRequestDispatcher("updateuserpwd.jsp").forward(request, response);
		}
	}

}
