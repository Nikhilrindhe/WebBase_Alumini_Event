<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Website Title</title>
    <style>  
   .alimg{
   display:inline-flex;
   }
   .midsec{
   padding-top:30px;
   }
    </style>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
    <header class="p-1" style="background-color : #FA9152;">
    <div class="container d-flex">
      <div class="col-lg-3 d-flex align-items:center" >
     
      <img src="Imgs/image.png"  style="width:15vw; height:20vh" alt="logo"  class="mr-3"> 
      </div>
    	<div class="col-lg-9 col-md-9 mt-5 ml-5">
    		<nav class="navbar navbar-expand-lg navbar-dark">
    		<div class="container">
        <a class="navbar-brand" href="#">Brand</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active ml-1">
                    <a class="nav-link" href="#">Home<span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item active ml-2">
                    <a class="nav-link" href="#">About Us</a>
                </li>
                <li class="nav-item active ml-2">
                    <a class="nav-link" href="#">Clients</a>
                </li>
                <li class="nav-item active ml-2">
                    <a class="nav-link" href="#">Products</a>
                </li>
                <li class="nav-item active ml-2">
                    <a class="nav-link" href="#">Contact</a>
                </li>
                <li class="nav-item active ml-2">
                    <a class="nav-link" href="AdminLogin.jsp">Login</a>
                </li>
            </ul>
        </div>
    </div>
</nav>
    	</div>
    </div>     
 </header>
    
 <div id="carouselExampleIndicators" class="carousel slide mt-1" data-ride="carousel">
    <ol class="carousel-indicators">
        <li data-target="#carouselExampleIndicators" data-slide-to="0" class=""></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="1" class=""></li>
        <li data-target="#carouselExampleIndicators" data-slide-to="2" class="active"></li>
    </ol>
    <div class="carousel-inner">
        <div class="carousel-item">
            <img class="d-block w-100" src="Imgs/event2.png" alt="First slide">
        </div>
        <div class="carousel-item">
            <img class="d-block w-100" src="Imgs/event2.png" alt="Second slide">
        </div>
        <div class="carousel-item active">
            <img class="d-block w-100" src="Imgs/event2.png" alt="Third slide">
        </div>
    </div>
    <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
    </a>
    <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
    </a>
</div>

<div class="d-flex align-items:center justify-content-center">

	<h2 class="text-warning mt-3">Why Vidyalaya Event Management System</h2>
</div>
    <div class="d-flex align-items:center justify-content-center">
	<h4>Is Most Preferred System in India?</h4>
