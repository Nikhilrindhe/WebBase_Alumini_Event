package org.alumnievent.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


import org.alumnievent.model.BranchModel;
import org.alumnievent.service.BranchService;
import org.alumnievent.service.BranchServiceImpl;


public class AddNewBranchController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("branchName");
		int CollegeId = Integer.parseInt(request.getParameter("cId"));
		BranchModel bModel = new BranchModel();
		bModel.setBranchName(name);
		BranchService bService = new BranchServiceImpl();
		boolean b = bService.isAddNewBranch(bModel,CollegeId);
		if(b)
		{
			RequestDispatcher r = request.getRequestDispatcher("AlumniInfo.jsp");
			r.include(request, response);
			out.print("<h1>Branch Added Sucessfully..</h1>");
		}else {
			RequestDispatcher r = request.getRequestDispatcher("AlumniInfo.jsp");
			r.include(request, response);
			out.print("<h1>Branch Not Added Sucessfully..</h1>");
		}
		
	}

}
