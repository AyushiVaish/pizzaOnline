package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class OnionMania_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>ONION MANIA ORDER</title>\r\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("             body {\r\n");
      out.write("               \r\n");
      out.write("                -webkit-background-size: cover;\r\n");
      out.write("                background-size:cover;\r\n");
      out.write("                background-position: center,center;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            .form-area {\r\n");
      out.write("                width:500px;\r\n");
      out.write("                height: 1050px;\r\n");
      out.write("                margin : 60px auto 0;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                background: rgba(0,0,0,0.4);\r\n");
      out.write("                text-align:center;\r\n");
      out.write(" \r\n");
      out.write("                padding:35px;\r\n");
      out.write("                border:3px solid #fff;\r\n");
      out.write("                -webkit-border-radius:70px 0 70px 0;\r\n");
      out.write("                -moz-border-radius:70px 0 70px 0;\r\n");
      out.write("                border-radius: 70px 0 70px 0;\r\n");
      out.write("      \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .form-area h3 {\r\n");
      out.write("               \r\n");
      out.write("                color: #fff;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("         \r\n");
      out.write("   \r\n");
      out.write("       \r\n");
      out.write("            \r\n");
      out.write("       \r\n");
      out.write("        \r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("         <nav class=\"navbar navbar-inverse \">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("          <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("                   \r\n");
      out.write("      </button>\r\n");
      out.write("        <div>\r\n");
      out.write("      <img src=\"pizzaIcon1.jpg\" class=\"img-circle\"  width=\"184\" height=\"136\">\r\n");
      out.write("        </div> \r\n");
      out.write("    </div>\r\n");
      out.write("      <a href=\"#myPage\" style=\"color:red;font-size:70px;font-family:Georgia;text-align: center\"><b>FooDuDE</b></a>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"font-size:20px;color:green;\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("           <li><a href=\"index.html\">Menu</a></li>\r\n");
      out.write("            <li><a href=\"#section1\">Inside FooDuDe</a></li>\r\n");
      out.write("          <li><a href=\"#section1\">SPECIAL OFFERS</a></li>\r\n");
      out.write("          <li><a href=\"#section2\">GIFT CARD</a></li>\r\n");
      out.write("           <li> <a href=\"tel:714653\">\r\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\r\n");
      out.write("        <li><a href=\"reister.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("        <li><a href=\"login.sp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("   \r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("    <form method=\"post\">\r\n");
      out.write("        <div style=\"background-image:url(pizza.jpg)\">\r\n");
      out.write("        <div class=\"form-area\">\r\n");
      out.write("            <h1 STYLE=\"COLOR:RED\">PLACE ORDER</h1>\r\n");
      out.write("            <div class=\"img-area\">\r\n");
      out.write("                <img src=\"Deluxe_Veggie.jpg\" class=\"img-circle\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <br>\r\n");
      out.write("            <h3>SIZE: <b>REGULAR</b></H3>\r\n");
      out.write("       \r\n");
      out.write("          <h3>CRUST</h3>\r\n");
      out.write("          <select name=\"crust\">  \r\n");
      out.write("              <option value=\"new\">Classic Hand Tossed Rs.59</option>\r\n");
      out.write("     \r\n");
      out.write("<option value=\"fresh\">Fresh Pan Pizza Rs.84</option>\r\n");
      out.write("\r\n");
      out.write("            </select>\r\n");
      out.write("           \r\n");
      out.write("          \r\n");
      out.write("      \r\n");
      out.write("                             \r\n");
      out.write("                                    \r\n");
      out.write("                <h3 style=\"color:maroon;text-align:left\"><b>your total amount is:</b></h3> \r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("          <a href=\"#\" class=\"btn btn-primary custom-btn\" style=\"margin-top: 5%; margin-bottom: 5%\">Buy Now</a></br>\r\n");
      out.write("      \r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("             <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\r\n");
      out.write("         <footer class=\"container-fluid text-center\" style=\"BACKGROUND-COLOR:black;\">\r\n");
      out.write("             <div class=\"row\">\r\n");
      out.write("                 <div class=\"col-sm-4\">\r\n");
      out.write("                     \r\n");
      out.write("                        \r\n");
      out.write("                         <h2 style=\"color:red ;text-align:left;\">ORDER ONLINE</h2>\r\n");
      out.write("                              \r\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">PIZZA MENU</a></h5>\r\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">NUTRITIONAL INFORMATION</a></h5>\r\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">VOUCHERS AND COUPONS</a></h5>\r\n");
      out.write("                         \r\n");
      out.write("                     \r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-sm-4\">\r\n");
      out.write("                     <h2 style=\"color:red;text-align: center;\">CONTACT US </H2>\r\n");
      out.write("                    \r\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">713456</a></h5>\r\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">CONTACT DETAIL</a></h5>\r\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">FEEDBACK</a></h5>\r\n");
      out.write("                     \r\n");
      out.write("                 </div>\r\n");
      out.write("                 <div class=\"col-sm-4\">\r\n");
      out.write("                     <H2 style=\"color:red ;text-align:right;\">HELP</H2>\r\n");
      out.write("               \r\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">STORE FINDER</a></h5>\r\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">SITE MAP</a></h5>\r\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">OTHERS</a></h5>\r\n");
      out.write("                     \r\n");
      out.write("                 </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("<p style=\"text-align:center\">\r\n");
      out.write("<!--Facebook icon-->\r\n");
      out.write("<a href=\"http://facebook.com/flashissue\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/YdvNzBsfTrqg9Cx9Tozh_Facebook-e1386022800280.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp; &nbsp;\r\n");
      out.write("<!--Google+ icon-->\r\n");
      out.write("<a href=\"http://plus.google.com\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/HdT6jbRJRhqyPu3BKhi7_google-Plus-e1386022876181.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp;&nbsp;\r\n");
      out.write("<!--Twitter icon-->\r\n");
      out.write("<a href=\"http://twitter.com/flashissue\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/3b3zdiavSf26SleQOaDd_twitter-e1386023015819.png\" style=\"height:50px; width:50px\" /> </a>&nbsp; &nbsp;&nbsp;\r\n");
      out.write("<!--Linkedin icon-->\r\n");
      out.write("<a href=\"http://linkedin.com\" target=\"_blank\"><img alt=\"\" src=\"https://s3.amazonaws.com/flashissue/dJtLdIsbRAix3zQhvygP_linkedin_icon_dark_hover-5be7d72ca83a10c0c76c32d141b0b828.png\" style=\"height:50px; width:50px\" /> </a>\r\n");
      out.write("</p>\r\n");
      out.write("         </footer>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
