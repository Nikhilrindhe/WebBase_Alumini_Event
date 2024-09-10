<%-- <%@include file="AdminMain.jsp"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@page import= "org.alumnievent.service.*, org.alumnievent.model.* , java.util.*" %>
<%
  // int aid=Integer.parseInt(request.getParameter("aid"));
   int bid=Integer.parseInt(request.getParameter("search"));
   int Id=Integer.parseInt(request.getParameter("cid"));
 
%>
 <% 
// int Id = cModel.getCollegeId(); 
 %> 
             	
					<div class="mt-4"
						style="border: 2px solid black; border-radius: 20px;">
						<table class="table mt-4 my-3 text-light text-centre">
							<thead>
								<tr>
									<th scope="col">Sr.No</th>
									<th scope="col">NAME</th>

								</tr>
							</thead>
							<tbody>
								<%
								AlumniService alumniService = new AlumniServiceImpl();
								List<AlumniModel> l = alumniService.getAlumniByEvent(Id,bid);
								int count = 0;
								if(l.size()>0)
								{
								for (AlumniModel aModel : l) {
									 
								%>
								<tr>
									<th scope="row"><%=++count%></th>
									<td><%=aModel.getAlumniName()%></td>
<%-- 									<td><%=aModel.getAlumniId() %></td> --%>
									
									<td><button class="btn btn-danger" id="b" onclick="takeAttendance('<%=aModel.getAlumniId() %>',this)">Attendance</button></td>
									
<%-- 									<td><button id="alumniid" class=btn btn-Denger value='<%=aModel.getAlumniId() %>' onclick=takeAttendance()>Attendance</button></td>  --%>
								</tr>
								<%
								}
								}
								else{
									out.println("<h1>Alumni is Not Present</h1>");
								}
								%>
							</tbody>
						</table>
					</div>
                      
