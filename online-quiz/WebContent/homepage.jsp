<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-image: url('quiz1.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}

input[type=submit] {
  background-color: orange;
  color: white;
  padding: 12px 20px;
  border: none;
  border-radius: 9px;
  cursor: pointer;
  float: inherit;
  width: 150px;
  height: 50px
  
}

input[type=submit]:hover {
  background-color: darkorange;
}
</style>

</head>
<body>

Hello ${u.name}
<a href = "index.html"> <input type="submit" value="LOGOUT" ></a>
</body>
</html>