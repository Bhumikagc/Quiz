<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="registerstyle.css" rel="stylesheet">
</head>
<body>
<h2 style="text-align: center;">Registration Form</h2>


  <form action="RegistrationServlet" method = "post">
  <div class="container">
  <div class="row">
    <div class="col-25">
      <label for="name">Enter Name </label>
    </div>
    <div class="col-75">
      <input type="text" id="name" name="name" placeholder="Your name...">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="userId">Enter User ID </label>
    </div>
    <div class="col-75">
      <input type="text" id="userId" name="userId" placeholder="Your user Id...">
    </div>
  </div>
   <div class="row">
    <div class="col-25">
      <label for="pass">Enter Password </label>
    </div>
    <div class="col-75">
      <input type="text" id="password" name="password" placeholder="Your password...">
    </div>
  </div>
  <div class="row">
    <div class="col-25">
      <label for="number">Enter Mobile Number </label>
    </div>
    <div class="col-75">
      <input type="text" id="number" name="number" placeholder="Your mobile number...">
    </div>
  </div>
  
   <div class="row">
    <div class="col-25">
      <label for="dob">Enter Date Of Birth </label>
    </div>
    <div class="col-75">
      <input type="date" id="dob" name="dob" placeholder="Your dob in d/MM/yyyy format...">
    </div>
  </div>
  <br />
  <div class="row" >
    <input type="submit" value="Submit" style="text-align: center;" >
  </div>
  </div>
  </form>

	<!-- <form action = "StoreServlet" method="post">
		Enter Name: <input type = "text" name = "n1"> <br />
		Enter User ID: <input type = "text" name = "n2"><br />
		Enter Password: <input type = "password" name = "n3"> <br />
		Enter Birthday <input type = "date" name = "n4"> <br />
		<span>d/MM/yyyy format</span> <br />
		Enter Contact No: <input type="number" name = "n5"><br />
		<input type = "submit" value = "REGISTER">
	</form> -->
</body>
</html>