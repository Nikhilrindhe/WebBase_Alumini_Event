
	<%@include file="AdminMain.jsp"%>
	<div class="main bg-img">
	 <main class="content px-3 py-4">
                <div class="container-fluid">
                    <div class="mb-3">
                        <h3 class="fw-bold fs-4 mb-3 text-light"><%= cModel.getCollegeName() %></h3>
                        <div class="row">
                            <div class="col-12 border border-2 rounded bg-light p-3">
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight mt-4">
                                            <th scope="col">#</th>
                                            <th scope="col">College Name</th>
                                            <th scope="col">College Email</th>
                                            <th scope="col">College Contact</th>
                                             <th scope="col">College Address</th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                        <tr>
                                            <th scope="row">1</th>
                                            <td><%= cModel.getCollegeName() %></td>
                                            <td><%= cModel.getCollegeEmail() %></td>
                                            <td><%= cModel.getCollegeContact() %></td>
                                            <td><%= cModel.getCollegeAddress() %></td>
                                        </tr>
                                        
                                    </tbody>
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
            <footer class="footer mb-0">
                <div class="container-fluid">
                    <div class="row text-body-secondary">
                        <div class="col-6 text-start ">
                            <a class="text-body-secondary" href=" #">
                                <strong>CodzSwod</strong>
                            </a>
                        </div>
                        <div class="col-6 text-end text-body-secondary d-none d-md-block">
                            <ul class="list-inline mb-0">
                                <li class="list-inline-item">
                                    <a class="text-body-secondary" href="https://collegedunia.com/contact-us">Contact</a>
                                </li>
                                <li class="list-inline-item">
                                    <a class="text-body-secondary" href="https://www.engg.dypvp.edu.in/">About Us</a>
                                </li>
                                <li class="list-inline-item">
                                    <a class="text-body-secondary" href="https://collegedunia.com/website-usage-policy">Terms & Conditions</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </footer>
            </div>
            </div>
            </div>
            </div>
</body>
</html>