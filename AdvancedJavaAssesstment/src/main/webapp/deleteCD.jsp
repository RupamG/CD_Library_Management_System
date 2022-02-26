<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete CD</title>
</head>
<body>
	<h3>CD Library</h3>
	<form action="DeleteCDServlet">
		Enter the CD id: <input type="text" name="cdId"> <br>
		<input type="submit" value="delete">
		
	</form>
	<br>
	<a href="homepage.html">Go back to home</a>
</body>
</html>