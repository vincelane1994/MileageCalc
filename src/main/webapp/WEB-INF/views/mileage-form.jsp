<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mileage Form</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body id ="mileage-form">
<form action ="/mileage-result">
		<h1>Enter your gas tank size.</h1>
		<p><input type="number" name="tankSize" step=".01"/> Gallons</p>
		
		<h1>Enter the amount of miles you can drive with a full tank.</h1>
		<p><input type="number" name="milesDriven" step=".01"/>Miles</p>
		
		<h1>Enter the distance of your trip</h1>
		<p><input type="number" name="tripDist" step=".01"/>Miles</p>
		
		<h1>Enter the price of gas</h1>
		<p><input type="number" name="gasCost" step=".01"/>USD</p>
		
		<p><button type="submit">Submit</button></p>
	</form>
</body>
</html>