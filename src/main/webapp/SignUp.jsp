<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="style.css" media="screen">

</head>
<body>
<h1>Registration Page !!!</h1>
<form action="IdentificationServlet" method="get">

		<input type="hidden" name="hiddenField" value="registration" /> 
		
		
		Enter login:<br />
		<input type="text" name="login" value="" /><br /> 
		
		Enter firstName:<br />
		<input type="text" name="firstName" value="" /><br /> 
		
		Enter lastName:<br />
		<input type="text" name="lastName" value="" /><br /> 
		
		
		Enter e-mail:<br />
		<input type="text" name="e-mail" value="" /><br /> 
		
		
		Enter password:<br />
		<input type="password" name="password" value="" /><br /> 
		
		<input type="submit" value="Send" /><br />
	</form>
</body>
</html>