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



public class AddNewOragnizerController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String Pass = request.getParameter("password");
		OrganizerModel oModel = new OrganizerModel();
		oModel.setOrganizerName(name);
		oModel.setOrganizerEmail(email);
		oModel.setOrganizerContact(contact);
		oModel.setOrganizerAddress(address);
		oModel.setOrganizerPassword(Pass);
		
	     OrganizerService oServ=new OrganizerServiceImpl();
		boolean b = oServ.isRegisteredNewOragnizer(oModel);
		if(b)
		{
			RequestDispatcher r = request.getRequestDispatcher("OrganizerInfo.jsp");
			r.include(request, response);
			out.print("<h1>Oragnizer Added Sucessfully..</h1>");
		}else {
			RequestDispatcher r = request.getRequestDispatcher("OrganizerInfo.jsp");
			r.include(request, response);
			out.print("<h1>Oragnizer Not Added Sucessfully..</h1>");
		}
	}

}
