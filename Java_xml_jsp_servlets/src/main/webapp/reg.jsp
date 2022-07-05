<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<h2> Register form</h2>
<title>Insert title here</title>
</head>
<body>
<form action="reg" method="POST">
<label for="name"><b>Name: </b></label><br>
<input type="text" name="name" placeholder="Add Name"><br>
<label for="pname"><b>UserName: </b></label><br>
<input type="text" name="pname" placeholder="Add Username"><br>
<label for="pass"><b>Password: </b></label><br>
<input type="text" name="pass" placeholder="Add Password"><br>

<label for="rust"><b>Rust: </b></label><br>
<input type="text" name="rust" placeholder="Add High"><br>

<label for="kg"><b>Kilograms: </b></label><br>
<input type="text" name="kg" placeholder="Add Kilograms"><br>
<button type="submit"> Register</button>






</form>

</body>
</html>