
<%@include file="AdminMain.jsp"%>
<div class="col-11 ml-4 float-left">
	<section class="vh-100 gradient-custom">
		<div class="container py-5 h-100">
			<div class="row justify-content-center align-items-center h-100">
				<div class="col-12 col-lg-9 col-xl-7">
					<div class="card shadow-2-strong card-registration"
						style="border-radius: 15px;">
						<div class="card-body p-4 p-md-5">
							<%
							CollegeId = Integer.parseInt(session.getAttribute("collegeId").toString());
							%>


							<form name='frm' action="addnewalumni" method="post">

								<div class="row">
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="firstName">Name</label> <input
												type="text" name="name" class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="lastName">Email</label> <input
												type="email" name="email" class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="lastName">Contact</label> <input
												type="text" name="contact" class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="lastName">Address</label> <input
												type="text" name="address" class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="lastName">Gender</label> <input
												type="text" name="gender" class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="lastName">Pass Out
												Year</label> <input type="text" name="passoutyear"
												class="form-control" />
										</div>

									</div>
									<div class="col-md-6 mb-4">
										<div data-mdb-input-init class="form-outline">
											<label class="form-label" for="branchId">Branch Name:</label>
											<select id="exampleInputEmail1" name="branchId">
												<%
												BranchService bService = new BranchServiceImpl();
												List<BranchModel> list = bService.getCollegeWiseBranch(CollegeId);
												for (BranchModel b : list) {
												%>
												<option value="<%=b.getBranchId()%>"><%=b.getBranchName()%></option>
												<%
												}
												%>
											</select>
										</div>
									</div>
									<div class="col-md-6 mb-4">

										<div data-mdb-input-init class="form-outline">
										<label class="form-label" for="lastName">Default Password</label>
											<input type="password" name="password" class="form-control" />
										</div>
										<div class="col-md-6 mb-4">



											<div data-mdb-input-init class="form-outline">

												<input type="hidden" name="cId" value='<%=CollegeId%>' />
											</div>
										</div>

									</div>

									<div class="mt-3 pt-2">
										<input data-mdb-button-init data-mdb-ripple-init
											class="btn btn-primary btn-lg" type="submit" value="Submit" />
									</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
</div>
</div>
</div>
</div>

</body>
</html>