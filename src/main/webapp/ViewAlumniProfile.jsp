<%@include file="Alumni.jsp"%>
	
	 <main class="content px-3 py-4">
                <div class="container-fluid">
                    <div class="mb-3">
                        <h3 class="fw-bold fs-4 mb-3"><%= aModel.getAlumniName() %></h3>
                        <div class="row">
                            <div class="col-12 border border-3 py-3 px-5" style="backdrop-fillter : blur(25px)"> 
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight">
                                            <th scope="col">#</th>
                                            <th scope="col">Alumni Name</th>
                                            <th scope="col">Alumni Email</th>
                                            <th scope="col">Alumni Contact</th>
                                             <th scope="col">Alumni Address</th>
                                             <th scope="col">Alumni PassoutYear</th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                         <tr> 
                                             <th scope="row">1</th> 
                                             <td><%= aModel.getAlumniName() %></td> 
                                             <td><%= aModel.getAlumniEmail() %></td> 
                                             <td><%= aModel.getAlumniContact() %></td> 
                                            <td><%= aModel.getAlumniAddress() %></td> 
                                            <td><%= aModel.getAlumniPassoutYear() %></td> 
                                     </tr> 
                                        
                                    </tbody>
                                </table>
                                <div class="text-end mb-5">
                                   <button type="submit" class="btn btn-info "><a href="UpdateAlumniProfile.jsp" style="text-decoration:none;">Update Profile</a></button>           
                              </div>
        
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