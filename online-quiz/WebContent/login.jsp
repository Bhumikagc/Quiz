<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <style>

* {
  	box-sizing: border-box;
}

input[type=text], select, textarea {
  width: 100%;
  padding: 12px;
  border: 1px solid #ccc;
  border-radius: 4px;
  resize: vertical;
}

label {
  padding: 12px 12px 12px 0;
  display: inline-block;
}

input[type=submit] {
  background-color: #4CAF50;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  float: right;
  
}

input[type=submit]:hover {
  background-color: #45a049;
}

.container {
  border-radius: 5px;
  background-color: lightblue;
  padding: 20px;
}

.col-25 {
  float: left;
  width: 25%;
  margin-top: 6px;
}

.col-75 {
  float: left;
  width: 75%;
  margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
  content: "";
  display: table;
  clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
  .col-25, .col-75, input[type=submit] {
    width: 100%;
    margin-top: 0;
  }
}



body {
  background-image: url('login-background.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>-->

<link href="loginstyle.css" rel="stylesheet">
</head>
<body>


<h2 style="text-align: center; color: white;">Login Form</h2> 


  <form action="LoginServlet" method = "post">
  <div class="container">
  <div class="row">
    <div class="col-25">
      <label for="userId">Enter UserId </label>
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
    <br />
  <div class="row" >
    <input type="submit" value="Submit" style="text-align: center;" >
  </div>  
  </div>
 </form>



<!-- 	<form action = "LoginServlet" method="post">
		Enter UserId: <input type = "text" name = "n1"> <br />
		Enter Password: <input type = "password" name = "n2"> <br />
		<input type = "submit" value = "LOGIN">		
	</form> -->
</body>
</html>