</div>
	<div class="container d-flex mt-2">
		<div class="col-lg-6 col-md-12 col-sm-12 mt-4">
			<h5>We Have<h5>
			<h2 class="text-warning">Lot Of Success Stories</h2>
			<p>
			Vidyalaya school management system software has redefined the education system functionalities with help of the latest technologies and gained new heights with its extraordinary features! This successful school management system uses cutting-edge technology and makes it user-friendly yet affordable! The product from the team of ultimate and 22+ years of expertise offers all the mandatory and complementary functionalities required by an educational institute! Our esteem 1600+ global client base tells our success stories! We believe in.
			</p>
		</div>
		<div class="col-lg-6 col-md-12 col-sm-12">
		<div class="d-flex">
			<div class="d-flex">
				<img src="Imgs/icons8-growth-96.png">
				<div class="ml-3 mt-2">
					<h2 >22+</h2>
					<p>Successful Year</p>
				</div>
			</div>
			<div class="d-flex ml-4">
				<img src="Imgs/icons8-happy-client-100.png">
				<div class="ml-3 mt-2">
					<h2 >1600+</h2>
					<p>Happy Client</p>
				</div>
			</div>
		</div>	
		<div class="d-flex mt-3">
			<div class="d-flex">
				<img src="Imgs/icons8-search-client-100.png">
				<div class="ml-3 mt-2">
					<h2 >96%</h2>
					<p>Client Retention</p>
				</div>
			</div>
			<div class="d-flex ml-4">
				<img src="Imgs/icons8-reports-100.png">
				<div class="ml-3 mt-2">
					<h2 >1500+</h2>
					<p>Report</p>
				</div>
			</div>
		</div>	
		<div class="d-flex mt-3">
			<div class="d-flex">
				<img src="Imgs/icons8-review-100.png">
				<div class="ml-3 mt-2">
					<h2 >2500+</h2>
					<p>Verified Reviews</p>
				</div>
			</div>
			<div class="d-flex ml-4">
				<img src="Imgs/icons8-coach--skin-type-2-100 (1).png">
				<div class="ml-3 mt-2">
					<h2 >20000+</h2>
					<p>Professionals Trained</p>
				</div>
			</div>
		</div>		
		</div>
	</div>
	<div class="align-items:center justify-content-center mt-4">
		<div class="d-flex align-items:center justify-content-center mt-5"><h5>We Provide</h5></div>
		<div class="d-flex align-items:center justify-content-center">
			<h2 class="text-warning">Integrated College Management Software</h2>	
		</div>
		<div class="d-flex align-items:center justify-content-center mt-3">
			<p style=" width:60vw;">Vidyalaya software is a customized school management software that offers end-to-end solutions for every phase of school management like admissions, academic management, staff management, attendance. It is a one-stop solution platform that integrates various features like biometric, SMS, online portal, e-exam, mobile app, etc. Let our high-end product empower your educational institute in delivering new ways of education by taking care of administrative tasks!</p>
		</div>
		<div class="col-md-12 mt-4 d-flex">
			<div class=" col-md-6 col-lg-3 d-flex align-items:center justify-content-center" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-touchscreen-100 (1).png">
				</div>
			</div>
			<div class="col-md-6 col-lg-3 d-flex align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-fingerprint-100.png">
				</div>
			</div>
			<div class="col-md-6 d-flex col-lg-3  align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-teacher-100.png">
				</div>
			</div>
			<div class="col-md-6 col-lg-3 d-flex align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-home-address-100.png">
				</div>
			</div>
		
		</div>
		<div class="col-md-12 mt-4 d-flex">
			<div class=" col-md-6 col-lg-3 d-flex align-items:center justify-content-center" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-send-email-100.png">
				</div>
			</div>
			<div class="col-md-6 col-lg-3 d-flex align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-qr-code-100.png">
				</div>
			</div>
			<div class="col-md-6 d-flex col-lg-3  align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-mobile-payment-100.png">
				</div>
			</div>
			<div class="col-md-6 col-lg-3 d-flex align-items:center justify-content-center ml-4" style="background-color : #FA9152; width:18vw; height:30vh; border-radius:20px">
				<div class="mt-3 p-4" style="background-color : white;width:10vw; height:25vh; border-radius:50%;">
					<img src="Imgs/icons8-calculator-100.png">
				</div>
			</div>
		
		</div>
	</div>
	
    <div class="container mt-4">
    <div class="row">
        <div class="col-md-4">
            <img class="img-fluid" src="Imgs/alumni1.jpg" alt="Descriptive Alt Text">
        </div>
        <div class="col-md-8">
             <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quas culpa assumenda fugiat dolore totam ad, recusandae quis consequatur dolores voluptatem nesciunt ut corrupti veritatis quos at debitis sit reiciendis quaerat molestias soluta beatae quibusdam aspernatur repudiandae? Alias fugit ab, ipsa magni, minima maxime veritatis harum enim expedita consectetur hic dolor optio quam officia minus beatae sapiente recusandae blanditiis sunt nulla numquam dolorum soluta laudantium? Excepturi, tempora. Consequatur ab id doloribus velit sed esse quae cumque sequi voluptatem debitis. Atque debitis pariatur modi maiores laborum, a recusandae quisquam explicabo voluptatem minima dolore culpa neque totam laboriosam, ipsam similique. Numquam, harum odio.</p>
        </div>
    </div>
