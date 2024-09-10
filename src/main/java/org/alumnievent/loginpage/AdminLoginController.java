package org.alumnievent.loginpage;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;



import org.alumnievent.service.CollegeService;
import org.alumnievent.service.CollegeServiceImpl;

public class AdminLoginController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
			String email = request.getParameter("email");
			String pass = request.getParameter("password");
		CollegeService collService = new CollegeServiceImpl();
		int result = collService.verifyUser(email, pass);
		if(result!=0)
		{
			if(result<=100)
			{
				HttpSession session = request.getSession(true);
				session.setAttribute("organizerId", result);
				session.setAttribute("email", email);
				RequestDispatcher r = request.getRequestDispatcher("Organizerpage.jsp");
				r.include(request, response);
			}else if(result<=200){
				HttpSession session = request.getSession(true);
				session.setAttribute("collegeId", result);
				session.setAttribute("email", email);
				RequestDispatcher r = request.getRequestDispatcher("AdminMain.jsp");
				r.include(request, response);
			}else {
				HttpSession session = request.getSession(true);
				session.setAttribute("alumniId", result);
				session.setAttribute("email", email);
				RequestDispatcher r = request.getRequestDispatcher("Alumni.jsp");
				r.include(request, response);
			}
		}
	}

}
