<%-- 
    Document   : addRecipe
    Created on : Feb 8, 2019, 9:54:46 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%! String connectionURL="jdbc:derby://localhost:1527/pizza";
Connection connection=null;
PreparedStatement statement=null;
ResultSet rs=null;
%>
<html>
   <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FEEDBACK FORM</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
           <li><a href="index.html">Menu</a></li>
           
          <li><a href="specialOffer.jsp">SPECIAL OFFERS</a></li>
           <li><a href="otherRecipe.jsp"><span class="glyphicon glyphicon-folder-open"></span> OTHER RECIPES</a></li>
           <li> <a href="tel:714653">
                   <span class="glyphicon glyphicon-earphone"></span> 714653</a></li>
        <li><a href="register.jsp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="login.jsp"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
   
      </ul>
    </div>
  </div>
</nav>
        <div class="container-fluid" style="background-color:gray">
        <% 
         try {
             Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
              String value1=request.getParameter("name");
              String value2=request.getParameter("email");
              String value3=request.getParameter("recipe");
              String sql = "insert into recipe values(?,?,?)" ;
                connection = DriverManager.getConnection(connectionURL,"pizza","pizza");
                statement=connection.prepareStatement(sql);
                statement.setString(1,value1);
                 statement.setString(2,value2);
                  statement.setString(3,value3);
                  statement.executeUpdate();
                  out.print("<center>Your Recipe has been added....</center>");
                  %>
                  <h1 style="color:blue;"><center>Soon we will reply youuu <strong>GoodLuckk!!</strong></center></h1>
                  <br><br>
                  <h2 style ="color:maroon;"> <center>Thanks for Choosing us!!!</center></h2>
             
         <%                      
         }
         catch (SQLException e)
         {
             e.printStackTrace();
         }
         %>
        </div>
           
    </body>
</html>

