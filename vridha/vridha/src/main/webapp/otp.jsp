 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>OTP Verification</title>

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

h2{
    text-align:center;
    color:#2c3e50;
}

input[type=text]{
    width:100%;
    padding:10px;
    margin-top:10px;
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
    background:#28a745;
    color:white;
    font-size:16px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#218838;
}

label{
    font-weight:bold;
}

</style>

</head>
<body>

<div class="container">

<h2>OTP Verification</h2>

<form action="verifyotp" method="post">

<label>Enter OTP</label>

<input type="text" name="otp" required>

<input type="submit" value="Verify OTP">

</form>

</div>

</body>
</html>