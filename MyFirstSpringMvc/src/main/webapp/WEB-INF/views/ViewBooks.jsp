<%@page import="com.nttdata.model.Book"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
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
            <caption><h2>List of Books</h2></caption>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Authour Name</th>
                <th>Price</th>
                <th>Borrow</th>
            </tr>
            <%
            Object books=request.getAttribute("book"); 
         Object emailid=request.getAttribute("emailid");
            List<Book> l=(List)books;
            for(Book b:l){
            	out.println("<tr><td>"+b.getId()+"</td><td>"+b.getName()+"</td><td>"+b.getAuthor()+"</td><td>"+b.getPrice()+"</td><td><a href='listBookbyName?emailid="+emailid+"&bookname="+b.getName()+"'>Borrow</a></td></tr>");
            }
            %>

        </table>
    </div>
    <script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>