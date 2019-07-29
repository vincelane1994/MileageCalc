<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mileage Result</title>
<link rel="stylesheet" href="/style.css" />
</head>
<body>
<h1 id="results" >Results</h1>
	<div class="results" >
		<p class="results" >If it takes ${milesDriven} miles to empty a tank of ${tankSize} gallons,<br>you are getting ${result} miles per gallon</p>
		<br>
		<br>
		<p class="results" >It will cost ${tripCost} to drive ${tripDist}<br>if your vehicle gets ${result}mpg,<br>and you will have to stop for gas at least ${refuel} times.</p>
	</div>
</body>
</html>