<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">

</head>
<body>
<div class="container">
<h1>Register</h1>
<form:form action="register" method="post" commandName="user">
<fieldset class="form-group">
<table class="table"><tr><td>
<form:label path="emailId">Email Id</form:label></td><td>
<form:input path="emailId" name="emailId" type="text"/>
<form:errors path="emailId" cssClass="text-warning"/></td></tr>

<tr><td>
<form:label path="name">Name</form:label></td><td>
<form:input path="name" name="name" type="text"/>
<form:errors path="name" cssClass="text-warning"/></td></tr>

<tr><td>
<form:label path="password">Password</form:label></td><td>
<form:input path="password" name="password" type="password"/>
<form:errors path="password" cssClass="text-warning"/></td></tr>

<tr><td>
<form:label path="phno">Phone no</form:label></td><td>
<form:input path="phno" name="phno" type="text"/></td></tr>
<tr><td>
<form:label path="address">Address</form:label></td><td>


<form:input path="address" name="address" type="text"/>
<form:errors path="address" cssClass="text-warning"/></td></tr>

</table>
</fieldset>
<input class="btn btn-success" type="submit" value="Register"/>

</form:form>
</div>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>