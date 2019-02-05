package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CheesyMania_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>CHEESY MANIA ORDER</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<style>\n");
      out.write("             body {\n");
      out.write("               \n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                background-size:cover;\n");
      out.write("                background-position: center,center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .form-area {\n");
      out.write("                width:500px;\n");
      out.write("                height: 680px;\n");
      out.write("                margin : 60px auto 0;\n");
      out.write("                position: relative;\n");
      out.write("                background: rgba(0,0,0,0.4);\n");
      out.write("                text-align:center;\n");
      out.write(" \n");
      out.write("                padding:35px;\n");
      out.write("                border:3px solid #fff;\n");
      out.write("                -webkit-border-radius:70px 0 70px 0;\n");
      out.write("                -moz-border-radius:70px 0 70px 0;\n");
      out.write("                border-radius: 70px 0 70px 0;\n");
      out.write("      \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form-area h3 {\n");
      out.write("               \n");
      out.write("                color: #fff;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("         \n");
      out.write("   \n");
      out.write("       \n");
      out.write("            \n");
      out.write("       \n");
      out.write("        \n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("         <nav class=\"navbar navbar-inverse \">\n");
      out.write("  <div class=\"container-fluid\">\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\n");
      out.write("        <span class=\"icon-bar\"></span>\n");
      out.write("          <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("                   \n");
      out.write("      </button>\n");
      out.write("        <div>\n");
      out.write("      <img src=\"pizzaIcon1.jpg\" class=\"img-circle\"  width=\"184\" height=\"136\">\n");
      out.write("        </div> \n");
      out.write("    </div>\n");
      out.write("      <a href=\"index.html\" style=\"color:red;font-size:70px;font-family:Georgia;text-align: center\"><b>FooDuDE</b></a>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"font-size:20px;color:green;\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           <li><a href=\"index.html\">Menu</a></li>\n");
      out.write("           \n");
      out.write("          <li><a href=\"specialOffer.jsp\">SPECIAL OFFERS</a></li>\n");
      out.write("        \n");
      out.write("           <li> <a href=\"tel:714653\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"reister.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <form method=\"post\">\n");
      out.write("        <div style=\"background-image:url(pizza.jpg)\">\n");
      out.write("        <div class=\"form-area\">\n");
      out.write("            <h1 STYLE=\"COLOR:RED\">PLACE ORDER</h1>\n");
      out.write("            <div class=\"img-area\">\n");
      out.write("                <img src=\"Cheesy.jpg\" class=\"img-circle\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <h3>SIZE: <b>REGULAR</b></H3>\n");
      out.write("       \n");
      out.write("          <h3>CRUST</h3>\n");
      out.write("          <select name=\"crust\">  \n");
      out.write("              <option value=\"new\">Classic Hand Tossed Rs.95</option>\n");
      out.write("     \n");
      out.write("<option value=\"fresh\">Fresh Pan Pizza Rs.120</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("           \n");
      out.write("       <h3 style=\"color:WHITE;\">ADD QUANTITY :</h3>\n");
      out.write("      <INPUT TYPE=\"NUMBER\" placeholder=\"Enter the quantity\"> <br>\n");
      out.write("      \n");
      out.write("              \n");
      out.write("          <a href=\"#\" class=\"btn btn-primary custom-btn\" style=\"margin-top: 5%; margin-bottom: 5%\">ADD TO CART</a></br>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("       <br><br>\n");
      out.write("\n");
      out.write("<!-- Image of location/map -->\n");
      out.write("<img src=\"map1.jpg\" class=\"w3-image w3-greyscale\" style=\"width:100%;\" id=\"map\">\n");
      out.write("\n");
      out.write("<!-- Contact -->\n");
      out.write(" <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\" id=\"contact\"><b>CONTACT</b></h1>\n");
      out.write("<div class=\"w3-container w3-padding-64 w3-blue-grey w3-grayscale-min w3-xlarge\">\n");
      out.write("  <div class=\"w3-content\">\n");
      out.write("  <p class=\"w3-center w3-large\">Lets get in touch. Send us a message:</p>\n");
      out.write("  <div style=\"margin-top:48px\">\n");
      out.write("      <p><i class=\"fa fa-map-marker fa-fw w3-xxlarge w3-margin-right\" ></i><a href=\"#\"> Mumbai,India</a></p>\n");
      out.write("      <p><i class=\"fa fa-phone fa-fw w3-xxlarge w3-margin-right\" ></i><a href=\"tel:714653\"> Phone:716543</a></p>\n");
      out.write("      <p><i class=\"fa fa-envelope fa-fw w3-xxlarge w3-margin-right\"> </i><a href=\"#\"> Email: foodude12@gmail.com</a></p>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("         <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
      out.write("         <footer style=\"background-color: black;\">\n");
      out.write(" <div class=\"row\">\n");
      out.write("     <div class=\"col-sm-5\">\n");
      out.write("        \n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                         <h2 style=\"color:red ;text-align:left;\">ORDER ONLINE</h2>\n");
      out.write("                              \n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#menu\">PIZZA MENU</a></h5>\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">NUTRITIONAL INFORMATION</a></h5>\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-2\">\n");
      out.write("                     <h2 style=\"color:red;text-align: center;\">CONTACT US </H2>\n");
      out.write("                    \n");
      out.write("                     \n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#contact\">CONTACT DETAIL</a></h5>\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"feedback.jsp\">FEEDBACK</a></h5>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                   <div class=\"col-sm-4\">\n");
      out.write("                     <H2 style=\"color:red ;text-align:right;\">HELP</H2>\n");
      out.write("               \n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#map\">STORE FINDER</a></h5>\n");
      out.write("                    \n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">Terms and Conditions</a></h5>\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">Privacy Policy</a></h5>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write(" \n");
      out.write("             <br>\n");
      out.write("             \n");
      out.write("<p style=\"text-align:center\">\n");
      out.write("<!--Facebook icon-->\n");
      out.write("<a href=\"http://facebook.com/flashissue\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/YdvNzBsfTrqg9Cx9Tozh_Facebook-e1386022800280.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp; &nbsp;\n");
      out.write("<!--Google+ icon-->\n");
      out.write("<a href=\"http://plus.google.com\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/HdT6jbRJRhqyPu3BKhi7_google-Plus-e1386022876181.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp;&nbsp;\n");
      out.write("<!--Twitter icon-->\n");
      out.write("<a href=\"http://twitter.com/flashissue\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/3b3zdiavSf26SleQOaDd_twitter-e1386023015819.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp;&nbsp;\n");
      out.write("<!--Linkedin icon-->\n");
      out.write("<a href=\"http://linkedin.com\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/dJtLdIsbRAix3zQhvygP_linkedin_icon_dark_hover-5be7d72ca83a10c0c76c32d141b0b828.png\" style=\"height:50px; width:50px\" /> </a>\n");
      out.write("</p>\n");
      out.write("  </div>\n");
      out.write("        </footer>\n");
      out.write("     \n");
      out.write("    </div>\n");
      out.write("<br>\n");
      out.write(" <p style=\"text-align: right\"><b>All rights reserved. Copyright © FooDuDE Disclaimer | T&C | Privacy Policy </b></p>\n");
      out.write(" \n");
      out.write("         </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
