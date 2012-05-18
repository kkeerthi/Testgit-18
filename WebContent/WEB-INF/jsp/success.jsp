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
			<h1>Welcome <core:out value="${name}"/></h1><br>
			<a href="login.html">Back</a>
			
			<%-- <core:forEach items="${loginObj}">
			</core:forEach> --%>
			<br><br>
			
			<core:out value="${loginObj.username}"></core:out>
			<core:out value="${loginObj.password}"></core:out>
			
			<table>
			<core:forEach items="${objs}" var="obj">
			<tr>
				<Td>${obj.username}</Td>
				<Td>${obj.password}</Td>
			</tr>
			</core:forEach>
			</table>
		</center>
	</body>
</html>
