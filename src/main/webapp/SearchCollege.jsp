 <%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%> 
     <div class="row">
				<div class="col-12">
					<table class="table table-striped">
						<thead>
							<tr class="highlight">
								<th scope="col">#</th>
								<th scope="col">College Name</th>
								<th scope="col">College Email</th>
								<th scope="col">College Address</th>
								<th scope="col">College Contact</th>
							</tr>
						</thead>
						<tbody>

						
     <%  
      String search=request.getParameter("n");
         System.out.println("search is "+search); 
         OrganizerService service=new  OrganizerServiceImpl(); 
        List <CollegeModel> list=service.getAllCollegeSearch(search);  
       int count=0; 
    	for(CollegeModel model:list) 
   	    {  
      %>             
     <td><%=++count%></td>
     <td><%=model.getCollegeName()%></td>
     <td><%=model.getCollegeEmail()%></td>
     <td><%=model.getCollegeAddress()%></td>
     <td><%=model.getCollegeContact()%></td>
     <td><a href="ViewCollegeEvent.jsp?collegeid=<%=model.getCollegeId()%>">Show Events</a></td>
     <td><a href="OrganizeEvent.jsp?collegeid=<%=model.getCollegeId()%>">Organize Event</a></td>
     <tr>
   <% 
   }
   %>
  </tbody>
</table>
</div>
</div>