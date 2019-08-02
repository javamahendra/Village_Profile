<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <!-- <meta charset="utf-8"> -->
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta http-equiv="x-ua-compatible" content="ie=edge">
  <title>Mahendra</title>
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
  <!-- Bootstrap core CSS -->
  <link href="../css/bootstrap.min.css" rel="stylesheet">
  <!-- Material Design Bootstrap -->
  <link href="../css/mdb.min.css" rel="stylesheet">
  <!-- Your custom styles (optional) -->
  <link href="../css/style.css" rel="stylesheet">
</head>
<body>
<%@ include file="/WEB-INF/views/header.jsp" %>
<div class="container">
	<c:if test="${msg !=null}">
	<div class="flex-center">
		<div style="text-align: -webkit-center;" class="col-md-4 mt-4 alert alert-danger" role="alert">${msg}</div>
	</div>
	</c:if>
	<div class="flex-center mt-5 mb-9">
		<!-- Card -->
		<div class="card col-md-6">
			<div class="card-body">
				<div class="flex-center"><h4 class="font-weight-bold">Login</h4></div>
				<form action="/mahindra/loginuser" method="post">
					<div class="form-row">
					    <div class="col-md-12 mb-1 md-form">
					      <label for="userid">Email/Mobile No *</label>
					      <input type="text" class="form-control" name="userid" id="userid" required/>
					      <div class="valid-feedback">
					        Looks good!
					      </div>
					    </div>
					</div>
					<div class="form-row">
					    <div class="col-md-12 mb-1 md-form">
					      <label for="userpassword">Password</label>
					      <input type="password" class="form-control" name="userpassword" id="userpassword" required/>
					    </div>
					</div>
					<div class="flex-center">
						<!-- Button -->
						<input type="submit" class="btn btn-primary" value="Login"/>
					</div>
				</form>
			</div>

		</div>
		<!-- Card -->
	</div>
	<br/>	<br/>	<br/>	<br/>	<br/>	<br/>	<br/>	<br/>	<br/>
	
</div>
	<%@ include file="/WEB-INF/views/footer.jsp" %>
<!-- Card -->
  <!-- SCRIPTS -->
  <!-- JQuery -->
  <script type="text/javascript" src="../js/jquery-3.4.1.min.js"></script>
  <!-- Bootstrap tooltips -->
  <script type="text/javascript" src="../js/popper.min.js"></script>
  <!-- Bootstrap core JavaScript -->
  <script type="text/javascript" src="../js/bootstrap.min.js"></script>
  <!-- MDB core JavaScript -->
  <script type="text/javascript" src="../js/mdb.min.js"></script>
  <script type="text/javascript">
	
		function submitdata(){
			
			ajaxFunction();
		}
  		
		function ajaxFunction(){
			
			$.ajax({
				//url: "/login/user"+,
				contentType: 'application/json',
		 		beforeSend: function () {
			        //$('#yearProcess').text('Processing...');
			    },
				success : function(data) {
					
				}
			    error:function(error){
			    	
			    
			    }
			});
		}
  </script>
</body>

</html>
