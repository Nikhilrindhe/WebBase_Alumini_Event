<%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%>

                       <div class="row">
                            <div class="col-12">
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight">
                                            <th scope="col">#</th>
                                            <th scope="col">College Name</th>
                                            <th scope="col">College Email</th>
                                            <th scope="col">College Contact</th>
                                             <th scope="col">College Address</th>
                                       </tr>
                                    </thead>
                                    <tbody>

          <%
         
          String Search=request.getParameter("s");
          System.out.println(Search);
          int OrganizerId = Integer.parseInt(session.getAttribute("organizerId").toString());
          OrganizerService service=new  OrganizerServiceImpl();
          List <CollegeModel> list= service.getOrganizerCollegeSearch(OrganizerId, Search);
		
		int count=0;
		
		for(CollegeModel model:list)
		{
	    %>	
	      <td><%=++count%></td>
	     <td><%=model.getCollegeName() %></td>
	     <td><%=model.getCollegeEmail() %></td>
	     <td><%=model.getCollegeContact() %></td>
	     <td><%=model.getCollegeAddress() %></td>
	    <% 
	    int collegeid= model.getCollegeId();
	    %>
     <td><a href="ManegeEventsOfCollege.jsp?collegeid=<%=collegeid%>">Manage Events</a></td>
	     </tr>
	    <% 
		}
		%>
                </tbody>
                 </table>
          </div>
         </div>
                       