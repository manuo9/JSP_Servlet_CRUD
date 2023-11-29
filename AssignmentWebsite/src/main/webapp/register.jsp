<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="css/register.css"  type="text/css" rel="stylesheet"/>

</head>
<body>

        
<div class="login-container">
        <h2>Register Accounts</h2>
        <form method="post" action="register">
           <label>Name</label>
           <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="text" name="name" required >
            </div>
            <label>Email</label>
           <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="email" name="email" required >
            </div>
            <label class="pass">Password</label>
            <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="password" name="password" required >
            </div>
            <button type="submit" name="submit" value="register" data-augmented-ui="br-clip border">Register</button>
            <div>
               <a  href ='fetch' style="color: red;padding-right: 10px; ">List</a>
            <a href ='Deleting' style="color: red;padding-right: 10px; ">Delete</a>
            <a href ='Updating' style="color: red">Edit</a>
            </div>
         
        </form>
    </div>
</body>
</html>