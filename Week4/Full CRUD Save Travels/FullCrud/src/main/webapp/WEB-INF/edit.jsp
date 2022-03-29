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
<body class="bg-info">
	<h2>Update Expense</h2>
	<form:form action="/update/${editTravel.id}" method="put" modelAttribute="editTravel">
	<p>
        <form:label path="expense">Expenses</form:label>
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