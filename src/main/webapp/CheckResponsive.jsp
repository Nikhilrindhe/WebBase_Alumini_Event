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
  <h2>Alumni Event Feedback Form</h2>
  <form id="feedbackForm">
    <div class="form-group">
      <label for="event">Select Event:</label>
      <select class="form-control" id="event" required>
        <!-- Events will be dynamically populated here -->
      </select>
    </div>
    <div class="form-group">
      <label for="feedback">Feedback:</label>
      <textarea class="form-control" id="feedback" rows="4" placeholder="Enter your feedback" required></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Submit Feedback</button>
  </form>
</div>

</body>
</html>
