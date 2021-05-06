<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h2>Car Table Inventory</h2>
<hr>
<br/>

<table border="1">
		
	<tr>
		<th>Model Name</th>
		<th>Car Type</th>
		<th>Car Details</th>		
	</tr>	
	
	<c:forEach var="tempCar" items="${car_list}">
		
		<tr>
			<td>${tempCar.modelName}</td> 
			<td>${tempCar.carType}</td> 
			<td>${tempCar.carDetails}</td> 
		</tr>
		
	</c:forEach>

</table>

</body>
</html>