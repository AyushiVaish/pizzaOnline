<%-- 
    Document   : chicken
    Created on : Jan 3, 2019, 4:26:58 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CHICKEN SPECIALITY</title>
                        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="style.css">


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
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
           <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
        <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">

      <div class="item active">
        <img src="pi.jpg" alt="Images" style="width:100%;">
       
      </div>

      <div class="item">
        <img src="pi2.jpg" alt="image" style="width:100%;">
        
       
      </div>
              <div class="item">
        <img src="pi3.jpg" alt="image" style="width:100%;">
        
       
      </div>
    
      <div class="item">
        <img src="pi4.jpg" alt="image" style="width:100%;">
       
      </div>
  
    </div> <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
    
        <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica"><b>CHICKEN SPECIALITY</b></h1><br>
      
        <div class="container text-center" style="background-color:black">
        <div class="row">
 
    <div class="col-sm-4"> 
        <H1 style="color:blue;">CHICKEN MEATBALLS - SRIRACHA
</H1>
      <img src="chi.png" class="img-circle"  style="width:100%" alt="Image">
    
    <a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
                         <div class="col-sm-3">
        <H1 style="color:violet;">BONELESS CHICKEN WINGS - LEMON PEPPER

</H1>
      <img src="boneless.png" class="img-circle"  style="width:100%" alt="Image">
      
    <a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
             <div class="col-sm-4">
                 <h1 style="color:olive">
ROASTED CHICKEN WINGS PERI-PERI
       </H1>
      <img src="roasted1.png" class="img-circle"  style="width:100%" alt="Image">
     
<a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
             </div>
        </DIV>
        </DIV>
              
        <div class="container text-center" style="background-color:black">
        <div class="row">
 
    <div class="col-sm-4"> 
        <H1 style="color:blue;">ROASTED CHICKEN WINGS CLASSIC HOT SAUCE
</H1>
      <img src="ROASTED.png" class="img-circle"  style="width:100%" alt="Image">
  
    <a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
                         <div class="col-sm-3">
        <H1 style="color:violet;">CHICKEN MEATBALLS PERI-PERI

</H1>
      <img src="ken.png" class="img-circle"  style="width:100%" alt="Image">
    
    <a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
             <div class="col-sm-4">
                 <h1 style="color:olive">
BONELESS CHICKEN WINGS PERI-PERI
       </H1>
      <img src="boneless1.png" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:seagreen;">
For all the meat cravers, try the classic non-veg Burger Pizza loaded with the goodness of burger and the greatness of pizza.
</p>
<a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>

             </div>
        </DIV>
        </DIV>
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
</html>