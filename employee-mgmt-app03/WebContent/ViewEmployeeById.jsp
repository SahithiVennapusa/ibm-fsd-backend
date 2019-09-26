<%@page import="com.examples.empapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<%Employee emp =(Employee) request.getAttribute("employee");%>
<%if(emp.getId()!=0){ %>
	<h3>List Employees</h3>
	<table class="table table-hover">
		<thead> 
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Designation</td>
				<td>Country</td>
			</tr> 
		</thead>
		<tbody>
			
			<tr>
				<td><%= emp.getId() %> </td>
				<td><%= emp.getName() %> </td>
				<td><%= emp.getDesignation()%></td>
				<td><%= emp.getCountry() %> </td>
				
				
			</tr>
			
		</tbody>
		</tbody>
	</table>
	<%} %>
	
	<% if(emp.getId()==0) { %>
	<h3>Employee Doesn't Exist</h3>
	<%} %>
	
	<br>
	
	<a href="index.jsp">Go Back</a>
</body>
</html>