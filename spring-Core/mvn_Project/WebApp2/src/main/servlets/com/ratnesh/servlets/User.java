package com.ratnesh.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String uname = request.getParameter("uname");
		String upwd = request.getParameter("upwd");
		
		RequestDispatcher reqDispatcher = null;
		if(uname.equals("ratnesh") && upwd.equals("ratnesh")){
			reqDispatcher = request.getRequestDispatcher("sucess.html");
			reqDispatcher.forward(request, response);
		}else{
			reqDispatcher = request.getRequestDispatcher("failure.html");
			reqDispatcher.forward(request, response);
		}
	}

}
