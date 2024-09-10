package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import org.alumnievent.model.AlumniModel;
import org.alumnievent.service.AlumniService;
import org.alumnievent.service.AlumniServiceImpl;

public class FinalAlumniUpdateController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		int Id = Integer.parseInt(request.getParameter("aId"));
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		
	//	System.out.println("email is"+email);
	//	System.out.println("contact is"+contact);
	//	System.out.println("address is"+address);
		
		AlumniModel model = new AlumniModel();
		model.setAlumniEmail(email);
		model.setAlumniId(Id);
		model.setAlumniContact(contact);
		model.setAlumniAddress(address);
		
		 AlumniService aService = new AlumniServiceImpl(); 
		 boolean b=aService.isUpdateAlumniById(model); 
		  if(b){  
			  RequestDispatcher r =request.getRequestDispatcher("AlumniInfo.jsp"); 
		   r.include(request, response); 
		   out.print("<h1>Alumni Updated Sucessfully..</h1>"); 
		   }else {
		  RequestDispatcher r = request.getRequestDispatcher("AlumniInfo.jsp");
		  r.include(request, response); 
		  out.print("<h1>Some Problem is there..</h1>"); 
		  }
		 	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
