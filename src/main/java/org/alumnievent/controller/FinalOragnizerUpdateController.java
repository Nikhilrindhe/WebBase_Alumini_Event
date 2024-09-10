package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.alumnievent.model.OrganizerModel;
import org.alumnievent.service.*;

public class FinalOragnizerUpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		int Id = Integer.parseInt(request.getParameter("oId"));
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		OrganizerModel model = new OrganizerModel();
		model.setOrganizerEmail(email);
		model.setOrganizerId(Id);
		model.setOrganizerContact(contact);
		model.setOrganizerAddress(address);
		
		OrganizerService oService = new OrganizerServiceImpl();
		boolean b = oService.isUpdateOragnizerById(model);
		if(b)
		{
			RequestDispatcher r = request.getRequestDispatcher("OrganizerInfo.jsp");
			r.include(request, response);
			out.print("<h1>Oragnizer Added Sucessfully..</h1>");
		}else {
			RequestDispatcher r = request.getRequestDispatcher("OrganizerInfo.jsp");
			r.include(request, response);
			out.print("<h1>Oragnizer Added Sucessfully..</h1>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
