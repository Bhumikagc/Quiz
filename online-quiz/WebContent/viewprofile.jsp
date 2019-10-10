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
<input type="text" id = "${u.name}" name = "userId">

Hello, ${u.name}, ${u.userId}
<%-- Hello, ${u.name}, ${u.userId} --%>
<%-- <br />
User ID: ${u.userId}
<br /> --%>

</body>
</html>