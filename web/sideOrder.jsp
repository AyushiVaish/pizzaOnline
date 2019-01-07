<%-- 
    Document   : sideOrder
    Created on : Jan 3, 2019, 3:34:49 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SideOrder and Beverages</title>
            
               <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </head>
    <body>
          <nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container">
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
        <li><a href="logn.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   
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
        <h1 style="color:red; font-size: 50px;text-align:center; font-family: helvetica"><b>SIDE ORDERS</b></h1><br>
        <div class="container">
       <div class="col-sm-2">
           <h4 >  <a href="sideOrder.jsp"><b>BREAD</b></a></h4>
       </div>
                  <div class="col-sm-2">
           <h4><a href="pasta.jsp"><b>PASTA</b></a></h4>
       </div>
                  <div class="col-sm-2">
           <h4 >  <a href="dips.jsp"><b>DIPS</b></a></h4>
       </div>
                  <div class="col-sm-2">
           <h4 >  <a href="deserts.jsp"><b>DESERTS</b></a></h4>
       </div>
                  <div class="col-sm-2">
           <h4 >  <a href="beverages.jsp"><b>BEVERAGES</b></a></h4>
       </div>
            <div class="col-sm-2">
                <h4><a href="more.jsp"><b> MORE</b></a></h4>
            </div>
        
        </div>
        <div class="container text-center" style="background-color:black">
        <div class="row">
 
    <div class="col-sm-6"> 
        <H1 style="color:blue;">Garlic Breadsticks

</H1>
      <img src="GARLIC.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:midnightblue;">
The endearing tang of garlic in breadstics baked to perfection.</p>    
    <a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
    </div>
             <div class="col-sm-6">
                 <h1 style="color:olive"> Stuffed Garlic Bread

       </H1>
      <img src="stuffed.jpg" class="img-circle"  style="width:100%" alt="Image">
      <p style="color:seagreen;">
Freshly Baked Garlic Bread stuffed with mozzarella cheese, sweet corns & tangy and spicy jalapeños
</p>
<a href="SideOrders.jsp" class="btn btn-primary custom-btn">ORDER NOW</a>
             </div>
        </DIV>
        </DIV>
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
