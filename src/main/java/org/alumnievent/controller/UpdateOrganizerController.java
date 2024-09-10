package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import org.alumnievent.service.*;
public class UpdateOrganizerController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int organizerId=Integer.parseInt(request.getParameter("oraId"));
		String Contact=request.getParameter("contact");
		String Address=request.getParameter("Address");
		OrganizerService oService=new OrganizerServiceImpl();
		int value=oService.isUpdateOrganizer(organizerId, Contact, Address);
		if(value==1)
		{
			out.println("<h1>Profile Updated Sucessfully</h1>");
			RequestDispatcher r =request.getRequestDispatcher("ViewOrganizerProfile.jsp");
    		r.forward(request, response);

		}
		else {
			out.println("<h1>Some Problem is there</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
