<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<br/>
<!-- Card -->
<div class="flex-center">
<div class="card col-md-6">

<!-- Card content -->
  <div class="card-body">
  <div class="flex-center"><h4 class="font-weight-bold">Add Profile</h4></div>
<form:form class="needs-validation" action="/mahindra/saveprofile" method="post" modelAttribute="userprofile">
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="firstname">First name *</label>
      <form:input type="text" class="form-control" id="firstname" path="firstname"/>
      <div class="invalid-feedback">
        First Name Required
      </div>
    </div></div>
	<div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="lastname">Last name *</label>
      <form:input type="text" class="form-control" id="lastname" path="lastname"/>
      <div class="invalid-feedback">
       Last Name Required
      </div>
    </div>
	</div>
	<div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="email">Email (optional)</label>
      <form:input type="text" class="form-control" id="email" path="email" aria-describedby="email"/>
    </div>
	</div>
	<div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="mobileno">Mobile No *</label>
      <form:input type="text" class="form-control" id="mobileno" aria-describedby="mobileno" path="mobileno"/>
      <div class="invalid-feedback">
        Please Enter valid Mobile No.
      </div>
    </div>    
  </div>
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="qualification">Qualification (optional)</label>
      <form:input type="text" class="form-control" id="qualification" path="qualification" aria-describedby="qualification"/>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="designation">Designation (optional)</label>
      <form:input type="text" class="form-control" id="designation" path="designation" />
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="companyname">Company Name (optional)</label>
      <form:input type="text" class="form-control" id="companyname" path="companyname"/>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="fburl">Facebook Id (optional)</label>
      <form:input type="text" class="form-control" id="fburl" aria-describedby="fburl" path="fburl"/>
    </div>
  </div>
  <div class="form-row">
    <div class="col-md-12 mb-1 md-form">
      <label for="city">City (optional)</label>
      <form:input type="text" class="form-control" id="city" path="city" />
      <div class="invalid-feedback"> Please provide a valid city.</div>
    </div>
	</div>
  <div class="form-row">
    <div class="col-md-6 mb-1 md-form">
      <label for="state">State (optional)</label>
      <form:input type="text" class="form-control" id="state" path="state" />
      <div class="invalid-feedback">
        Please provide a valid state.
      </div>
    </div>
	<div class="col-md-6 mb-1 md-form">
      <label for="pincode">Zip (optional)</label>
      <form:input type="text" class="form-control" id="pincode" path="pincode"/>
      <div class="invalid-feedback">
        Please provide a valid zip.
      </div>
    </div>
  </div>
  <div class="d-flex justify-content-center">
        <button class="btn btn-green">Add Profile</button>
  </div>
</form:form>
  </div>
</div>
</div>
<!-- Card -->
</div>
<br/>
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
  (function() {
	  'use strict';
	  window.addEventListener('load', function() {
	  // Fetch all the forms we want to apply custom Bootstrap validation styles to
	  var forms = document.getElementsByClassName('needs-validation');
	  // Loop over them and prevent submission
	  var validation = Array.prototype.filter.call(forms, function(form) {
	  form.addEventListener('submit', function(event) {
	  if (form.checkValidity() === false) {
	  	event.preventDefault();
	  	event.stopPropagation();
	  }
	  form.classList.add('was-validated');
	  }, false);
	  });
	  }, false);
	  })();
  </script>
</body>
</html>