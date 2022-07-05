<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="users.UserCollection" %>
    <%@page import="users.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h2> Show Information</h2>
</head>
<body>
<form action="show" method="POST">
<% UserCollection collection=UserCollection.getInstance(); %>
<% for(User u:collection.getList()){ %>
<label for="name"><b> Name: </b></label><br>
<%=u.getName() %><br>
<label for="name"><b> Rust: </b></label><br>
<%=u.getRust() %><br>
<label for="name"><b> Kilograms: </b></label><br>
<%=u.getKg() %><br>
<% } %>
<% HttpSession session1=(HttpSession)request.getAttribute("user"); %>
<button type="submit"> Logout</button>

</form>
</body>
</html>