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
                <script>
$(document).ready(function(){
  $("#myInput").on("keyup", function() {
    var value = $(this).val().toLowerCase();
    $(".dropdown-menu li").filter(function() {
      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
    });
  });
});
</script>
    </head>
    <body>
        <div class="topnav">
       

 
      
            <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Our MeNu<span class="caret"></span></button>
            <ul class="dropdown-menu">
                 <input class="form-control" id="myInput" type="text" placeholder="Search..">
                    <li><a href="#section41">VEG PIZZAS</a></li>
                    <li><a href="#section42">NON VEG PIZZAS</a></li>
                    <li><a href="#">SIDE ORDERS</a></li>
                    <li><a href="#">BEVERAGES</a></li>
                    <li><a href="#">CHOICE OF CRUSTS</a></li>
                    <li><a href="#">CHOICE OF TOPPINGS</a></li>
                    <li><a href="#">PIZZA MANIA</a></li>
                    <li><a href="#">BURGER PIZZA</a></li>
                    <li><a href="#">CHICKEN</a></li>
            </ul>
      </div>
        <div class="form-group">
            <ul>
          <li><a href="#section1">SPECIAL OFFERS</a></li>
          <li><a href="#section1">INSIDE FooDuDe</a></li>
          <li><a href="#section2">GIFT CARD</a></li>
          <li><a href="#section3">CONTACT</a></li>
          
        </ul>
        </div>
    </body>
</html>
