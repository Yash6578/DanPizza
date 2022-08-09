<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<style>
h1 {
  text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Save Order</title>
</head>
<h1>Save Order</h1>
<body>
	<form:form modelAttribute="pizzaOrderBean" method="POST" action = "pizza/order">
		<div align="center">
			<table border="2">
				<tr>
					<td>Customer Name</td>
					<td>
						<form:input path="customerName"/>
					</td>
				</tr>
				
				<tr>
					<td>Customer Contact</td>
					<td>
						<form:input path="contactNumber"/>
					</td>
				</tr>
				
				<tr>
					<td>Pizza Name</td>
					<td>
						<form:select path="pizzaId">
							<form:option value="" label="--Select--"/>
							<form:options items="${pizzaList}"/>
						</form:select>
					</td>
				</tr>
				
				<tr>
					<td>Quantity</td>
					<td>
						<form:input path="quantity"/>
					</td>
				</tr>
				
				<tr>
					<td></td>
					<td><form:button>Order</form:button> </td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>