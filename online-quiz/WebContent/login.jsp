<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>


<link href="loginstyle.css" rel="stylesheet">
</head>
<body>


<h2 style="text-align: center; color: white;">Login Form</h2> <br />
<h3 style = 'color:red'>${w}</h3>
<h3 style = 'color:green'>${msg}</h3>

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
      <input type="password" id="password" name="password" placeholder="Your password...">
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