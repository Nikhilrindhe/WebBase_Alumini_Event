
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Login Form</title>
  <script type="text/javascript">
//   function validateEmail(str)
//   {     var span=document.getElementById("s");
// 	 let pattern=/^[a-z0-9._-]+@[a-z0-9._-]+\.[a-z]{2,3}$/g;
//          let result=str.match(pattern);
//         document.getElementById("s").innerHTML=result;
//         if(result!=null)
//         {  span.innerHTML="valid email address";
//            span.style.color="green";
//         }
// 	else{
//            span.innerHTML="invalid email address";
// 	   span.style.color="red";
// 	}
//   }
//   function checkPassword(){
//       let str=document.getElementById("txt").value;
//       let pattern=/(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@$#%^&*])(.{8,})/g;
//       let result=str.match(pattern);
//       if(result!=null){
//          let span=document.getElementById("k");
//          span.innerHTML="strong password";
//          span.style.backgroundColor="white";
//          span.style.color="green";
//       }
//       else{
//          let span=document.getElementById("k");
//          span.innerHTML="weak password";
//          span.style.backgroundColor="white";
//          span.style.color="red";

//      }  
//    }

 
<!--  </script> -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" >
  <style>
    body {
       height:100vh;
      background-image: url('Image/login2.jpg');
      background-repeat:no-repeat; /* Your background image URL */
      background-size: cover;
      font-family: Arial, sans-serif;
      margin:0;
      padding: 0;
    }
   .login-container {
    border:2px solid black;
      max-width: 400px;
      margin: 200px auto;
      padding: 30px;
      border-radius: 10px;
      background-color: rgba(0, 0, 0, 0.1); /* Transparent white background */  
    }
    .login-container h2 {
      text-align: center;
      margin-bottom: 30px;
      color: White;
    }
    .form-group {
       margin-bottom: 20px; 

    }
    .form-control {
      border:2px solid black;
      border-radius: 25px;
      background-color: transparent; /* Transparent background */
      padding: 15px;
      font-size: 16px;
      color: #333; /* Text color */
    }
    .btn-primary {
      border: none;
      border-radius: 25px;
      padding: 15px;
      font-size: 16px;
      font-weight: bold;
      background-color: #007bff;
       width:100%;
    }
    .btn-primary:hover {
      background-color: #0056b3;   
    }
    .form-control:focus {
      background-color: #e5e5e5;
      outline: none;
    }
    .form-control::placeholder {
      color: #999;
    }
  </style>
</head>
<body>
<div class="container">
  <div class="login-container">
    <h2>Login</h2>
    <form name='frm' action="login" method="post">
      <div class="form-group">
        <input type="email" class="form-control" id="username" name="email" onkeyup="validateEmail(this.value)" placeholder="Username">
         <span id="s"></span>
      </div>
      <div class="form-group">
        <input type="password" class="form-control" id="password" name="password" onkeyup="checkPassword()" placeholder="Password">
         <span id="k"></span>
      </div>
      <button type="submit" class="btn btn-primary btn-block" value='Login'>Login</button>
    </form>
  </div>
</div>
</body>
</html>
    