<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view CDs</title>
</head>
<body>
	<%@page import="java.util.*" %>
<%@page import="com.jd.cdlm.bean.*" %>

 

<% List<CDBean> eList=(List<CDBean>)request.getAttribute("cdBean"); %>

 

<% Iterator<CDBean> i=eList.iterator(); %>

 

<table border=1>
    <tr>
        <td>cdId</td>
        <td>cdName</td>
        <td>releaseYear</td>
        <td>price</td>
    </tr>
    <%while(i.hasNext()){
    CDBean eb=i.next();%>

 

    <tr>
        <td><%=eb.getCdId() %></td>
        <td><%=eb.getCdName() %></td>
        <td><%=eb.getReleaseYear() %></td>
        <td><%=eb.getPrice() %></td>
    <tr>
    <%} ; %>
</table>
<br>
<a href="homepage.html">Go back to home</a>
</body>
</html>