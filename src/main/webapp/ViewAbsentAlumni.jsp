 <%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%>
 <%@include file="AdminMain.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%int EventId=Integer.parseInt(request.getParameter("EventId"));%>
 <main class="content px-3 py-4">
                <div class="container">
                    <div class="mb-3">
                        <h3 class="fw-bold fs-4 mb-3">View Absent Alumni</h3>
                        <div class="row">
                            <div class="col-12">
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight">
                                            <th scope="col">sr no</th>
                                            <th scope="col">Name</th>
                                            <th scope="col">Email</th>
                                            <th scope="col">Contact</th>
                                            <th scope="col">Passout Year</th>
                                       </tr>
                                    </thead>
                                    <tbody>

         
     <%
     AlumniService aServ=new AlumniServiceImpl();
    List <AlumniModel> list=aServ.getAbsentAlumni(EventId);
          int count=0;
		for(AlumniModel am:list)
		{
	    %>	
	      <td><%=++count%></td>
	     <td><%=am.getAlumniName()%></td>
	      <td><%=am.getAlumniEmail()%></td>
	      <td><%=am.getAlumniContact()%></td>
	      <td><%=am.getAlumniPassoutYear()%></td>
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
</body>
</html>