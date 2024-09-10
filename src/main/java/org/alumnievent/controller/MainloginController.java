package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import org.alumnievent.service.*;
public class MainloginController extends HttpServlet {
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		CollegeService cService=new CollegeServiceImpl();
		int result=cService.verifyUser(email, password);
		
		if(result>=1 && result <=100)
		{
			
			
			HttpSession session = request.getSession(true);
			session.setAttribute("organizerId", result);
			RequestDispatcher r = request.getRequestDispatcher("Organizerpage.jsp");
			r.include(request, response);
		}
		else if(result>=101 && result<=200)
		{
			out.println("<h1>College Login Sucessful....</h1>");
			HttpSession session = request.getSession(true);
			session.setAttribute("collegeId", result);
			RequestDispatcher r=request.getRequestDispatcher("College.jsp");
			r.include(request, response);
			
		}
		else if(result>=201)
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("alumniId", result);
			RequestDispatcher r=request.getRequestDispatcher("Alumni.jsp");
			r.include(request, response);
		}
		else {
		
			RequestDispatcher r=request.getRequestDispatcher("LoginPage.jsp");
			out.println("<h1>Invalid username Or Password</h1>");
			r.include(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
