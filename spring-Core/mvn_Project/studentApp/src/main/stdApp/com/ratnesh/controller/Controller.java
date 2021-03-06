package com.ratnesh.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ratnesh.dtos.StudentTo;
import com.ratnesh.factories.StudentServiceFactory;
import com.ratnesh.services.StudentService;


public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String status = "";
		String action = request.getParameter("action");
		StudentService stdService = null;
		RequestDispatcher reqDispatcher = null;
		
			
		
			if(action.equalsIgnoreCase("ADD")){
			stdService = StudentServiceFactory.getStudentService();
			StudentTo sto = new StudentTo();
			sto.setSid(request.getParameter("sid"));
			sto.setSname(request.getParameter("sname"));
			sto.setSaddr(request.getParameter("saddr"));
			status = stdService.add(sto);
			
			if(status.equals("success")){
				reqDispatcher = request.getRequestDispatcher("./success.html");
				reqDispatcher.forward(request, response);
			}
			if(status.equals("failure")){
				reqDispatcher = request.getRequestDispatcher("./failure.html");
				reqDispatcher.forward(request, response);
			}
			if(status.equals("existed")){
				reqDispatcher = request.getRequestDispatcher("./existed.html");
				reqDispatcher.forward(request, response);
			}
		}
			
			if(action.equalsIgnoreCase("Search")){
				String sid = request.getParameter("sid");
				stdService = StudentServiceFactory.getStudentService();
				StudentTo sto = stdService.search(sid);
		
				if(sto==null){
					reqDispatcher = request.getRequestDispatcher("notexisted.html");
					reqDispatcher.forward(request, response);
				}else{
					request.setAttribute("sto", sto);
					reqDispatcher = request.getRequestDispatcher("display.jsp");
					reqDispatcher.forward(request, response);
				}
				
			}
			if(action.equalsIgnoreCase("update")){
				String sid = request.getParameter("sid");
				stdService = StudentServiceFactory.getStudentService();
				StudentTo sto = new StudentTo();
				status = stdService.update(sto);
				if(status.equals("success")){
					reqDispatcher = request.getRequestDispatcher("./success.html");
					reqDispatcher.forward(request, response);
				}
				if(status.equals("failure")){
					reqDispatcher = request.getRequestDispatcher("./failure.html");
					reqDispatcher.forward(request, response);
				}
				if(status.equals("notexisted")){
					reqDispatcher = request.getRequestDispatcher("./notexisted.html");
					reqDispatcher.forward(request, response);
				}
			}
			if(action.equalsIgnoreCase("Delete")){
				String sid = request.getParameter("sid");
				stdService = StudentServiceFactory.getStudentService();
				status = stdService.delete(sid);
				RequestDispatcher reqDspt = null;
				if(status.equals("success")){
					reqDspt = request.getRequestDispatcher("./success.html");
					reqDspt.forward(request, response);
				}
				if(status.equals("failure")){
					reqDspt = request.getRequestDispatcher("./failure.html");
					reqDspt.forward(request, response);
				}
				if(status.equals("notexisted")){
					reqDspt = request.getRequestDispatcher("./notexisted");
					reqDspt.forward(request, response);
				}
			}
	}

}
