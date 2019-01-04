<%-- 
    Document   : reister
    Created on : Jan 4, 2019, 2:52:12 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>REGISTER</title>
            <style>
            body {
                background-image: url(pizza.jpg);
                -webkit-background-size: cover;
                background-size:cover;
                background-position: center,center;
                
            }
            .form-area {
                width:500px;
                height: 750px;
                margin : 60px auto 0;
                position: relative;
                background: rgba(0,0,0,0.4);
                text-align:center;
 
                padding:35px;
                border:3px solid #fff;
                -webkit-border-radius:70px 0 70px 0;
                -moz-border-radius:70px 0 70px 0;
                border-radius: 70px 0 70px 0;
      
            }
            
            .form-area h2 {
                margin-bottom: 45px;
                color: #fff;
                
            }
            .img-area {
                width:50px;
                height:50px;
                border-radius:50%;
                background: tomato;
                position:absolute;
                top:-5%;
                left:45%;
                
            }
            .img-area img{
                width:95%;
                padding:10px;
            }
            input{
                width:100%;
                height:50px;
                border-radius:15px 0 15px 0;
                 border : 2px solid #fff;
                 margin-bottom: 15px;
                 background-color: transparent;
                 color: #fff;
            }
            .form-area p{
                text-align: left;
                color:#fff;
                text-transform: uppercase;
                font-weight:bold;
            }
            .btn {
                display:inline-block;
                height: 40px;
                width:150px;
                line-height: 40px;
                overflow: hidden;
                position: relative;
                text-align: center;
                background: tomato;
                border-radius: 25px;
                color:#fff;
                text-transform: uppercase;
                margin-top: 20px;
                cursor: pointer;
                text-decoration: none;
            }
            
            .for-pass {
                text-decoration: none;
                display:block;
                margin-top: 30px;
                font-weight: bold;
                font-size: 20px;
                color:#fff;
                
            }
        </style>
         <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
        <form method="post" action="ControllerServlet">

        
        <div class="form-area">
            <div class="img-area">
                <img src="icon2.jpg">
            </div>
            <h2>SIGNUP FORM</h2>
            <p>USER NAME:</p>
            <input type="text" id="username" required>
           
            <p>YOUR EMAIL:</p>
            <input type="email" id="email" required  />
             <p>YOUR PASSWORD:</p>
             <input type="password" title="Password must contain :Minimum 9 characters" id="pass" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" />
                   <p>YOUR CONTACT NUMBER:</p>
            <input type="number" id="number" required pattern="/^\d{10}$/" />
                <p>YOUR ADDRESS:</p>
                <input type="text" id="address" required />
                <p>YOUR ZIP CODE:</p>
                <input type="text" id="zip" required />
                
                <input type="submit" value="Sign In" class="btn"> 
                <p style="text-transform: lowercase; font-size: 20px; margin-top: 10px;">If you are already SignIn <a href="login.jsp">CLICK ME</a></p>
              
        </div>
        </form>
    </body>
</html>
