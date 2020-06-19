<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>user details</title>
</head>
<body>
<h1>user contact details</h1>
<h2>${param.msg}</h2>
<form action='CreateController'>
Name    <input type='text' name='nm'><br>
contact <input type='text' name='con'><br>
email    <input type='text' name='em'><br>
<input type='submit' value='create'>
</form>
</body>
</html>