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
<title>Login & Registration</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Register</h2>
				<form:form action="/registration" method="post"
					modelAttribute="newUser">
					<div class="form-group">
						<form:label path="userName">User Name</form:label>
						<form:errors class="text-danger" path="userName" />
						<form:input class="form-control" path="userName" />
					</div>
					<div class="form-group">
						<form:label path="email">Email</form:label>
						<form:errors class="text-danger" path="email" />
						<form:input class="form-control" path="email" />
					</div>
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:errors class="text-danger" path="password" />
						<form:password class="form-control" path="password" />
					</div>
					<div class="form-group">
						<form:label path="confirmPassword">Confirm Password</form:label>
						<form:errors class="text-danger" path="confirmPassword" />
						<form:password class="form-control" path="confirmPassword" />
					</div>
					<button class="btn btn-primary">Submit</button>
				</form:form>
			</div>
			<div class="col">
				<h2>Login</h2>
				<form:form action="/login" method="post" modelAttribute="newLogin">
					<div class="form-group">
						<form:label path="email">Email</form:label>
						<form:errors path="email" />
						<form:input class="form-control" path="email" />
					</div>
					<div class="form-group">
						<form:label path="password">Password</form:label>
						<form:errors path="password" />
						<form:password class="form-control" path="password" />
					</div>
					<button class="btn btn-primary">Submit</button>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>