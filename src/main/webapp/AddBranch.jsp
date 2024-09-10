	<%@include file="AdminMain.jsp"%>
	
	<div class="col-12 d-flex align-items-center justify-content-center">
		<div class="row border rounded-sm shadow-sm ms-4 mt-5" style="min-height : 40vh;">
		<div class="row">
			<div class="col-12 d-flex align-items-center justify-content-center mt-0">
			<h3>Branch</h3>
			</div>
		</div>
		<div>
			<form name="frm" action="addnewbranch" method="post">
					
					<div class="row form-check">
						<div class="d-flex align-items-center justify-content-center ">
							<input class="form-control" name="branchName" value="" placeholder="Enter the Branch name">
						</div>
					</div>
					<div class="row form-check">
						<div class="d-flex align-items-center justify-content-center ">
							<input type='hidden' name='cId' value='<%=CollegeId %>'/>
						</div>
					</div>
				<div class="mt-4 d-flex align-items-center justify-content-center">
                    <button type="submit" class="btn btn-outline-primary ms-4">Submit</button>
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