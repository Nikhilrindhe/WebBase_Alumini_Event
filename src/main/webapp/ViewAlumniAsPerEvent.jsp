<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" --%>
<%--     pageEncoding="UTF-8"%> --%>
<!-- <!DOCTYPE html> -->
<!-- <html> -->
<!-- <head> -->
<!-- <meta charset="UTF-8"> -->
<!-- <title>Insert title here</title> -->
<!-- </head> -->
<!-- <body> -->

<!-- </body> -->
<!-- </html> -->
<%@include file="AdminMain.jsp"%>
<style>
.mb-3{
margin-top:50px;
}
</style>
<script type="text/javascript">
 function viewEvent()
 {
	 var BranchId=document.getElementById("branch").value;
	 var CollegeId=document.getElementById("cId").value;
	 let xhttp = new XMLHttpRequest();
		xhttp.onreadystatechange = function()
		{
			if(this.readyState == 4 && this.status ==200)
				{
				document.getElementById("event").innerHTML=this.responseText;
				}
			
		};
		xhttp.open("GET","SearchCollegeEvent.jsp?BranchId="+BranchId+"&CollegeId="+CollegeId,true);
		xhttp.send();
	   
 }
</script>
<% int cid=Integer.parseInt(session.getAttribute("collegeId").toString()); %>
<main class="content px-3 py-4">
   <div id="view">
<input type="hidden" id='cId' value='<%=cid%>'>
					<div class="form-group" style="display: inline-block;">
						<label for="branch">Branch Name:</label> 
						<select id="branch" name="branch" style="width: 300px; height: 40px;" onchange="viewEvent()">
							<%
							BranchService bServ=new BranchServiceImpl();
							List<BranchModel> b=bServ.getCollegeWiseBranch(cid);	
							for (BranchModel bm : b) {
							%>
							<option value="<%= bm.getBranchId()%>"><%=bm.getBranchName()%></option>		
							<%
							}
							%>
						</select>
						<br><br>
					</div>
					
      </div>

	<div class="container-fluid">
	   <div id="event">
		<div class="mb-3">
<%-- 			<h3 class="fw-bold fs-4 mb-3"><%=cModel.getCollegeName()%></h3> --%>
			<div class="row">
				<div class="col-12">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">#</th>
								<th scope="col">Name</th>
								<th scope="col">Venue</th>
								<th scope="col">Date</th>
								<th scope="col">Description</th>
								<th scope="col">Sort Alumni</th>
							    <th scope="col">Present Alumni</th>
							    <th scope="col">Absent Alumni</th>
							</tr>
						</thead>
						<tbody>
						
						 <%	 	
          				EventService eServ=new  EventServiceImpl();
          				List <EventModel> list=eServ.ShowEventsAsPerCollege(cid);
						int count=0;
						for(EventModel model:list)
						{
	    				%>	
	     				 <td><%=++count%></td>
	     				<td><%=model.getEventName() %></td>
	     				<td><%=model.getVenue() %></td>
	     				<td><%=model.getEventDate() %></td>
	     				<td><%=model.getDescription() %></td>
	     				<td><a href="SortAlumniByYear.jsp?EventId=<%=model.getEventId()%>">Sorted</a></td>
	     				<td><a href="ViewPresentAlumni.jsp?EventId=<%=model.getEventId()%>">Present</a></td>
	     				<td><a href="ViewAbsentAlumni.jsp?EventId=<%=model.getEventId()%>">Absent</a></td>
<%-- 	     				<td><a href="ShowCollegeFeedBack.jsp?EventId=<%=model.getEventId()%>">Show FeedBack </a></td> --%>
<%-- 	     				<td><a href="ViewMostSeniorAlumni.jsp?EventId=<%=model.getEventId()%>">Senior Alumni</a></td> --%>
<%-- 	     				<td><a href="ShowCollegeFeedBack.jsp?EventId=<%=model.getEventId()%>">Show FeedBack </a></td> --%>

	     	</tr>
	    <% 
		}
		%>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		
		</div>
		
	</div>
</main>

</div>
</div>
</div>
</body>
</html>