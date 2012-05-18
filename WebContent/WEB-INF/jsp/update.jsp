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
			<tr>
				<Td>${employee.id}</Td>
				<Td>${employee.name}</Td>
				<Td>${employee.email}</Td>
			</tr>
			</table>
		</center>
	</body>
</html>
