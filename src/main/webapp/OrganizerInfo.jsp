<%@include file="AdminMain.jsp"%>
<%-- <%@page import="org.alumnievent.service.*,org.alumnievent.model.*;" %> --%>

	<div class="col-12 d-flex align-item-centre justify-content-centre mt-5">
		<div>
			<button type="button" class="btn btn-primary"><a href="AddOrganizer.jsp" style="color:white">Add Oragnizer</a></button>
		</div>
	</div>
	<table class="table mt-5 my-3">
  <thead>
    <tr>
      <th scope="col">Sr.No</th>
      <th scope="col">Organizer NAME</th>
       <th scope="col">EMAIL</th>
       <th scope="col">CONTACT</th>
       <th scope="col">ADDRESS</th>
       <th scope="col">Delete</th>
       <th scope="col">Update</th>
    </tr>
  </thead>
  <tbody>
  	<% 
  	   OrganizerService oServ=new OrganizerServiceImpl();
		List<OrganizerModel> list = oServ.getAllOragnizer();
  		int count=0;
   		for(OrganizerModel oModel: list)  
 		{  
 	%> 
	
	 <tr>
      <th scope="row"><%=++count%></th>
      <td><%=oModel.getOrganizerName()  %></td>
      <td><%=oModel.getOrganizerEmail()%></td>
      <td><%=oModel.getOrganizerContact()%></td>
      <td><%=oModel.getOrganizerAddress() %></td>
       <td><a href='del?OrganizerId=<%=oModel.getOrganizerId()%>'><img width="32" height="32" src="https://img.icons8.com/dusk/64/delete-forever.png" alt="delete-forever"/></a></td> 
       <td><a href='updateoragnizer?OrganizerId=<%=oModel.getOrganizerId()%>'><img width="35" height="35" src="https://img.icons8.com/cute-clipart/64/restart.png" alt="restart"/></a></td>  
		
    </tr>
    <%
  		 }
     %> 
 
  </tbody>
</table>
	</div>
	</div>
	
</body>
</html>