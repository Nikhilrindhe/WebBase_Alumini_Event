<%@include file="AdminMain.jsp"%>
	
	<div class="col-12 d-flex align-items-center justify-content-center">
		<div class="row border rounded-sm shadow-sm ms-4 mt-5" style="min-height : 40vh;">
		<div class="row">
			<div class="col-12 d-flex align-items-center justify-content-center mt-0">
			<h3>Add Oragnizer</h3>
			</div>
		</div>
		<div>
			<form name='frm' action="addneworagnizer" method="post">

              <div class="row">
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
                  <label class="form-label" for="firstName">Name</label>
                    <input type="text" name="name" class="form-control" />
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
                  <label class="form-label" for="lastName">Email</label>
                    <input type="email" name="email"  class="form-control" /> 
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
                  <label class="form-label" for="lastName">Contact</label>
                    <input type="text" name="contact" class="form-control" /> 
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
                  <label class="form-label" for="lastName">Address</label>
                    <input type="text" name="address" class="form-control" /> 
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
                  <label class="form-label" for="lastName">Password</label>
                    <input type="text" name="password" class="form-control" /> 
                  </div>

                </div>
                <div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
					<div class="col-md-6 mb-4">

                  <div data-mdb-input-init class="form-outline">
           
                    <input type="hidden" name="cId" value= '<%=CollegeId %>' /> 
                  </div>
                </div>
                
              </div>

              <div class="mt-3 pt-2">
                <input data-mdb-button-init data-mdb-ripple-init class="btn btn-primary btn-lg" type="submit" value="Submit" />
              </div>

            </form>
		</div>
		</div>
	</div>
	
	



	
</div>
</div>
</div>	
</body>
</html>