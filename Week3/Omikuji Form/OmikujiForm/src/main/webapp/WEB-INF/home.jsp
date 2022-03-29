<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji Form</title>
</head>
<body class="d-flex flex-column align-items-center bg-primary">
	<form action="/processForm" method="post">
		<div class="mb-3 text-center">
		<label for="num">Pick a number from 1 to 25</label>
		<input type="number" min="5" max="25" name="num" required/>
		</div>
		<div class="mb-3 text-center">
		<label for="city">Enter the name of any city</label>
		<input type="text" name="city" required/>
		</div>
		<div class="mb-3 text-center">
		<label for="person">Enter the name of a real person</label>
		<input type="text" name="person" required/>
		</div>
		<div class="mb-3 text-center">
		<label for="hobby">Enter professional endeavor or hobby</label>
		<input type="text" name="hobby" required/>
		</div>
		<div class="mb-3 text-center">
		<label for="living">Enter any type of living thing</label>
		<input type="text" name="living"  required/>
		</div>
		<div class="mb-3 text-center">
		<label for="nice">Enter something nice you would say to someone</label>
		<input type="text" name="nice"  required/>
		</div>
		
		<p class="text-center">Send and show a friend</p>
		<button class="btn btn-primary border border-2 border-warning text-warning mt-3">Submit</button>
	</form>
</body>
</html>