</div>

  <div class="container mt-4">
    <div class="row">
    <div class="col-md-8">
             <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quas culpa assumenda fugiat dolore totam ad, recusandae quis consequatur dolores voluptatem nesciunt ut corrupti veritatis quos at debitis sit reiciendis quaerat molestias soluta beatae quibusdam aspernatur repudiandae? Alias fugit ab, ipsa magni, minima maxime veritatis harum enim expedita consectetur hic dolor optio quam officia minus beatae sapiente recusandae blanditiis sunt nulla numquam dolorum soluta laudantium? Excepturi, tempora. Consequatur ab id doloribus velit sed esse quae cumque sequi voluptatem debitis. Atque debitis pariatur modi maiores laborum, a recusandae quisquam explicabo voluptatem minima dolore culpa neque totam laboriosam, ipsam similique. Numquam, harum odio.</p>
        </div>
        <div class="col-md-4">
            <img class="img-fluid" src="Img/Alumni1.jpg" alt="Descriptive Alt Text">
        </div>
        
    </div>
</div>

    
    <div class="container-fluid bg-dark  mt-4">
    <div class="row">
        <div class="col-12">
            <p class="p-4"style="color:white;">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum inventore assumenda magnam est delectus voluptatem quam recusandae ipsa eos temporibus! Ducimus cum qui veritatis quo neque deleniti sit explicabo, doloribus tempora enim ipsum reprehenderit distinctio sed delectus nam mollitia consequatur autem, quaerat iure incidunt? Dolore obcaecati odit optio rem assumenda repudiandae facilis esse nihil id iste! Officiis, iusto labore nesciunt, doloremque rem ab dignissimos quisquam veritatis nulla recusandae vitae fuga earum culpa est cumque velit, autem praesentium quibusdam sint natus! Soluta laborum praesentium esse pariatur provident, vitae magni in laboriosam aut fuga temporibus quidem quas quam est culpa non odit eum, asperiores dolorum, inventore ipsam libero. Nobis fugiat saepe, soluta doloremque natus hic aperiam deserunt temporibus incidunt nemo culpa sed tempore possimus vel modi nihil placeat necessitatibus dolor cumque officia. Sunt cumque perspiciatis nemo quae sit amet laudantium mollitia sequi fuga illum blanditiis ipsum molestias consequatur atque, dolorum nisi molestiae ipsa qui possimus praesentium aliquam magni sed. Veniam ad exercitationem nulla veritatis neque ipsam non a adipisci. Vero aperiam tempore ex assumenda delectus id. Explicabo labore atque ducimus fugiat, perspiciatis inventore libero sed eligendi vel excepturi! Id facere architecto non nam, placeat maxime quia provident laboriosam similique nulla voluptatem quod ipsa optio mollitia.</p>
        </div>
    </div>
</div>
   
   <div class="row midsec">
   <div class="col-6 " >
   <h3>Star Alumni</h3>
  <div class="alimg"> 
      <div class="col-6">
      <img src="Imgs/RDJ.png" class="img-thumbnail">
      <p>Rdj An Actor Is Also Known As Ironman </p>
      </div>
      <div class="col-6">
      <img src="Imgs/BatMan.png" class="img-thumbnail">
       <p>Bruce An Actor Is Also Known As Batman </p>
      </div>
      
      </div>
   
   </div>
   <div class="col-6">
  <h3>Upcoming Events</h3>
  <img src="Imgs/event2.png" class="img-fluid">
  <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Neque distinctio blanditiis dolore ut laudantium molestiae sed obcaecati placeat fugit assumenda totam, dolor corrupti ex animi saepe doloremque in cum ipsam expedita sequi minima rerum facere enim aliquid. Dolores voluptates quasi, iusto doloremque, sapiente molestias blanditiis cupiditate ea ex quo voluptatum a, exercitationem minus ad ab? Optio eum voluptas earum quia, itaque, nulla nostrum placeat quae, animi dignissimos maiores vitae aut! Doloremque aut quasi nulla, exercitationem odio saepe explicabo itaque officia fugiat. Iure soluta maxime ad excepturi voluptas autem reprehenderit illum consequuntur, iusto incidunt ducimus veritatis expedita natus. Beatae, voluptate blanditiis!</p>

   </div>
   
   </div> 
   
    <footer class="bg-dark text-white mt-4">
    <div class="container p-3">
        <p class="text-center mb-0">Copyright © 2021 Your Website</p>
    </div>
</footer>
    
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    
    </div>


</body>
</html>