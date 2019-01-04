<%-- 
    Document   : UserLogged
    Created on : Jan 4, 2019, 5:00:30 PM
    Author     : USER
--%>

<%@page import="pizza.FormBean"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form method ="post" action ="logout.jsp">
            <center>
                <% FormBean currentUser=(FormBean)(session.getAttribute("currentSessionUser")); %> 
                 
               " Welcome " + <%= currentUser.getUserName() %>;
         
                <input type ="submit" value="logout" name="logout">
               
    </body>
</html>
