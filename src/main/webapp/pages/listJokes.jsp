<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>List jokes</title>
		<link href="pages/css/style.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
		<%int i = 1;%>

	    <div align="center" >
	        <table class="joke_table">
	            <caption><h2>List of jokes</h2></caption>
	            <tr>
	                <th></th>
	                <th>Category</th>
	                <th>Content</th>
	            </tr>
	            <c:forEach var="joke" items="${jokes}">
	                <tr>
	                    <td><%out.print(i++);%></td>
	                    <td><c:out value="${joke.getCategory().getName()}" /></td>
	                    <td><c:out value="${joke.getContent()}" /></td>
	                </tr>
	            </c:forEach>
	        </table>
	        <br>
	        <a href="home">Return</a>
	    </div>
    </body>
</html>