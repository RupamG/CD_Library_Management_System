<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update CD price</title>
</head>
<body>
<h3>CD Library</h3>
	<form action="UpdateCDPriceServlet">
		Enter the CD id: <input type="text" name="cdId"> <br>
		Enter the new price : <input type="text" name="price"><br>
		<input type="submit" value="update">
		
	</form>
	<br>
	<a href="homepage.html">Go back to home</a>
</body>
</html>