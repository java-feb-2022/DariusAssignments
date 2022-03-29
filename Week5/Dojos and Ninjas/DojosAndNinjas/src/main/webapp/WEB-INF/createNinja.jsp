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
<title>Insert title here</title>
</head>
<body>
	<form:form action="/createNinja" method="post" modelAttribute="newNinja">
		<p>
			<form:label path="firstName">First Name</form:label>
			<form:errors path="firstName" />
			<form:input path="firstName" />
		</p>
		<p>
			<form:label path="lastName">Last Name</form:label>
			<form:errors path="lastName" />
			<form:input path="lastName" />
		</p>
		<p>
			<form:label path="age">Age</form:label>
			<form:errors path="age" />
			<form:input type="number" path="age" />
		</p>
		<p>
			<form:select path="dojo">
				<c:forEach items="${dojos}" var="allDojos">
					<option value="${allDojos.id}">${allDojos.name}</option>
				</c:forEach>
			</form:select>
		</p>
		<button class="btn btn-primary">Submit</button>
	</form:form>
</body>
</html>