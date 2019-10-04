<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>
<form:form target="add" method="POST" modelAttribute="employee">
	<p>Enter Name: <form:input path="name" /> </p>
	<p>Enter Id: <form:input path="id" /> </p>
	<p>Enter Designation: <form:input path="des"/></p>
	<p>Enter Salary: <form:input path="sal" /> </p>	

	<p><button type="submit" value="Submit">update</button> <button type="reset" value="Reset">Reset</button> </p>
</form:form>

</body>
</html>