<%-- 
    Document   : chickenGolden
    Created on : Jan 6, 2019, 5:08:38 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHICKEN GOLDEN DELIGHT</title>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="style.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<style>
             body {
               
                -webkit-background-size: cover;
                background-size:cover;
                background-position: center,center;
                
            }
            .form-area {
                width:500px;
                height: 1235px;
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
            
            .form-area h3 {
               
                color: #fff;
                
            }
         
   
       
            
       
        
</style>
<body>
         <nav class="navbar navbar-inverse ">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
          <span class="icon-bar"></span>
            <span class="icon-bar"></span>
                   
      </button>
        <div>
      <img src="pizzaIcon1.jpg" class="img-circle"  width="184" height="136">
        </div> 
    </div>
      <a href="index.html" style="color:red;font-size:70px;font-family:Georgia;text-align: center"><b>FooDuDE</b></a>
    <div class="collapse navbar-collapse" id="myNavbar" style="font-size:20px;color:green;">
      <ul class="nav navbar-nav navbar-right">
           <li><a href="index.html">Menu</a></li>
          
          <li><a href="specialOffer.jsp">SPECIAL OFFERS</a></li>
        
           <li> <a href="tel:714653">
                   <span class="glyphicon glyphicon-earphone"></span> 714653</a></li>
        <li><a href="reister.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   
      </ul>
    </div>
  </div>
</nav>
    <form method="post">
        <div style="background-image:url(pizza.jpg)">
        <div class="form-area">
            <h1 STYLE="COLOR:RED">PLACE ORDER</h1>
            <div class="img-area">
                <img src="chickenGolden.jpg" class="img-circle">
            </div>
            <br>
              <h3> SELECT SIZE :</h3> <select name="size">
                 <option value="regular">Regular 7''-Serves1  Rs.205</option>
                <option value="medium">Medium 10''-Serves2  Rs.385</option>
                 <option value="large">Large 13''-Serves3  Rs.595</option>
            </select>
          <h3>CRUST</h3>
          <select name="crust">  
              <option value="new">New Hand Tossed Rs.385</option>
            <option value="wheat">Wheat Thin Crust Rs.435</option>
<option value="cheese">Cheese Burst Rs.484</option>
<option value="fresh">Fresh Pan Pizza Rs.420</option>
<option value="Multi">MultiGrain MultiGrain Rs.445</option>
            </select>
       <h3 style="color:WHITE;">ADD QUANTITY :</h3>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
      <input type="checkbox" style="margin-top: 5%">  
           <h4 style="color: white;">  Add Extra Cheese @Rs.65</h4>
           </br> 
             <h3> ADD VEG TOPPINGS @ 50 EACH :</h3> 
               <b style="color: blue;">  Onion : </b><input type="checkbox"><br>
               <B style="color: blue;">Crisp Capisum : </b><input type="checkbox"><br>
               <b style="color: blue;">Fresh Tomato : </b><input type="checkbox"><br>
               <b style="color: blue;">Grilled Mushroom : </b><input type="checkbox"><br>
               <B style="color: blue;">Jalapeno : </b><input type="checkbox"><br>
               <b style="color: blue;">Black Olive : </b><input type="checkbox"><br>
               <B style="color: blue;">Red Paprika : </b><input type="checkbox"><br>
               <B style="color: blue;">Golden Corn : </b><input type="checkbox"><br>
               <B style="color: blue;">Paneer : </b><input type="checkbox"><br>
                             
                                    
               <h3> ADD NON-VEG TOPPINGS @ 65 EACH :</h3> 
               <b style="color: blue;">Pepper barbecue: </b><input type="checkbox"><br>
               <B style="color: blue;">Peri-Peri : </b><input type="checkbox"><br>
               <b style="color: blue;">Rasher: </b><input type="checkbox"><br>
               <b style="color: blue;">Sausage : </b><input type="checkbox"><br>
               <B style="color: blue;">Tikka : </b><input type="checkbox"><br>
        
          <a href="#" class="btn btn-primary custom-btn" style="margin-top: 5%; margin-bottom: 5%">ADD TO CART</a></br>
      
         
        </div>
        </div>
        </form>
                      <br><br>

<!-- Image of location/map -->
<img src="map1.jpg" class="w3-image w3-greyscale" style="width:100%;" id="map">

<!-- Contact -->
 <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica" id="contact"><b>CONTACT</b></h1>
<div class="w3-container w3-padding-64 w3-blue-grey w3-grayscale-min w3-xlarge">
  <div class="w3-content">
  <p class="w3-center w3-large">Lets get in touch. Send us a message:</p>
  <div style="margin-top:48px">
      <p><i class="fa fa-map-marker fa-fw w3-xxlarge w3-margin-right" ></i><a href="#"> Mumbai,India</a></p>
      <p><i class="fa fa-phone fa-fw w3-xxlarge w3-margin-right" ></i><a href="tel:714653"> Phone:716543</a></p>
      <p><i class="fa fa-envelope fa-fw w3-xxlarge w3-margin-right"> </i><a href="#"> Email: foodude12@gmail.com</a></p>
    <br>
    
   
  </div>
</div>
</div> <div class="container-fluid">
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica">MORE INFORMATION</h1>
         <footer style="background-color: black;">
 <div class="row">
     <div class="col-sm-5">
        
                     
                        
                         <h2 style="color:red ;text-align:left;">ORDER ONLINE</h2>
                              
                         <h5 style="color:blue;text-align:left"> <a href="#menu">PIZZA MENU</a></h5>
                         <h5 style="color:blue;text-align:left"> <a href="#">NUTRITIONAL INFORMATION</a></h5>
                         
                         
                     
                 </div>
                 <div class="col-sm-2">
                     <h2 style="color:red;text-align: center;">CONTACT US </H2>
                    
                     
                     <h5 style="color:blue;text-align: center;"> <a href="#contact">CONTACT DETAIL</a></h5>
                     <h5 style="color:blue;text-align: center;"> <a href="feedback.jsp">FEEDBACK</a></h5>
                     
                 </div>
                   <div class="col-sm-4">
                          <H2 style="color:red ;text-align:right;">HELP</H2>
               
                     <h5 style="color:blue ;text-align:right;"> <a href="#map">STORE FINDER</a></h5>
                    
                     <h5 style="color:blue ;text-align:right;"> <a href="#">Terms and Conditions</a></h5>
                     <h5 style="color:blue ;text-align:right;"> <a href="#">Privacy Policy</a></h5>
                     
                 </div>
                
 
             <br>
             
<p style="text-align:center">
<!--Facebook icon-->
<a href="http://facebook.com/flashissue" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/YdvNzBsfTrqg9Cx9Tozh_Facebook-e1386022800280.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp; &nbsp;
<!--Google+ icon-->
<a href="http://plus.google.com" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/HdT6jbRJRhqyPu3BKhi7_google-Plus-e1386022876181.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp;&nbsp;
<!--Twitter icon-->
<a href="http://twitter.com/flashissue" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/3b3zdiavSf26SleQOaDd_twitter-e1386023015819.png" style="height:50px; width:50px" /> </a>&nbsp; &nbsp;&nbsp;
<!--Linkedin icon-->
<a href="http://linkedin.com" target="_blank"><img alt="" src="https://s3.amazonaws.com/flashissue/dJtLdIsbRAix3zQhvygP_linkedin_icon_dark_hover-5be7d72ca83a10c0c76c32d141b0b828.png" style="height:50px; width:50px" /> </a>
</p>
  </div>
        </footer>
     
    </div>
<br>
  <p style="text-align: right"><b>All rights reserved. Copyright © FooDuDe Disclaimer | T&C | Privacy Policy </b></p>
         </body>
</html>