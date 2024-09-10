<%@page import="org.alumnievent.service.*,org.alumnievent.model.*,java.util.*"%>
<script type="text/javascript">
	function searchByName(str) {
		let xhttp = new XMLHttpRequest();

		var n = document.getElementById('searchInput').value;
		//alert(n);
		xhttp.onreadystatechange = function() {
			//alert("in")
			if (this.readyState == 4 && this.status == 200) {
				document.getElementById("results").innerHTML = this.responseText;
				console.log(this.responseText);
			}
		};
		xhttp.open("GET","SearchCollege.jsp?n="+n,true);
		xhttp.send();
	}
</script>
<%@include file="Organizerpage.jsp"%>

<main class="content px-3 py-4">
	<div class="container-fluid">
		<div class="mb-3">
			<h3 class="fw-bold fs-4 mb-3">College For Event</h3>
			<div style="text-align: right;">
				<input type="search" id="searchInput" placeholder="Search College..."
					style="display: inline-block; width: 250px; height: 40px;"
					onkeyup="searchByName()"  value=''>
				<button type="button"
					style="display: inline-block; font-size: 20px;">&#128269;</button>
			</div>


          	<div id="results">
			<div class="row">
				<div class="col-12">
					<table class="table table-striped">
						<thead>
							<tr class="highlight">
								<th scope="col">#</th>
								<th scope="col">College Name</th>
								<th scope="col">College Email</th>
								<th scope="col">College Address</th>
								<th scope="col">College Contact</th>
							</tr>
						</thead>
						<tbody>

							<%
							OrganizerService service = new OrganizerServiceImpl();
							List<CollegeModel> list = service.getAllCollege();

							int count = 0;

							for (CollegeModel model : list) {
							%>
						
							<td><%=++count%></td>
							<td><%=model.getCollegeName()%></td>
							<td><%=model.getCollegeEmail()%></td>
							<td><%=model.getCollegeAddress()%></td>
							<td><%=model.getCollegeContact()%></td>
							<td><a
								href="ViewCollegeEvent.jsp?collegeid=<%=model.getCollegeId()%>">Show
									Events</a></td>
							<td><a
								href="OrganizeEvent.jsp?collegeid=<%=model.getCollegeId()%>">Organize
									Event</a></td>
							
							</tr>
							<%
							}
							%>

						</tbody>
					</table>
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
</div>
</body>
</html>