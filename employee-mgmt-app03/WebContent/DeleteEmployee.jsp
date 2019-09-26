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




<form class="form-inline" action="DeleteEmployeeByIdController" method="post">
<form-group>
<label for="empid">Employee ID</label>
<br>
<input class="form-control" name="empid" type="number" >
<br>
 <input class="form-control" type="submit" value="Delete Employee">
 <input class="form-control" type="reset" value="Reset">
 <br>
 <br>
 </form-group>

</form>

</body>
</html>