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
<title>Welcome</title>
</head>
<body>
	<h1>
		Welcome
		<c:out value="${loggedInUser.name}" />
	</h1>
	<a href="/books/new">+ Add a book to my shelf</a>
	<a href="logout">Logout</a>
	<table class="table ">
		<thead>
			<tr>
				<td>Title</td>
				<td>Author Name</td>
				<td>Posted By</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${books}" var="book">
				<tr>
					<td><a href="/book/${book.id}"><c:out value="${book.title }" /></a></td>
					<td><c:out value="${book.author }" /></td>
					<td><c:out value="${book.user.name }" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>