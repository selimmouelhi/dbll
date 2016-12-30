<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Insert title here</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="./WEB-INF/css/bootstrap.min.css" />
    <link rel="stylesheet" href="./WEB-INF/css/style.css" />
</head>

<body>
<div class="container">
    <div class="row">
        <div class="col-sm-6 col-md-4 col-md-offset-4">
            <h1 class="text-center login-title">Sign in to your ToDoList now !</h1>
            <div class="account-wall">
                <img class="profile-img" src="https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=120"
                    alt="">
                <form class="form-signin" action="login" method="post">
                <input type="text" class="form-control" placeholder="Username" required autofocus name="useremail"> <br>
                
                <input type="password" class="form-control" placeholder="Password" required name="userpassword"><br>
                <br>
                <button class="btn btn-lg btn-primary btn-block" type="submit">
                    Sign in</button><br>
                    <br>
                <label class="checkbox pull-left">
                    <input type="checkbox" value="remember-me">
                    Remember me
                </label>
                
                </form>
            </div>
            <a href="#" class="text-center new-account">Create an account </a>
        </div>
    </div>
</div>
<script src="./WEB-INF/js/jquery.min.js"></script>
<script src="./WEB-INF/js/bootstrap.min.js" ></script>
</body>
</html>