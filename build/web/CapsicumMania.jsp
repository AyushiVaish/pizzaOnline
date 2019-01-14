<%-- 
    Document   : CapsicumMania
    Created on : Jan 7, 2019, 12:31:07 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CAPISUM MANIA ORDER</title>
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
                height: 680px;
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
      <a href="#myPage" style="color:red;font-size:70px;font-family:Georgia;text-align: center"><b>FooDuDE</b></a>
    <div class="collapse navbar-collapse" id="myNavbar" style="font-size:20px;color:green;">
      <ul class="nav navbar-nav navbar-right">
           <li><a href="index.html">Menu</a></li>
            <li><a href="#section1">Inside FooDuDe</a></li>
          <li><a href="#section1">SPECIAL OFFERS</a></li>
          <li><a href="#section2">GIFT CARD</a></li>
           <li> <a href="tel:714653">
                   <span class="glyphicon glyphicon-earphone"></span> 714653</a></li>
        <li><a href="reister.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.sp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   
      </ul>
    </div>
  </div>
</nav>
    <form method="post">
        <div style="background-image:url(pizza.jpg)">
        <div class="form-area">
            <h1 STYLE="COLOR:RED">PLACE ORDER</h1>
            <div class="img-area">
                <img src="CapsicumVeg.jpg" class="img-circle">
            </div>
            <br>
            <h3>SIZE: <b>REGULAR</b></H3>
       
          <h3>CRUST</h3>
          <select name="crust">  
              <option value="new">Classic Hand Tossed Rs.69</option>
     
<option value="fresh">Fresh Pan Pizza Rs.94</option>

            </select>
           
       <h3 style="color:WHITE;">ADD QUANTITY :</h3>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
     
              
          <a href="#" class="btn btn-primary custom-btn" style="margin-top: 5%; margin-bottom: 5%">ADD TO CART</a></br>
      
         
        </div>
        </div>
        </form>
         <!-- About Container -->
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica" id="about"><b>About</b></h1>
<div class="w3-container w3-padding-64 w3-red w3-grayscale w3-xlarge" id="about">
  <div class="w3-content">
   
    <p>FooDuDE's Pizza India has remained focused on delivering great tasting Pizzas and sides, superior quality, exceptional guest care and value for money offerings.
        <br> <br>We have endeavored to establish a reputation for being a home delivery specialist capable of delivering pizzas within 30 minutes or else FREE to a community of loyal consumers from all our restaurants around the country.
        <br><br>FooDuDE's vision is focused on " Exceptional people on a mission to be the best pizza delivery company in the world!" We are committed to bringing fun, happiness and convenience to lives of our consumers by delivering delicious pizzas to their doorstep and our efforts are aimed at fulfilling this commitment towards a large and ever-growing guest base.<br>FooDuDE's constantly strives to develop products that suit the tastes of our consumers and hence delighting them. FooDuDE's believes strongly in the strategy of 'Think global and act local'.<br><br> Thus, time and again we have been innovating with delicious new products such as crusts, toppings and flavours suitable to the taste buds of Indian Consumers. Further providing value for money and affordable products to our consumers has been an important part of our efforts. Our initiatives such as Fun Meal and Pizza Mania have been extremely popular with consumers looking for an affordable and value for money meal option.<br><br>FooDuDE's believes that when a box of pizza is opened, family and friends come together to share the pizza. Hence, our brand positioning: ‘Yeh Hai Rishton Ka Time'That's why, all our efforts, whether it is a new innovative and delicious product, offering consumers value for money deals, great service, countrywide presence or the promise to deliver in 30 minutes or free are all directed towards making relationships stronger, warmer and more fun by giving consumers an opportunity to get together, catch up, reunite and spend more time together.Consumers can order their pizzas by calling the single Happiness Hotline number 714653 OR order online at Pizza Online.</p>
    <p><strong>The Chef?</strong> Mr. Italiano himself<img src="chef.jpg" style="width:150px" class="w3-circle w3-right" alt="Chef"></p>
    <p>We are proud of our interiors.</p>
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
             <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica">MORE INFORMATION</h1>
         <footer class="container-fluid text-center" style="BACKGROUND-COLOR:black;">
             <div class="row">
                 <div class="col-sm-4">
                     
                        
                         <h2 style="color:red ;text-align:left;">ORDER ONLINE</h2>
                              
                         <h5 style="color:blue;text-align:left"> <a href="menu.jsp">PIZZA MENU</a></h5>
                         <h5 style="color:blue;text-align:left"> <a href="#">NUTRITIONAL INFORMATION</a></h5>
                         
                         
                     
                 </div>
                 <div class="col-sm-4">
                     <h2 style="color:red;text-align: center;">CONTACT US </H2>
                    
                    
                     <h5 style="color:blue;text-align: center;"> <a href="#contact">CONTACT DETAIL</a></h5>
                     <h5 style="color:blue;text-align: center;"> <a href="feedback.jsp">FEEDBACK</a></h5>
                     
                 </div>
                 <div class="col-sm-4">
                     <H2 style="color:red ;text-align:right;">HELP</H2>
               
                     <h5 style="color:blue ;text-align:right;"> <a href="#">STORE FINDER</a></h5>
                     <h5 style="color:blue ;text-align:right;"> <a href="#map">SITE MAP</a></h5>
                     <h5 style="color:blue ;text-align:right;"> <a href="#">OTHERS</a></h5>
                     
                 </div>
                

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
         </footer>

    </body>
</html>
