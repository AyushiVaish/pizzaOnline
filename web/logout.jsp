<%-- 
    Document   : logout
    Created on : Jan 4, 2019, 5:02:13 PM
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
          <%
            FormBean currentUser=(FormBean)(session.getAttribute("currentSessionUser"));
            String v =request.getParameter("logout");
            if(v.equals("logout"));
            {
                session.invalidate();
                out.print("Dear:  "+ currentUser.getUserName()+",you are successfully logged out");
            }         
            %>
            <a href="register.jsp">REGISTER</a>
    </body>
</html>
