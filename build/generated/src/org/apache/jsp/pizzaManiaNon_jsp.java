package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pizzaManiaNon_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>NON VEG PIZZA MANIA</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("  <div class=\"container\">\n");
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
      out.write("      <a href=\"#myPage\" style=\"color:red;font-size:70px;font-family:Georgia;text-align: center\"><b>FooDuDE</b></a>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"font-size:20px;color:green;\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           <li><a href=\"index.html\">Menu</a></li>\n");
      out.write("            <li><a href=\"#section1\">Inside FooDuDe</a></li>\n");
      out.write("          <li><a href=\"#section1\">SPECIAL OFFERS</a></li>\n");
      out.write("          <li><a href=\"#section2\">GIFT CARD</a></li>\n");
      out.write("           <li> <a href=\"tel:714653\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"reister.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("    <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("    <!-- Indicators -->\n");
      out.write("    <ol class=\"carousel-indicators\">\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("        <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("    </ol>\n");
      out.write("\n");
      out.write("    <!-- Wrapper for slides -->\n");
      out.write("    <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("      <div class=\"item active\">\n");
      out.write("        <img src=\"pi.jpg\" alt=\"Images\" style=\"width:100%;\">\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("\n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"pi2.jpg\" alt=\"image\" style=\"width:100%;\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("              <div class=\"item\">\n");
      out.write("        <img src=\"pi3.jpg\" alt=\"image\" style=\"width:100%;\">\n");
      out.write("        \n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("    \n");
      out.write("      <div class=\"item\">\n");
      out.write("        <img src=\"pi4.jpg\" alt=\"image\" style=\"width:100%;\">\n");
      out.write("       \n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("    </div>\n");
      out.write("     <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("      <span class=\"sr-only\">Previous</span>\n");
      out.write("    </a>\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("      <span class=\"sr-only\">Next</span>\n");
      out.write("    </a>\n");
      out.write("  </div>\n");
      out.write("        <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\"><b>PIZZA MANIA NON-VEG</b></h1><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("       <div class=\"col-sm-9\">\n");
      out.write("           <h4 >  <a href=\"pizzaMania.jsp\"><b>PIZZA MANIA VEG</b></a></h4>\n");
      out.write("       </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                <h4 class=\"active\"><a href=\"pizzaManiaNon.jsp\"><b>PIZZA MANIA NON-VEG</b></a></h4>\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("         <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">NON VEG LOADED\n");
      out.write("</H1>\n");
      out.write("      <img src=\"nonVegLoaded.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkgreen\">\n");
      out.write("Peri - Peri chicken | Pepper Barbecue | Chicken Sausage in a fresh pan crust\n");
      out.write("</p>\n");
      out.write("   <a href=\"NonVegLoaded.jsp\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CHICKEN SAUSAGE\n");
      out.write("</H1>\n");
      out.write("      <img src=\"ChickenSausage.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:maroon;\">\n");
      out.write("Chicken Sausage I Cheese\n");
      out.write("</p>    \n");
      out.write("   <a href=\"ChickenMania.jsp\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("                   <H1 style=\"color:goldenrod;\">PEPPER BARBECUE CHICKEN\n");
      out.write("</H1>\n");
      out.write("      <img src=\"pepper.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:crimson;\">\n");
      out.write("\n");
      out.write("Pepper Barbecue Chicken\n");
      out.write(" </p>    \n");
      out.write("    <a href=\"PepperBarbecueMania.jsp\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("        <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
      out.write("         <footer class=\"container-fluid text-center\" style=\"BACKGROUND-COLOR:black;\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                         <h2 style=\"color:red ;text-align:left;\">ORDER ONLINE</h2>\n");
      out.write("                              \n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">PIZZA MENU</a></h5>\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">NUTRITIONAL INFORMATION</a></h5>\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">VOUCHERS AND COUPONS</a></h5>\n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     <h2 style=\"color:red;text-align: center;\">CONTACT US </H2>\n");
      out.write("                    \n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">713456</a></h5>\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">CONTACT DETAIL</a></h5>\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#\">FEEDBACK</a></h5>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     <H2 style=\"color:red ;text-align:right;\">HELP</H2>\n");
      out.write("               \n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">STORE FINDER</a></h5>\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">SITE MAP</a></h5>\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">OTHERS</a></h5>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                \n");
      out.write("\n");
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
      out.write("         </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
