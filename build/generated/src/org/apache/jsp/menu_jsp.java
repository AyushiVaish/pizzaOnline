package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        \n");
      out.write("               <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\n");
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
      out.write("           <li> <a href=\"#\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <img src=\"pi.jpg\" alt=\"image\" style=\"width:100%;\">\n");
      out.write("         <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\"><b>VEG PIZZAS</b></h1><br>\n");
      out.write("         <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">Margherita</H1>\n");
      out.write("      <img src=\"Margherit.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkgreen\">\n");
      out.write("A hugely popular margherita, with a deliciously tangy single cheese topping\n");
      out.write("\n");
      out.write("</p>\n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">Double Cheese Margherita</H1>\n");
      out.write("      <img src=\"Double_Cheese_Margherita.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:maroon;\">\n");
      out.write("The ever-popular Margherita - loaded with extra cheese... oodies of it!</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("                   <H1 style=\"color:goldenrod;\">Farm House</H1>\n");
      out.write("      <img src=\"Farmhouse.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:lightcoral\">\n");
      out.write("A pizza that goes ballistic on veggies! Check out this mouth watering overload of crunchy, crisp capsicum, succulent mushrooms and fresh tomatoes\n");
      out.write("\n");
      out.write(" </p>    \n");
      out.write("    <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    <div class=\"container text-center\" style=\"background-color:black\">\n");
      out.write("        <div class=\"row\">\n");
      out.write(" \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <H1 style=\"color:blue;\">Peppy Paneer\n");
      out.write("</H1>\n");
      out.write("      <img src=\"Peppy_Paneer.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:midnightblue;\">Chunky paneer with crisp capsicum and spicy red pepper - quite a mouthful!</p>    \n");
      out.write("    <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("             <div class=\"col-sm-4\">\n");
      out.write("                 <h1 style=\"color:olive\"> </br>\n");
      out.write("         Mexican Green Wave</H1>\n");
      out.write("      <img src=\"Mexican_Green_Wave.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:seagreen;\">\n");
      out.write("A pizza loaded with crunchy onions, crisp capsicum, juicy tomatoes and jalapeno with a liberal sprinkling of exotic Mexican herbs.</p>\n");
      out.write("<a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("             </div>\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("            <H1 style=\"color:darkred;\">Deluxe Veggie</H1>\n");
      out.write("      <img src=\"Deluxe_Veggie.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:crimson;\">\n");
      out.write("For a vegetarian looking for a BIG treat that goes easy on the spices, this one's got it all.. The onions, the capsicum, those delectable mushrooms - with paneer and golden corn to top it all.\n");
      out.write("\n");
      out.write("</p>    \n");
      out.write("    <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"container text-center\" style=\"background-color:black\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:darkslategrey;\">5 Pepper</H1>\n");
      out.write("      <img src=\"5_Pepper.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkmagenta;\">\n");
      out.write("Dominos introduces \"5 Peppers\" an exotic new Pizza. Topped with red bell pepper, yellow bell pepper, capsicum, red paprika, jalapeno & sprinkled with exotic herb</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:darkgoldenrod;\">Veg Extravaganza</H1>\n");
      out.write("      <img src=\"Veg_Extravaganz.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkcyan;\">\n");
      out.write("A pizza that decidedly staggers under an overload of golden corn, exotic black olives, crunchy onions, crisp capsicum, succulent mushrooms, juicyfresh tomatoes and jalapeno - with extra cheese to go all around.></p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:darkslateblue;\">CHEESE N CORN</H1>\n");
      out.write("      <img src=\"Corn_&_Cheese.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:pink;\">\n");
      out.write("Cheese I Golden Corn</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("              </div>\n");
      out.write("    </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">PANEER MAKHANI</H1>\n");
      out.write("      <img src=\"Paneer_Makhni.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:green;\">\n");
      out.write("Paneer and Capsicum on Makhani Sauce</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:blue;\">VEGGIE PARADISE</H1>\n");
      out.write("      <img src=\"veggie.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:olive;\">\n");
      out.write("Goldern Corn, Black Olives, Capsicum & Red Paprika</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:yellow;\">FRESH VEGGIE</H1>\n");
      out.write("      <img src=\"Fresh_Veggie.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:maroon;\">\n");
      out.write("Onion I Capsicum</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("            </div>\n");
      out.write("    </div>\n");
      out.write("         <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
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
      out.write("              \n");
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
