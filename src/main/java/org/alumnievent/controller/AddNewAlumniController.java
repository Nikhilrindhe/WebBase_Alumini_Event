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

public class AddNewAlumniController extends HttpServlet {

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
		String gender = request.getParameter("gender");
		String password=request.getParameter("password");
		int passoutyear = Integer.parseInt(request.getParameter("passoutyear"));
		int CollegeId = Integer.parseInt(request.getParameter("cId"));
		int branchId=Integer.parseInt(request.getParameter("branchId")) ;
		AlumniModel aModel = new AlumniModel();
		aModel.setAlumniName(name);
		aModel.setAlumniEmail(email);
		aModel.setAlumniContact(contact);
		aModel.setAlumniAddress(address);
		aModel.setAlumniGender(gender);
		aModel.setAlumniPassoutYear(passoutyear);
		aModel.setAlumniPassword(password);
		aModel.setBranchId(branchId);
		aModel.setCollegeId(CollegeId);
		
		AlumniService alumniService = new AlumniServiceImpl();
		boolean b = alumniService.isRegisteredNewAlumni(aModel);
		if(b)
		{
			RequestDispatcher r = request.getRequestDispatcher("AlumniInfo.jsp");
			r.include(request, response);
		}else {
			RequestDispatcher r = request.getRequestDispatcher("AlumniInfo.jsp");
			r.include(request, response);
		}
		
	}

}
