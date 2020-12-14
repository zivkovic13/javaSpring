<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <link rel="stylesheet" href="style.css">
  <link href="https://fonts.googleapis.com/css?family=Ubuntu" rel="stylesheet">
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
  <title>Register</title>
</head>

<body>
  <div class="main">
    <p class="sign" align="center">Register</p>
    <form class="form1">
      <input class="un " type="text" align="center" placeholder="First Name"
      		 onfocus="this.placeholder = ''" required>
      <input class="pass" type="password" align="center" placeholder="Last Name"
    		 onfocus="this.placeholder = ''" required>
      <input class="pass" type="password" align="center" placeholder="Email"
    		 onfocus="this.placeholder = ''" required>
   	  <input class="pass" type="password" align="center" placeholder="Password"
    		 onfocus="this.placeholder = ''" required>
      <a class="submit" align="center">Register</a>
      <p class="forgot" align="center"><a href="/login">Login</p>
    </form>      
                
    </div>
     
</body>

</html>