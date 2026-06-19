 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Vridha Pension Portal Login</title>

<style>

body{
    font-family: Arial, sans-serif;
    background-color:#f4f6f9;
}

.container{
    width:350px;
    margin:100px auto;
    padding:30px;
    border:1px solid #ccc;
    border-radius:10px;
    background:white;
    box-shadow:0px 0px 10px rgba(0,0,0,0.2);
}

h1{
    text-align:center;
    color:#2c3e50;
    font-size:24px;
}

input[type=email],
input[type=password]{
    width:100%;
    padding:10px;
    margin-top:5px;
    margin-bottom:15px;
    border:1px solid #ccc;
    border-radius:5px;
    box-sizing:border-box;
}

input[type=submit]{
    width:100%;
    padding:10px;
    border:none;
    border-radius:5px;
    background:#007bff;
    color:white;
    font-size:16px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#0056b3;
}

label{
    font-weight:bold;
}

</style>

</head>
<body>

<div class="container">

<h1>Vridha Pension Portal</h1>

<form action="login" method="post">

<label>Email</label>
<input type="email" name="email" required>

<label>Password</label>
<input type="password" name="password" required>

<input type="submit" value="Login">

</form>

</div>

</body>
</html>