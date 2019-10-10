<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="homepagestyle.css" rel="stylesheet">

</head>
<body>
<form action="ViewProfileServlet" method = "get">
<h3 style="text-align: right">Hello, ${u.name}</h3>


<input type = "submit" value = "VIEW PROFILE" style="text-align: center;">
</form>

<br />
<br />

<p><a href = "LogoutServlet"> 
<input type="submit" value="LOGOUT" style="text-align: center;">
</a></p>

</body>
</html>