<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>List jokes</title>
	</head>
	
	<body>
		<%int i = 1;%>

	    <div align="center">
	        <table border="1" cellpadding="5">
	            <caption><h2>List of jokes</h2></caption>
	            <tr>
	                <th></th>
	                <th>Content</th>
	                <th>Category</th>
	            </tr>
	            <c:forEach var="joke" items="${jokes}">
	                <tr>
	                    <td><%out.print(i++);%></td>
	                    <td><c:out value="${joke.getContent()}" /></td>
	                    <td><c:out value="${joke.getCategory().getName()}" /></td>
	                </tr>
	            </c:forEach>
	        </table>
	        <br>
	        <a href="home">Return</a>
	    </div>
    </body>
</html>