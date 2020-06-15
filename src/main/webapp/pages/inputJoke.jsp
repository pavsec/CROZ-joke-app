<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>List jokes</title>
	</head>
	
	<body>
		<div align="center">
			<h2>Form for adding jokes</h2>
			<form action="inputJoke" method="post">
				<textarea name="content" rows="10" cols="100"></textarea> <br><br>
				<select name="category" id="cat" >
					<c:forEach var="category" items="${cats}">
		                <option value="${category.getId()}">
		                    <c:out value="${category.getName()}"/>
		                </option>
		            </c:forEach>
				</select> <br><br>
				<input type="submit" name="submit">
			</form>
	        <br>
	        <a href="home">Return</a> <br><br>
		</div>
    </body>
</html>