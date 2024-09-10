  <%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%>                       
                         <div class="row">
                            <div class="col-12">
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight">
                                            <th scope="col">#</th>
                                            <th scope="col">Event Name</th>
                                            <th scope="col">Branch Name</th>
                                            <th scope="col">Event Venue</th>
                                            <th scope="col">Event Description</th>
                                             <th scope="col">Event Date</th>
                                       </tr>
                                    </thead>
                                    <tbody>

          <%
//           int collegeId = Integer.parseInt(request.getParameter("collegeid").toString()); 
          
          int OrganizerId = Integer.parseInt(session.getAttribute("organizerId").toString());
          String Search=request.getParameter("k");
          int collegeId=Integer.parseInt(request.getParameter("collegeid"));
         
          EventService eServ=new  EventServiceImpl();
          List <EventModel> list=eServ.SearchOrganizerEvents(collegeId, OrganizerId, Search);
		int count=0;
		for(EventModel model:list)
		{
	    %>	
	    <tr>
	      <td><%=++count%></td>
	     <td><%=model.getEventName() %></td>
	          <%
	          BranchService bService=new BranchServiceImpl();
	          int branchId=model.getBranchId();
	          String BranchName=bService.getBranchNameById(branchId, collegeId);
	          %>
	     <td><%=BranchName%></td>  
	     <td><%=model.getVenue() %></td>
	     <td><%=model.getDescription() %></td>
	     <td><%=model.getEventDate() %></td>
       <td><a href="UpdateCollegeEvents.jsp?eventid=<%=model.getEventId()%>&collegeid=<%=collegeId%>">Update Event</a></td>
	    <td><a href="deleteevent?eventid=<%=model.getEventId()%>&collegeId=<%=collegeId%>">Delete Event</a></td>
	     </tr>
	    <% 
		}
		%>
                                    </tbody>
                                </table>
                            </div>
                        </div>