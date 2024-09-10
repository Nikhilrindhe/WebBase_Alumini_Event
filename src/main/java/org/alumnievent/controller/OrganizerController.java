package org.alumnievent.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import org.alumnievent.model.*;
import org.alumnievent.service.*;
public class OrganizerController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  response.setContentType("text/html");
	   PrintWriter out=response.getWriter();
	    int CollegeId=Integer.parseInt(request.getParameter("collegeid").toString());
	    int OrganizerId=Integer.parseInt(request.getParameter("organizerid").toString());
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
	    boolean a=eService.addEvent(model,CollegeId,OrganizerId,branchId);
	    if(a)
	    {
	    	out.println("<h2>Event Organized Sucessfully</h2>");
	    }
	    else {
	    	out.println("<h2>Some Problem is There.......</h2>");
	    }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
