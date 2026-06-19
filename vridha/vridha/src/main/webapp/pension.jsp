 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Pension Application Form</title>

<style>

body{
    font-family: Arial, sans-serif;
    background:#f4f6f9;
}

.container{
    width:500px;
    margin:30px auto;
    padding:30px;
    background:white;
    border-radius:10px;
    box-shadow:0px 0px 10px rgba(0,0,0,0.2);
}

h2{
    text-align:center;
    color:#2c3e50;
    margin-bottom:25px;
}

label{
    font-weight:bold;
}

input[type=text],
input[type=number],
select{
    width:100%;
    padding:10px;
    margin-top:5px;
    margin-bottom:15px;
    border:1px solid #ccc;
    border-radius:5px;
    box-sizing:border-box;
}

.gender{
    margin-top:10px;
    margin-bottom:15px;
}

input[type=submit]{
    width:100%;
    padding:12px;
    background:#28a745;
    color:white;
    border:none;
    border-radius:5px;
    font-size:16px;
    cursor:pointer;
}

input[type=submit]:hover{
    background:#218838;
}

</style>

</head>
<body>

<div class="container">

<h2>Pension Application Form</h2>

<form action="pension" method="post">

<label>Name</label>
<input type="text" name="name" required>

<label>Age</label>
<input type="number" name="age" required>

<label>Gender</label>

<div class="gender">
    <input type="radio" name="gender" value="Male" required> Male

    <input type="radio" name="gender" value="Female"> Female
</div>

<label>Aadhaar Number</label>
<input type="text" name="aadhaar" required>

<label>Mobile Number</label>
<input type="text" name="mobile" required>

<label>Annual Income</label>
<input type="text" name="income" required>

<label>Address</label>
<input type="text" name="address" required>

<label>Bank Account Number</label>
<input type="text" name="bankAccount" required>

<label>Nationality</label>
<select name="nationality">
    <option value="Indian">Indian</option>
    <option value="Other">Other</option>
</select>

<label>Pension Status</label>
<select name="pensionStatus">
    <option value="No">No</option>
    <option value="Yes">Yes</option>
</select>

<br><br>

<input type="submit" value="Apply For Pension">

</form>

</div>

</body>
</html>