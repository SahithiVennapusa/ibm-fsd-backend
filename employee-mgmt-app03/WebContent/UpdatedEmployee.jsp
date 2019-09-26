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


<%Employee emp1 =(Employee) request.getAttribute("employee1");%>
<%if(emp1.getId()!=0){ %>
	<h3>Old Employee Details</h3>
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
				<td><%= emp1.getId() %> </td>
				<td><%= emp1.getName() %> </td>
				<td><%= emp1.getDesignation()%></td>
				<td><%= emp1.getCountry() %> </td>
				
				
			</tr>
			
		</tbody>
		</tbody>
	</table>
	<%} %>
	
	<% if(emp1.getId()==0) { %>
	<h3>Employee Doesn't Exist</h3>
	<%} %>
	
	<br>
	
	<%Employee emp2 =(Employee) request.getAttribute("employee2");%>
<%if(emp1.getId()!=0){ %>
	<h3>Updated Employee Details</h3>
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
				<td><%= emp2.getId() %> </td>
				<td><%= emp2.getName() %> </td>
				<td><%= emp2.getDesignation()%></td>
				<td><%= emp2.getCountry() %> </td>
				
				
			</tr>
			
		</tbody>
		</tbody>
	</table>
	<%} %>
	
	<% if(emp1.getId()==0) { %>
	<h3>Employee Cannot Be Updated</h3>
	<%} %>
	
	<br>
	
	<a href="index.jsp">Go Back</a>
</body>
</html>