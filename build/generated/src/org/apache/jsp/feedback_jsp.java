package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class feedback_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>FEEDBACK FORM</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
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
      out.write("          \n");
      out.write("           <li> <a href=\"tel:714653\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"register.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\" id=\"contact\"><b>CONTACT</b></h1>\n");
      out.write("<div class=\"w3-container w3-padding-64 w3-blue-grey w3-grayscale-min w3-xlarge\">\n");
      out.write("  <div class=\"w3-content\">\n");
      out.write("  <p class=\"w3-center w3-large\">Lets get in touch. Send us a message:</p>\n");
      out.write("  <div style=\"margin-top:48px\">\n");
      out.write("      <p><i class=\"fa fa-map-marker fa-fw w3-xxlarge w3-margin-right\" ></i><a href=\"#\"> Mumbai,India</a></p>\n");
      out.write("      <p><i class=\"fa fa-phone fa-fw w3-xxlarge w3-margin-right\" ></i><a href=\"tel:714653\"> Phone:716543</a></p>\n");
      out.write("      <p><i class=\"fa fa-envelope fa-fw w3-xxlarge w3-margin-right\"> </i><a href=\"#\"> Email: foodude12@gmail.com</a></p>\n");
      out.write("    <br>\n");
      out.write("    <p><span class=\"w3-tag\">FooDuDE!</span> We offer full-service catering for any event, large or small. We understand your needs and we will cater the food to satisfy the biggerst criteria of them all, both look and taste.</p>\n");
      out.write("    <p class=\"w3-xxlarge\"><strong>FeedBack</strong> write here:</p>\n");
      out.write("    <form action=\"Feedback_1.jsp\" method=\"post\">\n");
      out.write("        <p><input class=\"w3-input w3-padding-16 w3-border\" type=\"email\" placeholder=\"Enter your email\" name=\"email\" style=\"color:black\" required /></p>\n");
      out.write("        <p> <input class=\"w3-input w3-padding-16 w3-border\" type=\"text\" placeholder=\"Feedback\" name=\"feedback\"  style=\"color:black\" required /></p> \n");
      out.write("            \n");
      out.write("        <p><input class=\"w3-input w3-padding-16 w3-border\" type=\"text\"  name=\"suggestion\" placeholder=\"Suggestion\" style=\"color:black;\" required />\n");
      out.write("        <p>\n");
      out.write("        <button class=\"w3-button w3-black\" type=\"submit\">\n");
      out.write("          <i class=\"fa fa-paper-plane\"></i> SEND MESSAGE\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("     <div class=\"container-fluid\">\n");
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
      out.write("                               <H2 style=\"color:red ;text-align:right;\">HELP</H2>\n");
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
      out.write("  <p style=\"text-align: right\"><b>All rights reserved. Copyright © FooDuDe Disclaimer | T&C | Privacy Policy </b></p>\n");
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