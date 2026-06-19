 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Dashboard</title>

<style>

body{
    font-family: Arial, sans-serif;
    background:#f4f6f9;
    margin:0;
    padding:0;
}

.container{
    width:80%;
    margin:50px auto;
    text-align:center;
}

h1{
    color:#2c3e50;
    margin-bottom:40px;
}

.card{
    width:300px;
    margin:20px auto;
    padding:25px;
    background:white;
    border-radius:10px;
    box-shadow:0px 0px 10px rgba(0,0,0,0.2);
}

.btn{
    display:inline-block;
    text-decoration:none;
    background:#007bff;
    color:white;
    padding:12px 20px;
    border-radius:5px;
    font-size:16px;
}

.btn:hover{
    background:#0056b3;
}

</style>

</head>
<body>

<div class="container">

<h1>Welcome To Vridha Pension Portal</h1>

<div class="card">

<h3>Pension Services</h3>

<p>Apply for Senior Citizen Pension Scheme</p>

<a href="pension" class="btn">Apply Pension</a>

<a href="admin">Admin Panel</a>

</div>

</div>

</body>
</html>