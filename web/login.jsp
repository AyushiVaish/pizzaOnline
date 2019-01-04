<%-- 
    Document   : login
    Created on : Jan 4, 2019, 1:08:16 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
        <style>
            body {
                background-image: url(pizza.jpg);
                -webkit-background-size: cover;
                background-size:cover;
                background-position: center,center;
                
            }
            .form-area {
                width:500px;
                height: 600px;
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
                width:60%;
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
     
            .form-area p{
                text-align: left;
                color:#fff;
                text-transform: uppercase;
                font-weight:bold;
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
                     <script type ="text/javascript" >
            window.onload = function() {
                var txtPassword = document.getElementById("txtPassword");
                var txtConfirmPassword = document.getElementById("txtConfirmPassword");
                txtPassword.onchange= ConfirmPassword;
                txtConfirmPassword.onkeyup= ConfirmPassword;
                function ConfirmPassword() {
                    txtConfirmPassword.setCustomValidity("");
                    if(txtPassword.value != txtConfirmPassword.value) {
                        txtConfirmPassword.setCustomValidity("Passwords do not much");
                    }
                }
            }
            </script>
             <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body><form action="LoginServlet" method="post" id="form1">
        <div class="form-area">
            <div class="img-area">
                <img src="icon2.jpg">
            </div>
            <h2>LOGIN FORM</h2>
           
            <p>YOUR EMAIL:</p>
            <input type="email" required id="email" />
             <p>YOUR PASSWORD:</p>
             <input name="txtPassword" type="password" id="txtPassword" title="Password must contain :Minimum 9 characters"
                                                   placeholder="Enter password" required pattern="^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$" />
       
             <p>CONFIRM PASSWORD:</p>
            <input name="txtConfirmPassword" type="password" id="txtPassword"  placeholder="Confirm password" />    
          <input type="submit" value="LOGIN" class="btn"> 
           <p style="text-transform: lowercase; font-size: 20px; margin-top: 10px;">If you have not been registered yet <a href="reister.jsp"> CLICK ME</a></p>
            
            <a href="reset.jsp" class="for-pass">FORGOT PASSWORD</a>
                
        </div>
        </form> 
    </body>
</html>
