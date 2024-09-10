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

public class GetFeedbackController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
	  String Email = request.getParameter("email").trim();
	  String AfeedBack=request.getParameter("feedback").trim();
	  int EventId = Integer.parseInt(request.getParameter("event").trim());
	  AlumniService aServ=new AlumniServiceImpl();
	  int AlumniId=aServ.getAlumniIdByEmail(Email);
	  EventService eServ=new EventServiceImpl();
	  int Ecoid=eServ.takeEcoIdByEventid(EventId);
	
	   
	  int result=eServ.giveFeedBack(AlumniId, Ecoid, AfeedBack);
	  if(result==1)
	  {
		  RequestDispatcher r = request.getRequestDispatcher("adminlogin");
			r.include(request, response);
		out.print("<h1>FeedBack Submitted</h1>");
	  }
	  else
	  {
		  RequestDispatcher r = request.getRequestDispatcher("adminlogin");
			r.include(request, response);
		out.print("<h1>Some Problem is there..</h1>");  
	  }
	  
	}

}
