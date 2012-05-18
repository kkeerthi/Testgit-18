<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="/spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head><title>Login</title></head>
	<body>
		<center>
	
			<h3>Login page</h3>
			<br/>
	     		<form:form commandName="login22" method="POST" name="naveen">	
	            	Username:<form:input path="username"/> <font color="red"><form:errors path="username"/></font><br/><br/>
	            	Password:<form:password path="password"/><font color="red"><form:errors path="password"/></font><br/><br/>
	            	<input type="submit" value="Login"/>
	        	</form:form>
		</center>
	
	</body>
</html>
