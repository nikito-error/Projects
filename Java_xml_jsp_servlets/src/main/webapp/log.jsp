<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h2> Login form</h2>
</head>
<body>
<form action="log" method="POST">
<label for="username"><b>Confirm UserName: </b></label><br>
<input type="text" name="username" placeholder="Add Username"><br>
<label for="pass"><b>Confirm Password: </b></label><br>
<input type="text" name="password" placeholder="Add Password"><br>
<button type="submit"> Log in</button>
</form>

</body>
</html>