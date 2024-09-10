<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--     <%@include file="AdminMain.jsp"%> --%>
 <%@page import= "org.alumnievent.service.*, org.alumnievent.model.* , java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
  int BranchId=Integer.parseInt(request.getParameter("BranchId"));
  int CollegeId=Integer.parseInt(request.getParameter("CollegeId"));
 
%>
<%
 System.out.println("Branchid is"+BranchId);
System.out.println("collegeId is"+CollegeId);
%>
<div class="mb-3">
<%-- 			<h3 class="fw-bold fs-4 mb-3"><%=cModel.getCollegeName()%></h3> --%>
			<div class="row">
				<div class="col-12">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Name</th>
<!-- 								<th scope="col">Branch</th> -->
								<th scope="col">Venue</th>
								<th scope="col">Date</th>
								<th scope="col">Description</th>
							    <th scope="col">FeedBack</th>
							</tr>
						</thead>
						<tbody>
						
						 <%	 	
          				EventService eServ=new  EventServiceImpl();
          				List <EventModel> list=eServ.showEventsOfBranchCollege(BranchId,CollegeId);
						int count=0;
						for(EventModel model:list)
						{
	    				%>	
	     				 <td><%=++count%></td>
	     				<td><%=model.getEventName() %></td>
	     				<td><%=model.getVenue() %></td>
	     				<td><%=model.getEventDate() %></td>
	     				<td><%=model.getDescription() %></td>
	     				<td><a href="ShowCollegeFeedBack.jsp?EventId=<%=model.getEventId()%>">Show FeedBack </a></td>		
	     	            </tr>
	    <% 
		}
		%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
</body>
</html>