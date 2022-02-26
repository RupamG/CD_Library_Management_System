<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add CD</title>
</head>
<body>
	<h3>CD Library</h3>
	<form action="AddCDServlet">
		CD id: <input type="text" name="cdId"><br>
		CD Name : <input type="text" name="cdName"><br>
		Release Year : <select name="releaseYear">
				<option value="1991">1991</option>
				<option value="1992">1992</option>
				<option value="1997">1997</option>
				<option value="1998">1998</option>
				<option value="2010">2010</option>
				<option value="2012">2012</option>
				<option value="2017">2017</option>
			</select><br>
		CD price : <input type="text" name="price"><br>
		
		<input type="submit" value="submit">
		<input type="reset" value="clear">
			
			
	</form>
	
	<br>
	<a href="homepage.html">Go back to home</a>
</body>
</html>