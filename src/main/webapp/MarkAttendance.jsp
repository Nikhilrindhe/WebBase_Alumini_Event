<script type=text/javascript>
function markAttendance()
{
	let xhttp=new XMLHttpRequest();
	//var bid=document.getElementById("branchId").value;
	   var result = document.getElementById("branchId").value;
	   var values=result.split('-');
	   var bid= values[0];
	   var eventId=values[1];
	  
	   var cid= document.getElementById("cId").value;
	 
	xhttp.onreadystatechange=function()
	{
	if(this.readyState==4 && this.status==200)	
		{
		document.getElementById("searcharea").innerHTML=this.responseText;
		}
	};
	xhttp.open("GET","FinalAlumniAttendance.jsp?search="+bid+ "&cid="+cid ,true);
	xhttp.send();
}

function takeAttendance(alumniid,button){
    	 //alert(alumniid);
    	let xhttp=new XMLHttpRequest();
    var result = document.getElementById("branchId").value;
 	   var values=result.split('-');
 	   var bid = values[0];
 	   var eventId = values[1];
 	 
 	  var cid= document.getElementById("cId").value;
 
 	 
 	xhttp.onreadystatechange=function()
 	{
		if(this.readyState == 4 && this.status == 200)
		{
			   // var button =document.getElementById("b");
			    button.innerHTML = "Present";
	            button.style.backgroundColor = "#28a745"; // Green background color
	            button.style.color = "white";
		}
 	};
 	xhttp.open("GET","fattendance?alumniid="+alumniid+"&search="+bid+"&eventId="+eventId+"&cid="+cid,true);
 	xhttp.send();
 	
 }
function searchEvent()
{
	var BranchId=document.getElementById("branch").value;
	var CollegeId= document.getElementById("cId").value;
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function()
	{
		if(this.readyState == 4 && this.status ==200)
			{
	
			document.getElementById("searchbranch").innerHTML=this.responseText;
			}
		
	};
	xhttp.open("GET","GetEvents.jsp?BranchId="+BranchId+"&CollegeId="+CollegeId,true);
	xhttp.send();
   
}
function searchAlumni()
{
	var name=document.getElementById("Searchstudent").value;
	
	var BranchId=document.getElementById("branch").value;
	var CollegeId= document.getElementById("cId").value;
	let xhttp = new XMLHttpRequest();
	
	xhttp.onreadystatechange = function()
	{
		if(this.readyState == 4 && this.status ==200)
			{
			document.getElementById("searcharea").innerHTML=this.responseText;
			}
	};
	xhttp.open("GET","SearchAlumni.jsp?BranchId="+BranchId+"&CollegeId="+CollegeId+"&name="+name,true);
	xhttp.send();
	
}
</script>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="AdminMain.jsp"%>
<%
  int Id = cModel.getCollegeId();
%>
<div class="d-flex align-item-centre justify-content-centre">
	<h3 class="d-flex align-item-centre justify-content-centre">Mark
		Attendance</h3>
</div>
<div class="border border-3 " style="min-height: 80vh">
	<div class="col">
		<div class="row">
			<div class="col-12 p-3">
			
				<!-- <form class="formarea" name="frm" action="" method="post"> -->
					<input type="hidden" id='cId' value='<%=Id%>'>
					<div class="form-group" style="display: inline-block;">
						<label for="branch">Branch Name:</label> 
						<select id="branch" name="branch" style="width: 300px; height: 40px;" onchange="searchEvent()" >
							<%
							BranchService bServ=new BranchServiceImpl();
							List<BranchModel> b=bServ.getCollegeWiseBranch(Id);
							
							for (BranchModel bm : b) {
							%>
							<option value="<%= bm.getBranchId()%>"><%=bm.getBranchName()%></option>		
							<%
							}
							%>
						</select>
						<br><br>
					</div>
					
				
					
					<div id="searchbranch"style="display: inline-block;">
					<div class="form-group" >
						<label for="branchId">Event Name:</label> 
						<select id="branchId" name="branchId" style="width: 300px; height: 40px;" onchange="markAttendance()">
							<%
							EventService eventService = new EventServiceImpl();
							//System.out.println("the id is"+BranchId);
							List<EventModel> list = eventService.ShowEventsAsPerCollege(Id);
							for (EventModel e : list) {
							%>
							<option value="<%=e.getBranchId()%>-<%=e.getEventId()%>"><%=e.getEventName()%> </option>
							<%
							}
							%>
						</select>
						<br><br>
					</div>
					</div>
					
					<div style="text-align: right;">
				<input type="search" id="Searchstudent" placeholder="Search Alumni..."style=display:inline-block;width:250px;height:40px;" onkeyup="searchAlumni()"value=''>
				<button type="button"style="display: inline-block; font-size: 20px;">&#128269;</button>
					</div>
					
					<div id="searcharea" >
					<div class="mt-4" 
 						style="border: 2px solid black; border-radius: 20px;"> 
						<table  class="table mt-4 my-3 text-light text-centre"> 
 							<thead> 
								<tr> 
 									<th scope="col">Sr.No</th> 
 									<th scope="col">NAME</th> 
 								</tr> 
 							</thead> 
 							<tbody> 
								<%  
 								AlumniService alumniService = new AlumniServiceImpl(); 
								List<AlumniModel> li = alumniService.getAllAlumni(Id);  
  								int count = 0; 
  								for (AlumniModel aModel : li) { 
								%>  
 								<tr> 
									<th scope="row"><%=++count%></th> 
									<td><%=aModel.getAlumniName()%></td> 
<%-- 									<td><%=aModel.getAlumniId() %></td> --%>
						<td><button class="btn btn-danger" id="b" onclick="takeAttendance('<%=aModel.getAlumniId() %>',this)  " type="button">Attendance</button></td> 
  								</tr>  
  								<%  
  								}
 							%>  
 							</tbody> 
 						</table> 
				 
                      </div>
                     </div>


				<!-- </form> -->
				
				
				
			</div>
		</div>

	</div>
</div>
</div>

</body>
</html>