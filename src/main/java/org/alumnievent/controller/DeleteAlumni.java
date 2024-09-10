package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



import org.alumnievent.service.AlumniService;
import org.alumnievent.service.AlumniServiceImpl;

public class DeleteAlumni extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int aId = Integer.parseInt(request.getParameter("AlumniId"));
		
		AlumniService aService = new AlumniServiceImpl();
		boolean b=aService.isDeleteAlumniById(aId);
		if(b)
		{
			
			RequestDispatcher r =request.getRequestDispatcher("AlumniInfo.jsp");
			r.forward(request, response);
			out.print("Deleted");
		}else {
			RequestDispatcher r =request.getRequestDispatcher("AlumniInfo.jsp");
			r.forward(request, response);
			out.println("<h1>Some Problem is There</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
