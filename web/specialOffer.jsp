<%-- 
    Document   : specialOffer
    Created on : Jan 14, 2019, 3:48:48 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>5 pepper order</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
         <link rel="stylesheet" href="style.css">


  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <nav class="navbar navbar-inverse">
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
           <li><a href="index.html">MENU</a></li>
           <li><a href="whishList.html"><i class="fa fa-shopping-cart" ></i> WHISH LIST</a></li>
           <li><a href="addRecipe.html"><span class="glyphicon glyphicon-log-in"></span> ADD YOUR RECIPES</a></li>
             <li><a href="admin.html"><span class="glyphicon glyphicon-user"></span> ADMIN PAGE</a></li>
        
           <li> <a href="tel:714653">
                   <span class="glyphicon glyphicon-earphone"></span> 714653</a></li>
      
    
      </ul>
    </div>
  </div>
</nav>
       
        
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica" id="menu"><b>Today's Everday Value Offers</b></h1><br>
  <div class="container">
       <div class="col-sm-6" >
           <h4 class="active">  <a href="specialOffer.jsp"><b style="color:blue">Regular Pizzas Starting @99 Each</b></a></h4>
       </div>
            <div class="col-sm-4">
                <h4><a href="mediumEverday.jsp"><b style="color:red">Medium Pizzas Starting @199 Each</b></a></h4>
            </div>
        
        </div>
         <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-5" >
        <h1 style="color:green;">2 Pizzas at ₹99 each</H1>
      <img src="at99.jpg" class="img-circle" alt="Image">
      <p style="color:blue">Select any 2 Regular Pizzas Worth <strike>₹165</strike> @ <span style="color:red">₹99</span> each
</p>
   <a href="order.jsp" class="btn btn-primary custom-btn">Avail Now</a>
      </div>
        <div class="col-sm-5" >
        <h1 style="color:violet;">2 Pizzas at ₹139 each</H1>
      <img src="at139.jpg" class="img-circle"  alt="Image">
      <p style="color:orange">
          Select any 2 Regular Pizzas Worth <strike>₹205</strike> @ <span style="color:red;">₹139</span> each</p>
   <a href="order.jsp" class="btn btn-primary custom-btn">Avail Now</a>
      </div>
  </div>
         </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-5" >
        <h1 style="color:olive;">2 Pizzas at ₹179 each</H1>
      <img src="at179.jpg" class="img-circle" alt="Image">
      <p style="color:maroon">
          Select any 2 Regular Pizzas Worth <strike>₹235</strike> @ <span style="color:red">₹179</span> each</p>
   <a href="order.jsp" class="btn btn-primary custom-btn">Avail Now</a>
      </div>
        <div class="col-sm-5" >
        <h1 style="color:red;">2 Pizzas at ₹219 each</H1>
      <img src="at319.jpg" class="img-circle"   alt="Image">
      <p style="color:blue">
          Select any 2 Regular Pizzas Worth <strike>₹295</strike> @ <span style="color:red">₹219</span> each</p>
   <a href="order.jsp" class="btn btn-primary custom-btn">Avail Now</a>
      </div>
  </div>
         </div>
       
   <br>
        <br>
          
         <div class="container" style="background-color:gray">
             <h1>Everyday Value Offer</h1>
             <p>Avail FooDuDe's Everyday Value Offers and get 2 Regular Pizzas starting at Rs.99 each or get 2 Medium Pizzas starting at Rs.199 each. View all the Everyday Value Offers & Pizza Deals below. T & C apply.</p>
             <br>
             <h3>Terms & Conditions:</h3>
             <p style="background-color:skyblue;">No Coupon codes are required for this offer.</p>
             <p style="background-color:skyblue;">Offer applicable on selected items.</p>
             <p style="background-color:skyblue;">Offer will not be applicable on Sides, Desserts and other Add-ons.</p>
             <p style="background-color:skyblue;">Offer cannot be clubbed with any other offer / scheme (such as Coupons / Pizza Mania).</p>
             <p style="background-color:skyblue;">Everyday Value Offer is only applicable when 2 Pizzas are selected from the options provided.</p>
             
             <br><br>
             <h1>FooDuDe's Coupons & Offers</h1>
             <br>
             <h3>Terms & Conditions:</h3>
             <p style="background-color:skyblue;">Discount applicable on selected items.</p>
             <p style="background-color:skyblue;">50% Discount will be applied to the pizza with the lesser value of the two pizzas.</p>
             <p style="background-color:skyblue;">Discount will be applied to prices of items within the cart. Taxes are not subject to discounts.</p>
             <p style="background-color:skyblue;">Discount will not be applicable to items already on discount.</p>
             <p style="background-color:skyblue;">Discount will not be applicable on Sides, Desserts and other Add-ons.</p>
             <p style="background-color:skyblue;">Discount cannot be clubbed with any other offer / scheme (such as Everyday Value Offer / Pizza Mania).</p>
             <p style="background-color:skyblue;">Only one Domino's coupon is applicable per transaction.</p>
         </div>
        
    
    <img src="im.jpg" style="width:100%" class="w3-margin-top w3-margin-bottom" alt="Restaurant">
    <h1><b>Opening Hours</b></h1>
    
    <div class="w3-row">
      <div class="w3-col s7">
        <p>Mon & Tue CLOSED</p>
        <p>Wednesday 10.00 - 24.00</p>
        <p>Thursday 10:00 - 24:00</p>
      </div>
      <div class="w3-col s7">
        <p>Friday 10:00 - 12:00</p>
        <p>Saturday 10:00 - 23:00</p>
        <p>Sunday Closed</p>
      </div>
    </div>
    
  </div>

  
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
    
    <form action="#" target="_blank">
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Name" required name="Name" style="color:black"></p>
        <p> <input class="w3-input w3-padding-16 w3-border" type="number" placeholder="How many people" required name="People"  style="color:black"></p> 
        <p>     <input class="w3-input w3-padding-16 w3-border" type="datetime-local" placeholder="Date and time" required name="date"  value="2017-11-16T20:00" style="color:black" ></p>        
        <p><input class="w3-input w3-padding-16 w3-border" type="text" placeholder="Message \ Special requirements" style="color:black;" required name="Message">
        <p>
        <button class="w3-button w3-black" type="submit">
          <i class="fa fa-paper-plane"></i> SEND MESSAGE
        </button>
      </p>
    </form>
  </div>
</div>
</div>
       <div class="container-fluid">
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica">MORE INFORMATION</h1>
         <footer style="background-color: black;">
 <div class="row">
      <div class="col-sm-5">
        
                     
                        
                         <h2 style="color:red ;text-align:left;">ORDER ONLINE</h2>
                              
                         <h5 style="color:blue;text-align:left"> <a href="index.html">PIZZA MENU</a></h5>
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
                  <h5 style="color:blue ;text-align:right;"> <a href="termsAndConditions.html">Terms and Conditions</a></h5>
                     <h5 style="color:blue ;text-align:right;"> <a href="privacy.html">Privacy Policy</a></h5>
                 </div>   <br>
             
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
 <p style="text-align: right"><b>All rights reserved. Copyright © FooDuDE Disclaimer | T&C | Privacy Policy </b></p>
 
         </body>
</html>