<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<title>NinjaDojos</title>
</head>
<table class="table table-responsive table-hover">
	<thead>
		<tr class="table-dark">
			<td>First Name</td>
			<td>Last Name</td>
			<td>Age</td>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${ninjas}" var="ninja">
			<tr>
				<td><c:out value="${ninja.firstName}" /></td>
				<td><c:out value="${ninja.lastName}" /></td>
				<td><c:out value="${ninja.age}" /></td>
			</tr>
		</c:forEach>
	</tbody>
</table>
</body>
</html>