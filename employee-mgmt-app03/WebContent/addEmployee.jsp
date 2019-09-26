<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>

<form class="form-inline" action="EmployeeController" method="post">

<form-group>
<label for="empid">Employee ID</label>
<input class="form-control" name="empid" type="number" >
<br>
<br>
<label for="empname">Employee Name</label>
<input class="form-control" name="empname" type="text" >
<br>
<br>
<label for="empdesig">Employee Designation</label>
<input class="form-control"  name="empdesig" type="text" >
<br>
<br>
<label for="empcountry">Employee Country</label>
<input class="form-control" name="empcountry" type="text" >
<br>
<br>
 <input class="form-control"  type="submit" value="Add Employee">
 <input class="form-control"  type="reset" value="Reset">
 <a href="index.jsp">Back</a>
 </form-group>
 
</form>

</body>
</html>