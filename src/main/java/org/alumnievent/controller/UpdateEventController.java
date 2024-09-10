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
import java.sql.Date;

import org.alumnievent.model.EventModel;
import org.alumnievent.service.EventService;
import org.alumnievent.service.EventServiceImpl;

public class UpdateEventController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();

		String cid=request.getParameter("collegeId");
		int collegeId=Integer.parseInt(cid);
		
		//int CollegeId=Integer.parseInt(request.getParameter("collegeid").toString());
	    int eventId=Integer.parseInt(request.getParameter("eventid").toString());
		//String collegeId=request.getParameter("collegeid");
     	//String eventId=request.getParameter("eventid");
		
		//System.out.println("college id is"+collegeId);
//		
		
//		 
		//System.out.println("event id is"+eventId);
//		
//		int Eventid=Integer.parseInt(collegeId);
//		int collegeid=Integer.parseInt(eventId);
//		
		
	    int branchId=Integer.parseInt(request.getParameter("branchId")) ;
	    String eventName=request.getParameter("eventName");
	    String venue=request.getParameter("venue");
	    String description=request.getParameter("description");
	    String date=request.getParameter("eventDate");
	    Date eventDate=Date.valueOf(date);
	    
	    EventModel model=new EventModel();
	    model.setBranchId(branchId);
	    model.setEventName(eventName);
	    model.setDescription(description);
	    model.setVenue(venue);
	    model.setEventDate(eventDate);
		EventService eService=new EventServiceImpl();
		int value=eService.isUpdateEvent(eventId,model);
		if(value==1)
		{
			//response.sendRedirect("ManegeEventsOfCollege.jsp");
//			out.println("Event Updated Sucessfully");
//			RequestDispatcher r=request.getRequestDispatcher("ManegeEventsOfCollege.jsp");
//			r.forward(request, response);
			out.println("Event Deleted Sucessfully");
			int collegeid=collegeId;
			String valueToSend = String.valueOf(collegeid);
			String url = "ManegeEventsOfCollege.jsp?collegeid=" + URLEncoder.encode(valueToSend, "UTF-8");
			response.sendRedirect(url);
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
