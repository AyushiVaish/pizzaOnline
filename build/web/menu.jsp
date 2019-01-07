<%-- 
    Document   : menu
    Created on : Jan 2, 2019, 4:33:39 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
  
    </div>
     <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica"><b>VEG PIZZAS</b></h1><br>
         <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:green;">Margherita</H1>
      <img src="Margherit.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:darkgreen">
A hugely popular margherita, with a deliciously tangy single cheese topping

</p>
   <a href="home.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:red;">Double Cheese Margherita</H1>
      <img src="Double_Cheese_Margherita.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:maroon;">
The ever-popular Margherita - loaded with extra cheese... oodies of it!</p>    
   <a href="douleCheese.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>

        <div class="col-sm-4"> 
                   <H1 style="color:goldenrod;">Farm House</H1>
      <img src="Farmhouse.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:lightcoral">
A pizza that goes ballistic on veggies! Check out this mouth watering overload of crunchy, crisp capsicum, succulent mushrooms and fresh tomatoes

 </p>    
    <a href="FarmHouse.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
        </div>
  </div>
        </div>
        
    <div class="container text-center" style="background-color:black">
        <div class="row">
 
    <div class="col-sm-4"> 
        <H1 style="color:blue;">Peppy Paneer
</H1>
      <img src="Peppy_Paneer.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:midnightblue;">Chunky paneer with crisp capsicum and spicy red pepper - quite a mouthful!</p>    
    <a href="peppyPaneer.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
             <div class="col-sm-4">
                 <h1 style="color:olive"> </br>
         Mexican Green Wave</H1>
      <img src="Mexican_Green_Wave.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:seagreen;">
A pizza loaded with crunchy onions, crisp capsicum, juicy tomatoes and jalapeno with a liberal sprinkling of exotic Mexican herbs.</p>
<a href="Mexican.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
             </div>
        <div class="col-sm-4"> 
            <H1 style="color:darkred;">Deluxe Veggie</H1>
      <img src="Deluxe_Veggie.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:crimson;">
For a vegetarian looking for a BIG treat that goes easy on the spices, this one's got it all.. The onions, the capsicum, those delectable mushrooms - with paneer and golden corn to top it all.

</p>    
    <a href="Delux.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
        </div>
  </div>
    </div>
         <div class="container text-center" style="background-color:black">
        <div class="row">
         <div class="col-sm-4"> 
        <h1 style="color:darkslategrey;">5 Pepper</H1>
      <img src="5_Pepper.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:darkmagenta;">
Dominos introduces "5 Peppers" an exotic new Pizza. Topped with red bell pepper, yellow bell pepper, capsicum, red paprika, jalapeno & sprinkled with exotic herb</p>    
   <a href="5Pepper.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
         <div class="col-sm-4"> 
        <h1 style="color:darkgoldenrod;">Veg Extravaganza</H1>
      <img src="Veg_Extravaganz.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:darkcyan;">
A pizza that decidedly staggers under an overload of golden corn, exotic black olives, crunchy onions, crisp capsicum, succulent mushrooms, juicyfresh tomatoes and jalapeno - with extra cheese to go all around.></p>    
   <a href="vegExtra.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
         <div class="col-sm-4"> 
        <h1 style="color:darkslateblue;">CHEESE N CORN</H1>
      <img src="Corn_&_Cheese.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:pink;">
Cheese I Golden Corn</p>    
   <a href="cheeseNCorn.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
              </div>
    </div>
          <div class="container text-center" style="background-color:black">
        <div class="row">
         <div class="col-sm-4"> 
        <h1 style="color:red;">PANEER MAKHANI</H1>
      <img src="Paneer_Makhni.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:green;">
Paneer and Capsicum on Makhani Sauce</p>    
   <a href="PaneerMakhani.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
         <div class="col-sm-4"> 
        <h1 style="color:blue;">VEGGIE PARADISE</H1>
      <img src="veggie.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:olive;">
Goldern Corn, Black Olives, Capsicum & Red Paprika</p>    
   <a href="VeggiePara.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
         <div class="col-sm-4"> 
        <h1 style="color:yellow;">FRESH VEGGIE</H1>
      <img src="Fresh_Veggie.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:maroon;">
Onion I Capsicum</p>    
   <a href="freshVeggie.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
            </div>
    </div>
         <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica">MORE INFORMATION</h1>
         <footer class="container-fluid text-center" style="BACKGROUND-COLOR:black;">
             <div class="row">
                 <div class="col-sm-4">
                     
                        
                         <h2 style="color:red ;text-align:left;">ORDER ONLINE</h2>
                              
                         <h5 style="color:blue;text-align:left"> <a href="#">PIZZA MENU</a></h5>
                         <h5 style="color:blue;text-align:left"> <a href="#">NUTRITIONAL INFORMATION</a></h5>
                         <h5 style="color:blue;text-align:left"> <a href="#">VOUCHERS AND COUPONS</a></h5>
                         
                     
                 </div>
                 <div class="col-sm-4">
                     <h2 style="color:red;text-align: center;">CONTACT US </H2>
                    
                     <h5 style="color:blue;text-align: center;"> <a href="#">713456</a></h5>
                     <h5 style="color:blue;text-align: center;"> <a href="#">CONTACT DETAIL</a></h5>
                     <h5 style="color:blue;text-align: center;"> <a href="#">FEEDBACK</a></h5>
                     
                 </div>
                 <div class="col-sm-4">
                     <H2 style="color:red ;text-align:right;">HELP</H2>
               
                     <h5 style="color:blue ;text-align:right;"> <a href="#">STORE FINDER</a></h5>
                     <h5 style="color:blue ;text-align:right;"> <a href="#">SITE MAP</a></h5>
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
