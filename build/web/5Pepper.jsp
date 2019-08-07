<%--  
    Document   : Add
    Created on : Sep 30, 2018, 8:40:30 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
        <title>JSP Page</title>
    </head>
    <body>
    <% 
  int reg=0;
    int med=0;
    int large=0;
    int new1=0;
    int fresh=0;
    int cheese=0;
    int multi=0;
    int wheat=0;
    int addition=0;
   
    int onion=0;
    int capsicum=0;
    int tomato=0;
    int jalapeno=0;
    int corn=0;
    int paneer=0;
    int paprika=0;
    int mushroom=0;
    int olive=0;
        String name=request.getParameter("size");
        switch (name) {
            case "regular":
                reg = 205;
                break;
            case "medium":
                med = 385;
                break;
            default:
                large = 695;
                break;
        }
 String name1=request.getParameter("crust");
        switch (name1) {
            case "new1":
                new1 = 450;
                break;
            case "wheat":
                wheat = 500;
                break;
            case "cheese":
                cheese = 549;
                break;
            case "fresh":
                fresh = 485;
                break;
            default:
                multi = 510;
                break;
        }

 int quantity = Integer.parseInt(request.getParameter("quantity"));

        String add = request.getParameter("add");
 if(add.equals("checked")){
 addition=65;
 }
 else {
 addition=0;
 }


/*String onion1 = request.getParameter("onion");
         if(onion1.equals("checked"))
         {
             onion=50;
         }
         else
         {
             onion=0;
         }
String capsicum1 = null;
        capsicum1 = request.getParameter("capsicum");
        if(capsicum1.equals("checked")){
     capsicum=50;
 }
        else{
        capsicum=0;
        }
String tomato1=null;
        tomato1 = request.getParameter("tomato");
         if(tomato1.equals("checked")){
     tomato=50;
 }
         else{
         tomato=0;
         }
String mushroom1=null;
        mushroom1 = request.getParameter("mushroom");
        if(mushroom1.equals("checked")){
     mushroom=50;
 }
        else{
        mushroom=0;
        }
String jalapeno1=null;
        jalapeno1 = request.getParameter("jalapeno");
        if(jalapeno1.equals("checked")){
     jalapeno=50;
 }
        else{
        jalapeno=0;
        }
        String olive1=null;
        olive1 = request.getParameter("olive");
         if(olive1.equals("checked")){
     olive=50;
 }
         else{
         olive=0;
         }
String paprika1=null;
        paprika1 = request.getParameter("paprika");
        if(paprika1.equals("checked")){
     paprika=50;
 }
        else{
            paprika=0;
            }
String corn1=null;
        corn1 = request.getParameter("corn");
         if(corn1.equals("checked")){
     corn=50;
 }
         else{
         corn=0;
         }
      
String paneer1=null;
        paneer1 = request.getParameter("paneer");
         if(paneer1.equals("checked")){
     paneer=50;
 }
         else{
         
         paneer=0;
         } */
 
 int total = 0;
 total=quantity*(reg+med+large+cheese+fresh+multi+new1+wheat+addition+onion+capsicum+tomato+mushroom+jalapeno+olive+paprika+corn+paneer);

 out.print("The total amount is:" + total);
    %>
    </body>
</html>