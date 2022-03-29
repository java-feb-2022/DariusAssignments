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
<title>Expenses</title>
</head>
<body class="bg-warning">
	<h1>Save Travels</h1>

	<table class="table table-dark">
		<thead>
			<tr>
				<td class="font-weight-bold">Expenses</td>
				<td class="font-weight-bold">Vendor</td>
				<td class="font-weight-bold">Amount</td>
				<td class="font-weight-bold">Actions</td>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${travels}" var="travel">
				<tr>
					<td><a href="/detail/${travel.id}">${travel.expense}</a></td>
					<td>${travel.vendor}</td>
					<td>${travel.amount}</td>
					<td><a href="/update/${travel.id}">Edit</a> 
					<form:form action="/delete/${travel.id}" method="delete">
					<button class="btn btn-primary">Delete</button>
					</form:form>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<h2>Add Expense</h2>
	<form:form action="/create" method="post" modelAttribute="travel"  class="row justify-content-center">

	<p>
        <form:label class="text-center" path="expense">Expenses</form:label>
        <form:errors class="text-danger" path="expense"/>
        <form:input class="form-control" path="expense"/>
    </p>

    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors class="text-danger" path="vendor"/>
        <form:input class="form-control" path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors class="text-danger" path="amount"/>
        <form:input class="form-control" type="number" path="amount"/>
    </p>
    <p>
        <form:label path="description">Description</form:label>
        <form:errors class="text-danger" path="description"/>
        <form:textarea class="form-control" path="description"/>
    </p>
    <button class="btn btn-primary">Submit</button>
</form:form>
</body>
</html>