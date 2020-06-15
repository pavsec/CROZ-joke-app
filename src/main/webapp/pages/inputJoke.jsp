<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>List jokes</title>
		<link href="pages/css/style.css" rel="stylesheet" type="text/css">
	</head>
	
	<body>
		<div align="center">
			<h2>Form for adding jokes</h2>
			<form action="inputJoke" method="post" object="${joke}">
				<textarea name="content" rows="10" cols="100"></textarea> <br><br>
				<div class="err">
				<span name="errors" class="err">
					<c:choose>
						<c:when test="${errors.hasErrors()}">
						Joke size must be between 1 and 1000 characters<br><br>
						</c:when>
						<c:otherwise></c:otherwise>
					</c:choose>
				</div>
				<select name="category" id="cat" >
					<c:forEach var="category" items="${cats}">
		                <option value="${category.getId()}">
		                    <c:out value="${category.getName()}"/>
		                </option>
		            </c:forEach>
				</select> <br><br>
				<input type="submit" name="submit">
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
			</form>
	        <br>
	        <a href="home">Return</a> <br><br>
	        <form action="/logout">
	        	<input type="submit" name="submit" value="Sign out">
	        </form>
		</div>
    </body>
</html>