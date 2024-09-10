<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Your Website Title</title>
    <style>  
        .alimg {
            display: inline-flex;
        }

        .midsec {
            padding-top: 30px;
        }
    </style>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container-fluid">
        <header class="bg-light p-3">
            <div class="container">
                <div class="container d-flex align-items:center">
                    <img src="Image/EvLogo.png" style="width:5vw; height:5vh;" alt="logo" class="mr-3">
                    <h2 class="ml-1">Alumni Event Management System</h2>
                </div>
            </div>
        </header>

        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container">
                <a class="navbar-brand" href="#">NavBar</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarNavDropdown">
                    <ul class="navbar-nav">
                        <li class="nav-item active">
                            <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">About Us</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Contact</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Login
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                                <a class="dropdown-item" href="LoginPage.jsp">Admin</a>
                                <a class="dropdown-item" href="LoginPage.jsp">Alumni</a>
                                <a class="dropdown-item" href="LoginPage.jsp">Organizer</a>
                            </div>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

        <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
            <ol class="carousel-indicators">
                <li data-target="#carouselExampleIndicators" data-slide-to="0" class=""></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="1" class=""></li>
                <li data-target="#carouselExampleIndicators" data-slide-to="2" class="active"></li>
            </ol>
            <div class="carousel-inner">
                <div class="carousel-item">
                    <img class="d-block w-100" src="Image/event2.png" alt="First slide">
                </div>
                <div class="carousel-item">
                    <img class="d-block w-100" src="Image/event2.png" alt="Second slide">
                </div>
                <div class="carousel-item active">
                    <img class="d-block w-100" src="Image/event2.png" alt="Third slide">
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

        <div class="container mt-4">
            <div class="row">
                <div class="col-md-4">
                    <img class="img-fluid" src="Image/Alumni1.jpg" alt="Descriptive Alt Text">
                </div>
                <div class="col-md-8">
                    <p>
                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quas culpa assumenda fugiat dolore totam ad, recusandae quis consequatur dolores voluptatem nesciunt ut corrupti veritatis quos at debitis sit reiciendis quaerat molestias soluta beatae quibusdam aspernatur repudiandae? Alias fugit ab, ipsa magni, minima maxime veritatis harum enim expedita consectetur hic dolor optio quam officia minus beatae sapiente recusandae blanditiis sunt nulla numquam dolorum soluta laudantium? Excepturi, tempora. Consequatur ab id doloribus velit sed esse quae cumque sequi voluptatem debitis. Atque debitis pariatur modi maiores laborum, a recusandae quisquam explicabo voluptatem minima dolore culpa neque totam laboriosam, ipsam similique. Numquam, harum odio.
                    </p>
                </div>
            </div>
        </div>

        <div class="container mt-4">
            <div class="row">
                <div class="col-md-8 order-md-1">
                    <p>
                        Lorem ipsum dolor sit, amet consectetur adipisicing elit. Quas culpa assumenda fugiat dolore totam ad, recusandae quis consequatur dolores voluptatem nesciunt ut corrupti veritatis quos at debitis sit reiciendis quaerat molestias soluta beatae quibusdam aspernatur repudiandae? Alias fugit ab, ipsa magni, minima maxime veritatis harum enim expedita consectetur hic dolor optio quam officia minus beatae sapiente recusandae blanditiis sunt nulla numquam dolorum soluta laudantium? Excepturi, tempora. Consequatur ab id doloribus velit sed esse quae cumque sequi voluptatem debitis. Atque debitis pariatur modi maiores laborum, a recusandae quisquam explicabo voluptatem minima dolore culpa neque totam laboriosam, ipsam similique. Numquam, harum odio.
                    </p>
                </div>
                <div class="col-md-4 order-md-2">
                    <img class="img-fluid" src="Image/Alumni1.jpg" alt="Descriptive Alt Text">
                </div>
            </div>
        </div>

        <div class="container-fluid bg-dark mt-4">
            <div class="row">
                <div class="col-12">
                    <p class="p-4" style="color:white;">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit. Nostrum inventore assumenda magnam est delectus voluptatem quam recusandae ipsa eos temporibus! Ducimus cum qui veritatis quo neque deleniti sit explicabo, doloribus tempora enim ipsum reprehenderit distinctio sed delectus nam mollitia consequatur autem, quaerat iure incidunt? Dolore obcaecati odit optio rem assumenda repudiandae facilis esse nihil id iste! Officiis, iusto labore nesciunt, doloremque rem ab dignissimos quisquam veritatis nulla recusandae vitae fuga earum culpa est cumque velit, autem praesentium quibusdam sint natus! Soluta laborum praesentium esse pariatur provident, vitae magni in laboriosam aut fuga temporibus quidem quas quam est culpa non odit eum, asperiores dolorum, inventore ipsam libero. Nobis fugiat saepe, soluta doloremque natus hic aperiam deserunt temporibus incidunt nemo culpa sed tempore possimus vel modi nihil placeat necessitatibus dolor cumque officia. Sunt cumque perspiciatis nemo quae sit amet laudantium mollitia sequi fuga illum blanditiis ipsum molestias consequatur atque, dolorum nisi molestiae ipsa qui possimus praesentium aliquam magni sed. Veniam ad exercitationem nulla veritatis neque ipsam non a adipisci. Vero aperiam tempore ex assumenda delectus id. Explicabo labore atque ducimus fugiat, perspiciatis inventore libero sed eligendi vel excepturi! Id facere architecto non nam, placeat maxime quia provident laboriosam similique nulla voluptatem quod ipsa optio mollitia.
                    </p>
                </div>
            </div>
        </div>

        <div class="container-fluid mt-4">
            <div class="row midsec">
                <div class="col-md-6">
                    <h3>Star Alumni</h3>
                    <div class="alimg">
                        <div class="col-6">
                            <img src="Image/RDJ.png" class="img-thumbnail">
                            <p>Rdj An Actor Is Also Known As Ironman</p>
                        </div>
                        <div class="col-6">
                            <img src="Image/BatMan.png" class="img-thumbnail">
                            <p>Bruce An Actor Is Also Known As Batman</p>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <h3>Upcoming Events</h3>
                    <img src="Image/event3.jpg" class="img-fluid">
                    <p>
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Neque distinctio blanditiis dolore ut laudantium molestiae sed obcaecati placeat fugit assumenda totam, dolor corrupti ex animi saepe doloremque in cum ipsam expedita sequi minima rerum facere enim aliquid. Dolores voluptates quasi, iusto doloremque, sapiente molestias blanditiis cupiditate ea ex quo voluptatum a, exercitationem minus ad ab? Optio eum voluptas earum quia, itaque, nulla nostrum placeat quae, animi dignissimos maiores vitae aut! Doloremque aut quasi nulla, exercitationem odio saepe explicabo itaque officia fugiat. Iure soluta maxime ad excepturi voluptas autem reprehenderit illum consequuntur, iusto incidunt ducimus veritatis expedita natus. Beatae, voluptate blanditiis!
                    </p>
                </div>
            </div>
        </div>

        <footer class="bg-dark text-white mt-4">
            <div class="container p-3">
                <p class="text-center mb-0">Copyright © 2021 Your Website</p>
            </div>
        </footer>

    </div>

    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.3/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
