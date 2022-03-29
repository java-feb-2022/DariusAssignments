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
<title>Edit Books</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Register</h2>
				<form:form action="/editBook/${displayBook.id}" method="put"
					modelAttribute="editBook">
					<div class="form-group">
						<form:label path="title"> Title</form:label>
						<form:errors class="text-danger" path="title" />
						<form:input value="${displayBook.title }" class="form-control" path="title" />
					</div>
					<div class="form-group">
						<form:label path="author">Author</form:label>
						<form:errors class="text-danger" path="author" />
						<form:input value="${displayBook.author }" class="form-control" path="author" />
					</div>
					<div class="form-group">
						<form:label path="thoughts">My thoughts</form:label>
						<form:errors path="thoughts" class="text-danger" />
						<form:input value="${displayBook.thoughts}" class="form-control" path="thoughts"  />
						
					</div>
					<div class="form-group">
						<form:hidden path="user" value="${loggedInUser.id}"></form:hidden>
					</div>
					<button class="btn btn-primary">Submit</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>