<%-- 
    Document   : SideOrders
    Created on : Jan 7, 2019, 12:53:48 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>SIDE AND BEVERAGES ORDER</title>
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
                width:1000px;
                height: 650px;
                margin : 60px auto 0;
                position: relative;
                background: rgba(0,0,0,0.4);
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
       
            <h1 STYLE="COLOR:RED;text-align: CENTER">PLACE ORDER</h1>
           
                 <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:green;">GARLIC BREAD @99</H1>
      <img src="GARLIC.jpg" class="img-circle"  style="width:100%" alt="Image">
      <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:blue
            ;">WHITE PASTA ITALIANO NON-VEG @145</H1>
      <img src="non.jpg" class="img-circle"  style="width:100%" alt="Image">
      <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
        
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
        <h1 style="color:white;">BURGER PIZZA-CLASSIC NON VEG @139</H1>
      <img src="burgerNon.jpg" class="img-circle"  style="width:100%" alt="Image">
      <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
        
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
             <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:green;">STUFFED AGRLIC BREADSTICKS @139</H1>
      <img src="stuffed.jpg" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%" >ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:red;">TACO MEXICANA NON VEG @135</H1>
      <img src="taco.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
        <h1 style="color:pink;">WHITE PASTA ITALIANO VEG @135</H1>
      <img src="veg1.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:orange;">BURGER PIZZA-PREMIUM VEG @129</H1>
      <img src="burgerVeg.jpg" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:red;">TACO MEXICANA VEG @125</H1>
      <img src="taco_veg.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
        <h1 style="color:purple;">BURGER PIZZA-CLASSIC VEG @99</H1>
      <img src="burgerClassic.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-6" >
        <h1 style="color:green;">CHOCO LAVA CAKE @99</H1>
      <img src="LAVA.jpg" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
   <div class="col-sm-6"> 
        <h1 style="color:red;">PEPSI @ 60</H1>
      <img src="pepsi.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

     
  </div>
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:green;">BROWNIE FANTASY @59</H1>
      <img src="browniw.png" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:yellow;">CRINKLE FRIES @59</H1>
      <img src="crinkle.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
              <h1 style="color:white;">CRUNCHY STRIPS @59</H1>
      <img src="Crunchy.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:green;">TACO MEXICANA-VEG(SINGLE)@59</H1>
      <img src="tacoVegSingle.png" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:red;">POTATO CHEESE SHOTS @59</H1>
      <img src="potato.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
        <h1 style="color:maroon;">CHICKEN PARCEL @39</H1>
      <img src="chickenn.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
      <div class="col-sm-4" >
        <h1 style="color:olive;">VEG PARCEL @35</H1>
      <img src="veg_parcel.jpg" class="img-circle"  style="width:100%" alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>
       
    <div class="col-sm-4"> 
        <h1 style="color:violet;">CHEESY DIP @25</H1>
      <img src="ch.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>

          <div class="col-sm-4"> 
        <h1 style="color:red;">CHEESY JALAPENO DIP @25</H1>
      <img src="chj.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div> 
        </div>
          <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
           
         <div class="col-sm-4"> 
        <h1 style="color:olive;">CHICKEN MEATBALLS PERI-PERI @99</H1>
      <img src="ken.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
         <div class="col-sm-4"> 
        <h1 style="color:yellow;">ROASTED CHICKEN WINGS PERI-PERI @109</H1>
      <img src="roasted1.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
    
       
  

          <div class="col-sm-4"> 
        <h1 style="color:blue;">BONELESS CHICKEN WINGS PERI-PERI @ 139</H1>
      <img src="boneless1.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
                 <div class="container text-center" style="background-color:black ;" >      
  <div class="row">
         <div class="col-sm-4"> 
      <h1 style="color:orange;"> BONELESS CHICKEN WINGS-LEMON PEPPER @139 </h1>
      <img src="boneless.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
        <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP:5%">ADD TO CART</a>
    </div>
       
         <div class="col-sm-4"> 
        <h1 style="color:red;">ROASTED CHICKEN WINGS CLASSIC HOT SAUCE @109</H1>
      <img src="ROASTED.png" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
           <div class="col-sm-4"> 
        <h1 style="color:white;">BUTTERSCOTCH MOUSSE CAKE @90</H1>
      <img src="butter.jpg" class="img-circle"  style="width:100%" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
  </div>
        </div>
     <div class="container text-center" style="background-color:black ;" >  
           
  <div class="row">
          <div class="col-sm-6"> 
        <h1 style="color:maroon;">CHICKEN MEATBALLS-SRIACHA @99 </H1>
      <img src="chi.png" class="img-circle" alt="Image">
        <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
    </div>
       
       
        <div class="col-sm-6" >
        <h1 style="color:green;">TOMATO KETCHUP @1</H1>
      <img src="ketchup.jpg" class="img-circle"   alt="Image">
   <h3 style="color:green;">ADD QUANTITY :</h3> <br>
      <INPUT TYPE="NUMBER" placeholder="Enter the quantity"> <br>
   <a href="#" class="btn btn-primary custom-btn" STYLE="margin-TOP: 5%">ADD TO CART</a>
      </div>

        
  </div>
        </div>

        </form>
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
