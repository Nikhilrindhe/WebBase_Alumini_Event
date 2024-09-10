<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import= "org.alumnievent.service.*, org.alumnievent.model.* , java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
 <link href="https://cdn.lineicons.com/4.0/lineicons.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="CSS/Dashboardstyle.css">
    <style type="text/css">
    
	.bg-img{
/* 	background: url(Imgs/alumniback.jpg); */
	background-repeat: no-repeat;
	background-size: cover;
}
.btn-success {
    background-color: #28a745; /* Green */
    color: white;
}

</style>
</head>

<body>
<%! CollegeModel cModel;%>
<%! int CollegeId; %>
	<%
		response.setHeader("Cache-Control","no-cache, no-store, must-revalidate");
		if(session.getAttribute("email")==null)
		{
			response.sendRedirect("AdminLogin.jsp");
		}else{
			CollegeId = Integer.parseInt(session.getAttribute("collegeId").toString());
			CollegeService collService = new CollegeServiceImpl();
			cModel = collService.getAdminProfile(CollegeId);	
		}
	%>
    
     <div class="wrapper">
        <aside id="sidebar">
            <div class="d-flex">
                <button class="toggle-btn" type="button">
                    <i class="lni lni-grid-alt"></i>
                </button>
                <div class="sidebar-logo">
                    <a href="#"><%=cModel.getCollegeName()%></a>
                </div>
            </div>
            <ul class="sidebar-nav">
                <li class="sidebar-item">
                    <a href="AdminProfile.jsp" class="sidebar-link">
                    <img width="30" height="30" src="https://img.icons8.com/dusk/64/gender-neutral-user--v1.png" alt="gender-neutral-user--v1"/>
                        <span>Profile</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="AlumniInfo.jsp" class="sidebar-link">
                    <img width="30" height="30" src="https://img.icons8.com/color/48/student-female.png" alt="student-female"/>
                        <span>Alumni</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="OrganizerInfo.jsp" class="sidebar-link">
                        <img width="30" height="30" src="https://img.icons8.com/dusk/64/planner.png" alt="planner"/>
                        <span>Oragnizer</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="AllEvent.jsp" class="sidebar-link">
                        <img width="30" height="30" src="https://img.icons8.com/color/48/dancing-party--v1.png" alt="dancing-party--v1"/>
                        <span>Events</span>
                    </a>

                </li>
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse"
                        data-bs-target="#auth1" aria-expanded="false" aria-controls="auth1">
                       <img width="30" height="30" src="https://img.icons8.com/arcade/64/checked-user-male.png" alt="checked-user-male"/>
                        <span>Attendance</span> 
                    </a>
                    <ul id="auth1" class="sidebar-dropdown list-unstyled collapse" data-bs-parent="#sidebar">
                        <li class="sidebar-item">
                            <a href="MarkAttendance.jsp" class="sidebar-link">Mark Attendance</a>
                        </li>
                        <li class="sidebar-item">
                            <a href="ViewAlumniAsPerEvent.jsp" class="sidebar-link">View Alumni as Per Event</a>
                        </li>
                    </ul>
                </li>
                <li class="sidebar-item">
                    <a href="ViewCollegeEventFeedback.jsp" class="sidebar-link">
                        <img width="30" height="30" src="https://img.icons8.com/color-glass/48/poor-quality.png" alt="poor-quality"/>
                        <span>Feedbacks</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                        <img width="30" height="30" src="https://img.icons8.com/color/48/gear.png" alt="gear"/>
                        <span>Setting</span>
                    </a>
                </li>
            </ul>
            <div class="sidebar-footer">
                <a href="adminlogout" class="sidebar-link">
                    <img width="30" height="30" src="https://img.icons8.com/nolan/64/1A6DFF/C822FF/exit.png" alt="exit"/>
                    <span>Logout</span>
                </a>
            </div>
        </aside>
    	<div class="main bg-img" >
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    <script src="JS/script.js"></script>
    </body>

</html>