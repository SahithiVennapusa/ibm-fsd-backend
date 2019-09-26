<%@page import="com.examples.empapp.model.Employee"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Employees</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<% ArrayList<Employee> employees = (ArrayList) request.getAttribute("empList");
	  
	 %>
	 <% if(employees.size()!=0) {%>
	<h3>List Employees</h3>
	<%out.print("No of employees: " + employees.size()); %>
	<table  class="table table-hover">
		<thead> 
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Designation</td>
				<td>Country</td>
			</tr> 
		</thead>
		<tbody>
			<% for(Employee emp: employees) { %>
			<tr>
				<td><%= emp.getId() %> </td>
				<td><%= emp.getName() %> </td>
				<td><%= emp.getDesignation()%></td>
				<td><%= emp.getCountry() %> </td>
				
				
			</tr>
			<%} %>
			
		</tbody>
		</tbody>
	</table>
	<%} %>
	
	<% if(employees.size()==0) {%>
	<h3>No Employee Record Found</h3>
	<%} %>
	<br>
	
	<a href="index.jsp">Go Back</a>
	
</body>
</html>