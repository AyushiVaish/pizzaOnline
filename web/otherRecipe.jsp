<%-- 
    Document   : otherRecipe
    Created on : Feb 8, 2019, 10:09:30 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<%! String connectionURL="jdbc:derby://localhost:1527/pizza";
Connection connection=null;
Statement statement=null;
ResultSet rs=null;
%>
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
       

    <body>
        <table border="5" align="center" style="background-color:green;">
            <th>NAME</th><th>EMAIL</th><th>RECIPES</th>
            <%
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
                    connection = DriverManager.getConnection(connectionURL,"pizza","pizza");
                    statement=connection.createStatement();
                    String sql="select name,email,recipes from recipe";
                    rs=statement.executeQuery(sql);
                    
                    while(rs.next())
                    {%>
            <tr><td><%=rs.getString("name")%></td> 
            <td><%=rs.getString("email")%></td>
            <td><%=rs.getString("recipes")%></td> </tr>
<% } %>
<%rs.close();
}
catch(SQLException se)
{
se.printStackTrace();
}
catch(Exception e)
{
e.printStackTrace();
                    }
                
                %>
        </table>     
    </body>
</html>
