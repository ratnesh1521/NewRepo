package com.ratnesh.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ratnesh.services.UserService;

public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		RequestDispatcher reqDispatcher = null;
		UserService userService = new UserService();
		String status = userService.checkLogin(uname, upwd);
		if(status.equals("success")){
			reqDispatcher = request.getRequestDispatcher("success.html");
			reqDispatcher.forward(request, response);
		}else{
			reqDispatcher = request.getRequestDispatcher("failure.html");
			reqDispatcher.forward(request, response);
		}
	}

}
