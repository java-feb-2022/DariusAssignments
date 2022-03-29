<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<title>Results</title>
</head>
<body class="d-flex flex-column align-items-center bg-dark ">
	<h1 class="mt-5 text-info">Here's your Omikuji</h1>
	<p class="w-25 mt-1 text-info">In <c:out value="${number}"></c:out> years, you will 
	live in <c:out value="${city}"></c:out>with <c:out value="${person}"></c:out>
	as your roommate, selling <c:out value="${hobby}"></c:out> for a living.
	The next time you will see a <c:out value="${living}"></c:out> 
	you will have good luck. Also <c:out value="${nice}"></c:out></p>
</body>
</html>