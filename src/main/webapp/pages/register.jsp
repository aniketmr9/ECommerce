<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<form action="/registerUser" method="post">
			First Name : <input type="text" name="firstName"><br>
			Last Name : <input type="text" name="lastName"><br>
			Username : <input type="text" name="username"><br>
			Password : <input type="text" name="password"><br>
			Email Address : <input type="text" name="emailAddress"><br>
			Contact : <input type="text" name="contact"><br>
			<input type="submit" value = "Register">
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
		</form>
	</div>
</body>
</html>