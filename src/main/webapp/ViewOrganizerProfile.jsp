<%@include file="Organizerpage.jsp"%>
	
	 <main class="content px-3 py-4">
                <div class="container-fluid">
                    <div class="mb-3">
                        <h3 class="fw-bold fs-4 mb-3"><%= oModel.getOrganizerName()  %></h3>
                        <div class="row">
                            <div class="col-12">
                                <table class="table table-striped">
                                    <thead>
                                        <tr class="highlight">
                                            <th scope="col">#</th>
                                            <th scope="col">Organizer Name</th>
                                            <th scope="col">Organizer Email</th>
                                            <th scope="col">Organizer Contact</th>
                                             <th scope="col">Organizer Address</th>
                                       </tr>
                                    </thead>
                                    <tbody>
                                         <tr> 
                                             <th scope="row">1</th> 
                                             <td><%= oModel.getOrganizerName() %></td> 
                                             <td><%= oModel.getOrganizerEmail() %></td> 
                                             <td><%= oModel.getOrganizerContact() %></td> 
                                            <td><%= oModel.getOrganizerAddress() %></td> 
                                     </tr> 
                                        
                                    </tbody>
                                </table>
                                <div class="text-end">
                                   <button type="submit" class="btn btn-info "><a href="UpdateOrganizerProfile.jsp" style="text-decoration:none;">Update Profile</a></button>           
                              </div>
        
                            </div>
                        </div>
                    </div>
                </div>
            </main>

            </div>
            </div>
            </div>
</body>
</html>