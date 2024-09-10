package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class UpdateOrganizerByCollege extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int oId = Integer.parseInt(request.getParameter("OrganizerId"));
		RequestDispatcher r = request.getRequestDispatcher("AdminMain.jsp");
		r.include(request, response);
		out.println("<center>");
		out.println("<div class='col-6 py-3 mt-5 d-flex align-item-center justify-content-centre'>");
		out.println("<div class='border border-3 p-4'>");
		out.println("<form class='formarea' name='frm' action='finaloragnizer' method='Post'>");
		
		out.println("<input type='hidden' name='oId' value='"+oId+"' class='control'/><br><br>");
		out.println("<label class=\"form-label ms-5\"  for=\"firstName\">Email</label> <br>");
		out.println("<input type='text' name='email' value='' class='control ms-5'/><br><br>");
		out.println("<label class=\"form-label ms-5\" for=\"firstName\">Contact</label> <br>");
		out.println("<input type='text' name='contact' value='' class='control ms-5'/><br><br>");
		out.println("<label class=\"form-label ms-5\" for=\"firstName\">Address</label> <br>");
		out.println("<input type='text' name='address' value='' class='control ms-5'/><br><br>");
		out.println("<input type='submit' name='s' value='Update' class='control btn btn-outline-primary'/><br><br>");
		out.println("</div>");
		out.println("</form>");
		out.println("</center>");
		out.println("</div></div></div>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
