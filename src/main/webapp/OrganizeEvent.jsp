<%@page import="java.util.*"%>
<%@include file="Organizerpage.jsp"%>
	
	 <main class="content px-3 py-4">
                <div class="container-fluid">
                    <div class="mb-3">
                                                
<%
            int collegeid = Integer.parseInt(request.getParameter("collegeid").toString()); 
            int organizerid=Integer.parseInt(session.getAttribute("organizerId").toString());
 %> 
<%--  <p>College ID: <%= collegeid %></p> --%>
<%--  <p>Organizer id:<%=organizerid %></p>  --%>
                    <%
                    CollegeService cService=new CollegeServiceImpl();
                    String CollegeName=cService.getCollegeNameById(collegeid);
                    %>        
                        <h1 class="fw-bold fs-4 mb-3" style="text-align: center;"> Organize Event for <%=CollegeName%> College</h1>
                        <div class="row">
                            <div class="col-12">
                               
                <br/><br/>                 
  <form class="formarea" name="frm" action="ocontrol" method="post" style="text-align: center;">
  <div class="form-group">
  <label for="branchId">Branch Name:</label>
        <select id="exampleInputEmail1" name="branchId" style="width: 300px; height: 40px;">
          <%  
          BranchService bService=new BranchServiceImpl();
          List <BranchModel> list=bService.getCollegeWiseBranch(collegeid);  
           for(BranchModel b:list)
           {
        	   %>
                <option value="<%=b.getBranchId() %>"><%=b.getBranchName() %></option>
             <% 
             }
          %>
        </select><br><br>
  </div> 
  
   <div class="form-group">
    <label for="eventDate" >Event Date:</label>
     <input type="date" name="eventDate" id="exampleInputEmail1" aria-describedby="emailHelp"  required  style="width: 300px; height: 40px; margin-left: 20px"><br><br> 
     </div> 
     
     
  <div class="form-group">
    <label for="exampleInputEmail1">Event Name</label>
    <input type="text" class="form-control" name="eventName" id="exampleInputEmail1" aria-describedby="emailHelp" required  style=" margin-left: 10px">
  </div>
   <br/>
     <br/>
    <div class="form-group">
    <label for="exampleInputEmail1">Event Venue</label>
    <input type="text" class="form-control" name="venue" id="exampleInputEmail1" aria-describedby="emailHelp" required style=" margin-left: 10px">
  </div>
    <br/>
      <br/>
  <div class="form-group">
    <label for="exampleInputEmail1">Event Description</label>
    <input type="text" class="form-control" name="description" id="exampleInputEmail1" aria-describedby="emailHelp" required  >
  </div>
    
    <div class="form-group">
    <input type="hidden" name="collegeid" value="<%=collegeid%>">
    </div>
     
     <div class="form-group">
    <input type="hidden" name="organizerid" value="<%=organizerid%>">
    </div> 
    <br/><br/>
  <button type="submit" class="btn btn-info ">Organize Event</button>
</form>     
   
                               
                               
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