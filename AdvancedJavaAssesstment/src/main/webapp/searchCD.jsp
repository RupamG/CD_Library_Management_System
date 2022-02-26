<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search CD</title>
</head>
<body>
	<h3>CD Library</h3>
	<form action="ViewSearchedServlet">
		Release Year : <select name="releaseYear">
				<option value="1991">1991</option>
				<option value="1992">1992</option>
				<option value="1997">1997</option>
				<option value="1998">1998</option>
				<option value="2010">2010</option>
				<option value="2012">2012</option>
				<option value="2017">2017</option>
			</select><br>
			
		<input type="submit" value="search">
	</form>
	<br>
	<a href="homepage.html">Go back to home</a>
</body>
</html>