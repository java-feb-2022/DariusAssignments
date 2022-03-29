<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<body class="bg-secondary">
	<h1 class="text-info">Expense Detail</h1>
	<a href="/" class="text-info">Go Back</a>
	<table class="table">
		<tr>
			<td>Expense Name:</td>
			<td><c:out value="${displayDetail.expense }"/></td>
		</tr>
		<tr>
			<td>Expense Description:</td>
			<td><c:out value="${displayDetail.description }"/></td>
		</tr>
		<tr>
			<td>Vendor:</td>
			<td><c:out value="${displayDetail.vendor }"/></td>
		</tr>
		<tr>
			<td>Amount Spent:</td>
			<td><c:out value="${displayDetail.amount }"/></td>
		</tr>
	</table>
</body>
</html>