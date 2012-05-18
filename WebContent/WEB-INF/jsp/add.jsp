<%@ page session="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="/spring" %>
<html>
	<head>
		<title>Success</title>
	</head>
	<body>
		<center>
			<form:form commandName="employee" action="save.html">
			name:<form:input path="name"/>
			email:<form:input path="email"/>
			<input type="submit" value="Add"/>
			</form:form>
		</center>
	</body>
</html>
