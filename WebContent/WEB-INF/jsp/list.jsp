<%@ page session="false"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="/spring" %>
<html>
	<head>
		<title>Success</title>
	</head>
	<body>
		<center>
			<table border="1">
			<core:forEach items="${employees}" var="emp">
			<tr>
				<Td><a href="update.html?id=${emp.id}">${emp.id}</a></Td>
				<Td>${emp.name}</Td>
				<Td>${emp.email}</Td>
			</tr>
			</core:forEach>
			</table>
			<a href="add.html">Add</a>
		</center>
	</body>
</html>
