<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="viewprofilestyle.css" rel="stylesheet">
</head>
<body>

	<h2>Profile Details</h2>
	<table border = "1">
		<tr>
			<th>ID<th>Name</th><th>Mobile No</th><th>Date Of Birth</th>
		</tr>
	<tr>
		<td>${u.userId}</td><td>${u.name}</td><td>${u.mobileNo}</td><td>${u.date}</td>
	</tr>
	</table>

</body>
</html>