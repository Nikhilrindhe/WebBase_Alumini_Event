<%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%>

<%@include file="Organizerpage.jsp"%>
	
	 <main class="content px-3 py-4">
                <div class="container-fluid">
                    <div class="mb-3">
                        <h3 class="fw-bold fs-4 mb-3">Ongoing Events of College</h3>
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
          int collegeid = Integer.parseInt(request.getParameter("collegeid").toString()); 
          EventService eServ=new  EventServiceImpl();
          List <EventModel> list=eServ.ShowEventsAsPerCollege(collegeid);
		int count=0;
		for(EventModel model:list)
		{
	    %>	
	      <td><%=++count%></td>
	     <td><%=model.getEventName() %></td>
	          <%
	          BranchService bService=new BranchServiceImpl();
	          int branchId=model.getBranchId();
	          String BranchName=bService.getBranchNameById(branchId, collegeid);
	          %>
	     <td><%=BranchName%></td>  
	     <td><%=model.getVenue() %></td>
	     <td><%=model.getDescription() %></td>
	     <td><%=model.getEventDate() %></td>

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
            </main>
<!--             <footer class="footer mb-0"> -->
<!--                 <div class="container-fluid"> -->
<!--                     <div class="row text-body-secondary"> -->
<!--                         <div class="col-6 text-start "> -->
<!--                             <a class="text-body-secondary" href=" #"> -->
<!--                                 <strong>CodzSwod</strong> -->
<!--                             </a> -->
<!--                         </div> -->
<!--                         <div class="col-6 text-end text-body-secondary d-none d-md-block"> -->
<!--                             <ul class="list-inline mb-0"> -->
<!--                                 <li class="list-inline-item"> -->
<!--                                     <a class="text-body-secondary" href="https://collegedunia.com/contact-us">Contact</a> -->
<!--                                 </li> -->
<!--                                 <li class="list-inline-item"> -->
<!--                                     <a class="text-body-secondary" href="https://www.engg.dypvp.edu.in/">About Us</a> -->
<!--                                 </li> -->
<!--                                 <li class="list-inline-item"> -->
<!--                                     <a class="text-body-secondary" href="https://collegedunia.com/website-usage-policy">Terms & Conditions</a> -->
<!--                                 </li> -->
<!--                             </ul> -->
<!--                         </div> -->
<!--                     </div> -->
<!--                 </div> -->
<!--             </footer> -->
            </div>
            </div>
            </div>
</body>
</html>