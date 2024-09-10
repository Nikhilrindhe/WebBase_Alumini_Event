<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@page import= "org.alumnievent.service.*, org.alumnievent.model.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Organizer Page</title>
 <link href="https://cdn.lineicons.com/4.0/lineicons.css" rel="stylesheet" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <link rel="stylesheet" href="CSS/Dashboardstyle.css">
     <link rel="stylesheet" href="CSS/EventFormStyle.css">
     
 
     
</head>

<body>
<%!  OrganizerModel  oModel; %> 
 	<% 
 		int organizerId = Integer.parseInt(session.getAttribute("organizerId").toString()); 
 		OrganizerService oService = new OrganizerServiceImpl(); 
  		oModel = oService.getOrganizerProfile(organizerId );
 	%> 
    <div class="row">
    <div class="col-2 d-flex">
    
        <aside id="sidebar">
            <div class="d-flex">
                <button class="toggle-btn" type="button">
                    <i class="lni lni-grid-alt"></i>
                </button>
                <div class="sidebar-logo">
                    <a href="#">Organizer</a>
                </div>
            </div>
            <ul class="sidebar-nav">
                <li class="sidebar-item">
                    <a href="ViewOrganizerProfile.jsp" class="sidebar-link">
                        <i class="lni lni-user"></i>
                        <span>Profile</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="ViewCollegeForEvent.jsp" class="sidebar-link">
                        <i class="lni lni-agenda"></i>
                        <span>Organize Event</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="ViewOrganizerEvents.jsp" class="sidebar-link">
                       <i class="lni lni-agenda"></i>
                        <span>Manage Event</span>
                    </a>
                </li>
<!--                 <li class="sidebar-item"> -->
<!--                     <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse" -->
<!--                         data-bs-target="#auth" aria-expanded="false" aria-controls="auth"> -->
<!--                         <i class="lni lni-protection"></i> -->
<!--                         <span>Events</span> -->
<!--                     </a> -->

<!--                 </li> -->
<!--                 <li class="sidebar-item"> -->
<!--                     <a href="#" class="sidebar-link collapsed has-dropdown" data-bs-toggle="collapse" -->
<!--                         data-bs-target="#multi" aria-expanded="false" aria-controls="multi"> -->
<!--                         <i class="lni lni-layout"></i> -->
<!--                         <span>Attendance</span> -->
<!--                     </a> -->
<!--                 </li> -->
                <li class="sidebar-item">
                    <a href="ShowOrganizerFeedback.jsp" class="sidebar-link">
                        <i class="lni lni-popup"></i>
                        <span>Feedbacks</span>
                    </a>
                </li>
                <li class="sidebar-item">
                    <a href="#" class="sidebar-link">
                        <i class="lni lni-cog"></i>
                        <span>Setting</span>
                    </a>
                </li>
            </ul>
            <div class="sidebar-footer">
                <a href="#" class="sidebar-link">
                    <i class="lni lni-exit"></i>
                    <span>Logout</span>
                </a>
            </div>
        </aside>
        </div>
        <div class="col-9">
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
        crossorigin="anonymous"></script>
    <script src="JS/script.js"></script>