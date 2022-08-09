<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Pizza</title>
</head>
<h1>Add Pizza</h1>
<body>
	<form:form modelAttribute="pizzaBean" method="POST" action = "pizza/save">
		<div align="center">
			<table>
				<tr>
					<td>Pizza Name</td>
					<td><form:input path="pizzaName"/></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><form:input path="price"/></td>
				</tr>
				<tr>
					<td></td>
					<td><form:button>Save</form:button> </td>
				</tr>
			</table>
		</div>
	</form:form>
</body>
</html>