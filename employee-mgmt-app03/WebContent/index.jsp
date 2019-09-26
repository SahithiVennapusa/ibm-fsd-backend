<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">

</head>
<style>
div{
font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif;
}
</style>
<body>

<div>
<h1>Welcome to employee Management app</h1>

<a href = "addEmployee.jsp">Add Employee</a><br>
<a href = "viewEmployee.jsp">View Employee</a><br>
<a href = "updateEmployee.jsp">Update Employee</a><br>
<a href = "deleteEmployee.jsp">Delete Employee</a><br>
<form method="POST" action="listEmployees.do"><input type="submit" value="View All Employees"></form>
</div>
</body>
</html>