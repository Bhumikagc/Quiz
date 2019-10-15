package com.hexaware.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hexaware.model.business.UserService;
import com.hexaware.model.business.UserServiceImpl;

/**
 * Servlet implementation class UpdateUserMNoServlet
 */
@WebServlet("/UpdateUserMNoServlet")
public class UpdateUserMNoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		int userId = (int)(session.getAttribute("id"));
		String mobileNo = request.getParameter("mobileNo");
		System.out.println(mobileNo);
		
		UserService service = new UserServiceImpl();
		int status = service.updateUserMNo(userId, mobileNo);
		
		if(mobileNo != null) {
			request.getRequestDispatcher("homepage.jsp").forward(request, response);
		} else {
			request.setAttribute("w", "Sorry, Mobile No not Updated");
			request.getRequestDispatcher("updateusermno.jsp").forward(request, response);
		}
	}

}
