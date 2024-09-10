 <%@page import= "org.alumnievent.service.*, org.alumnievent.model.* , java.util.*" %>
<%@include file="Alumni.jsp"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Alumni Event Feedback Form</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f8f9fa;
    }
    .container {
      max-width: 600px;
      margin: 50px auto;
      background-color: #fff;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .form-group {
      margin-bottom: 20px;
    }
    .form-group label {
      font-weight: bold;
    }
  </style>
</head>
<body>

<div class="container">
      <% int aid=Integer.parseInt(session.getAttribute("alumniId").toString()); %>
  <h2 class="mb-4">Alumni Event Feedback Form</h2>
  <form name='frm' action='getfeedback' method='POST'>
    <div class="form-group">
      <label for="email">Email Address:</label>
      <input type="email" class="form-control" id="email" name="email" placeholder="Enter your email" required>
    </div>

       <div class="form-group">
      <label for="event">Select Event:</label>
      <select class="form-control" id="event" name="event" required>
        	<%
			EventService eServ = new EventServiceImpl();
			List<EventModel> list=eServ.getEventsForFeedback(aid);
			for (EventModel em : list) {
			%>
<option value="<%=em.getEventId()%>"><%=em.getEventName()%></option>		
			<%
			}
			%>
      </select>
       </div>
    
    <div class="form-group">
      <label for="rating">Event Rating:</label>
      <select class="form-control" id="rating" required>
        <option value="">Select rating</option>
        <option value="5">Excellent (5 Stars)</option>
        <option value="4">Very Good (4 Stars)</option>
        <option value="3">Good (3 Stars)</option>
        <option value="2">Fair (2 Stars)</option>
        <option value="1">Poor (1 Star)</option>
      </select>
    </div>
    
    <div class="form-group">
      <label for="feedback">Feedback:</label>
      <textarea class="form-control" id="feedback" name="feedback" rows="4" placeholder="Enter your feedback"></textarea>
    </div>
    
    <button type="submit" class="btn btn-primary">Submit Feedback</button>
  </form>
  
</div>

</body>
</html>
