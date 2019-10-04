<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
<form:form target="delete" method="POST" modelAttribute="employee" >
	
	<p>Enter Id: <form:input path="id" /> </p>
	

	<p><button type="submit" value="Submit">Delete</button> <button type="reset" value="Reset">Reset</button> </p>
</form:form>

</body>
</html>