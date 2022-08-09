<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Order Report</title>
</head>
<h1>Order Report</h1>
<body>
	<form:form modelAttribute="billRangeBean" method="POST" action = "pizza/report">
		<div align="center">
			<table>
				<tr>
					<td>From Price</td>
					<td><form:input path="fromPrice"/></td>
					
					<td>To Price</td>
					<td><form:input path="toPrice"/></td>
				</tr>
			</table>
			<br><br>
			<form:button>Fetch Details</form:button>
		</div>
	</form:form>
	<br><br><br><br>
	<c:if test="${not empty report}">
		<div align="center">
			<table border="2">
				<tr>
					<th>Order ID</th> <th>Customer Name</th> <th>Pizza ID</th> <th>Bill</th> <th>Quantity</th>
				</tr>
				
				<c:forEach var="var" items="${report}">
					<tr>
						<td>${var.orderId}</td> <td>${var.customerName}</td> <td>${var.pizzaId}</td> <td>${var.bill}</td> <td>${var.quantity}</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:if>
	
</body>
</html>