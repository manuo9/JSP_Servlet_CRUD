<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="css/register.css"  type="text/css" rel="stylesheet"/>

</head>
<body>

        
<div class="login-container">
        <h2>Edit User</h2>
        <form method="post" action="Updating">
        
                <label for="userid">User ID</label>
                <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="text" id="userid" name="userid" required >
                </div>
           <label>Name</label>
           <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="text" name="name" required >
            </div>
            <label>Email</label>
           <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="email" name="email"  >
            </div>
            <label class="pass">Password</label>
            <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="password" name="password"  >
            </div>
            <button type="submit" name="submit" value="update" data-augmented-ui="br-clip border">Update</button>
              <div>
               <a  href ='fetch' style="color: red;padding-right: 10px; ">List</a>
            <a href ='Deleting' style="color: red;padding-right: 10px; ">Delete</a>
            <a href ='register' style="color: red">Edit</a>
            </div>
        </form>
    </div>
</body>
</html>