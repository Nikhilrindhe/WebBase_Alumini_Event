package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import org.alumnievent.service.*;
public class DeleteEventController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String eventId=request.getParameter("eventid");
		String cid=request.getParameter("collegeId");
		int collegeId=Integer.parseInt(cid);
	    System.out.println("collegeid is"+collegeId);
		int Eventid=Integer.parseInt(eventId);
		EventService eService=new EventServiceImpl();
		int value=eService.isDeleteEvent(Eventid);
		if(value==1)
		{
			//response.sendRedirect("ManegeEventsOfCollege.jsp");
			out.println("Event Deleted Sucessfully");
			int collegeid=collegeId;
			String valueToSend = String.valueOf(collegeid);	
			String url = "ManegeEventsOfCollege.jsp?collegeid=" + URLEncoder.encode(valueToSend, "UTF-8");
			response.sendRedirect(url);

//			RequestDispatcher r=request.getRequestDispatcher("ManegeEventsOfCollege.jsp");
//			r.forward(request, response);
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
