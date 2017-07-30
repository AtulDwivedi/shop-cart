<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Verify OTP</title>
</head>
<body>
	<form action="user/verify" method="post">
		<input type="text" name="otp" placeholder="Enter OTP" /> <input
			type="submit" value="Submit OTP">
	</form>
</body>
</html>