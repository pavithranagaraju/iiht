<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.nttdata.model.Borrow"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	    		rel="stylesheet">

</head>
<body><center>List of Books</center>
<div class="container">
        <table class="table table-striped">
            <caption><h2>List of Books you have borrowed</h2></caption>
            <tr>
                <th>Email Id</th>
                <th>Book ID</th>
                <th>Date</th>
                <th>Return</th>
            </tr>
            <%
            Object books=request.getAttribute("myborrow"); 
         Object emailid=request.getAttribute("emailid");
            List<Borrow> l=(List)books;
            if(l.isEmpty())
            	out.print("Sorry you have not borrowed any book");
            else
            for(Borrow b:l){
            	out.println("<tr><td>"+b.getEmailid()+"</td><td>"+b.getBookid()+"</td><td>"+b.getDate()+"</td><td><a href='returnBorrow?emailid="+b.getEmailid()+"&bookid="+b.getBookid()+"'>Return</a></td></tr>");
            }
            %>

        </table>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>