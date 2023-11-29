<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
 <link href="css/register.css"  type="text/css" rel="stylesheet"/>

</head>
<body>

        
<div class="login-container">
        <h2>Delete Account Info</h2>
        <form method="post" action="Deleting">
        
                <label for="userid">User ID</label>
                
                <div class="input-container" data-augmented-ui="bl-clip tr-clip border">
                <input type="text" id="userid" name="userid" required >
                </div>
         
         
            <button type="submit" name="submit" value="delete" data-augmented-ui="br-clip border">Delete</button>
            
             <div>
               <a  href ='fetch' style="color: red;padding-right: 10px; ">List</a>
            <a href ='register' style="color: red;padding-right: 10px; ">Delete</a>
            <a href ='Updating' style="color: red">Edit</a>
            </div>
        </form>
    </div>
</body>
</html>