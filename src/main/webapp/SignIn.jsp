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
<h1>Authorization Page</h1>
<form action="IdentificationServlet" method="get">
		<input type="hidden" name="hiddenField" value="authorization" /> 
		Enter login:<br />
		<input type="text" name="login" value="" /><br /> 
		Enter password:<br />
		<input type="password" name="password" value="" /><br /> 
		
		<input type="submit" value="Отправить" /><br />
	</form>
</body>
</html>