package org.apache.jsp.images;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CapsicumMania_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>CAPISUM MANIA ORDER</title>\n");
      out.write("   <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
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
      out.write("      <a href=\"#myPage\" style=\"color:red;font-size:70px;font-family:Georgia;text-align: center\"><b>FooDuDE</b></a>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"font-size:20px;color:green;\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           <li><a href=\"index.html\">Menu</a></li>\n");
      out.write("            <li><a href=\"#about\">Inside FooDuDe</a></li>\n");
      out.write("          <li><a href=\"#section1\">SPECIAL OFFERS</a></li>\n");
      out.write("          <li><a href=\"#section2\">GIFT CARD</a></li>\n");
      out.write("           <li> <a href=\"tel:714653\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"reister.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.sp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
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
      out.write("                <img src=\"CapsicumVeg.jpg\" class=\"img-circle\">\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <h3>SIZE: <b>REGULAR</b></H3>\n");
      out.write("       \n");
      out.write("          <h3>CRUST</h3>\n");
      out.write("          <select name=\"crust\">  \n");
      out.write("              <option value=\"new\">Classic Hand Tossed Rs.69</option>\n");
      out.write("     \n");
      out.write("<option value=\"fresh\">Fresh Pan Pizza Rs.94</option>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("           \n");
      out.write("       <h3 style=\"color:WHITE;\">ADD QUANTITY :</h3>\n");
      out.write("      <INPUT TYPE=\"NUMBER\" placeholder=\"Enter the quantity\"> <br>\n");
      out.write("     \n");
      out.write("              \n");
      out.write("          <a href=\"#\" class=\"btn btn-primary custom-btn\" style=\"margin-top: 5%; margin-bottom: 5%\">ADD TO CART</a></br>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("         <!-- About Container -->\n");
      out.write("         <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\" id=\"about\"><b>About</b></h1>\n");
      out.write("<div class=\"w3-container w3-padding-64 w3-red w3-grayscale w3-xlarge\" id=\"about\">\n");
      out.write("  <div class=\"w3-content\">\n");
      out.write("   \n");
      out.write("    <p>FooDuDE's Pizza India has remained focused on delivering great tasting Pizzas and sides, superior quality, exceptional guest care and value for money offerings.\n");
      out.write("        <br> <br>We have endeavored to establish a reputation for being a home delivery specialist capable of delivering pizzas within 30 minutes or else FREE to a community of loyal consumers from all our restaurants around the country.\n");
      out.write("        <br><br>FooDuDE's vision is focused on \" Exceptional people on a mission to be the best pizza delivery company in the world!\" We are committed to bringing fun, happiness and convenience to lives of our consumers by delivering delicious pizzas to their doorstep and our efforts are aimed at fulfilling this commitment towards a large and ever-growing guest base.<br>FooDuDE's constantly strives to develop products that suit the tastes of our consumers and hence delighting them. FooDuDE's believes strongly in the strategy of 'Think global and act local'.<br><br> Thus, time and again we have been innovating with delicious new products such as crusts, toppings and flavours suitable to the taste buds of Indian Consumers. Further providing value for money and affordable products to our consumers has been an important part of our efforts. Our initiatives such as Fun Meal and Pizza Mania have been extremely popular with consumers looking for an affordable and value for money meal option.<br><br>FooDuDE's believes that when a box of pizza is opened, family and friends come together to share the pizza. Hence, our brand positioning: ‘Yeh Hai Rishton Ka Time'That's why, all our efforts, whether it is a new innovative and delicious product, offering consumers value for money deals, great service, countrywide presence or the promise to deliver in 30 minutes or free are all directed towards making relationships stronger, warmer and more fun by giving consumers an opportunity to get together, catch up, reunite and spend more time together.Consumers can order their pizzas by calling the single Happiness Hotline number 714653 OR order online at Pizza Online.</p>\n");
      out.write("    <p><strong>The Chef?</strong> Mr. Italiano himself<img src=\"chef.jpg\" style=\"width:150px\" class=\"w3-circle w3-right\" alt=\"Chef\"></p>\n");
      out.write("    <p>We are proud of our interiors.</p>\n");
      out.write("    <img src=\"im.jpg\" style=\"width:100%\" class=\"w3-margin-top w3-margin-bottom\" alt=\"Restaurant\">\n");
      out.write("    <h1><b>Opening Hours</b></h1>\n");
      out.write("    \n");
      out.write("    <div class=\"w3-row\">\n");
      out.write("      <div class=\"w3-col s7\">\n");
      out.write("        <p>Mon & Tue CLOSED</p>\n");
      out.write("        <p>Wednesday 10.00 - 24.00</p>\n");
      out.write("        <p>Thursday 10:00 - 24:00</p>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"w3-col s7\">\n");
      out.write("        <p>Friday 10:00 - 12:00</p>\n");
      out.write("        <p>Saturday 10:00 - 23:00</p>\n");
      out.write("        <p>Sunday Closed</p>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>\n");
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
      out.write("    <form action=\"#\" target=\"_blank\">\n");
      out.write("        <p><input class=\"w3-input w3-padding-16 w3-border\" type=\"text\" placeholder=\"Name\" required name=\"Name\" style=\"color:black\"></p>\n");
      out.write("        <p> <input class=\"w3-input w3-padding-16 w3-border\" type=\"number\" placeholder=\"How many people\" required name=\"People\"  style=\"color:black\"></p> \n");
      out.write("        <p>     <input class=\"w3-input w3-padding-16 w3-border\" type=\"datetime-local\" placeholder=\"Date and time\" required name=\"date\"  value=\"2017-11-16T20:00\" style=\"color:black\" ></p>        \n");
      out.write("        <p><input class=\"w3-input w3-padding-16 w3-border\" type=\"text\" placeholder=\"Message \\ Special requirements\" style=\"color:black;\" required name=\"Message\">\n");
      out.write("        <p>\n");
      out.write("        <button class=\"w3-button w3-black\" type=\"submit\">\n");
      out.write("          <i class=\"fa fa-paper-plane\"></i> SEND MESSAGE\n");
      out.write("        </button>\n");
      out.write("      </p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("             <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
      out.write("         <footer class=\"container-fluid text-center\" style=\"BACKGROUND-COLOR:black;\">\n");
      out.write("             <div class=\"row\">\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     \n");
      out.write("                        \n");
      out.write("                         <h2 style=\"color:red ;text-align:left;\">ORDER ONLINE</h2>\n");
      out.write("                              \n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"menu.jsp\">PIZZA MENU</a></h5>\n");
      out.write("                         <h5 style=\"color:blue;text-align:left\"> <a href=\"#\">NUTRITIONAL INFORMATION</a></h5>\n");
      out.write("                         \n");
      out.write("                         \n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     <h2 style=\"color:red;text-align: center;\">CONTACT US </H2>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"#contact\">CONTACT DETAIL</a></h5>\n");
      out.write("                     <h5 style=\"color:blue;text-align: center;\"> <a href=\"feedback.jsp\">FEEDBACK</a></h5>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("                 <div class=\"col-sm-4\">\n");
      out.write("                     <H2 style=\"color:red ;text-align:right;\">HELP</H2>\n");
      out.write("               \n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#\">STORE FINDER</a></h5>\n");
      out.write("                     <h5 style=\"color:blue ;text-align:right;\"> <a href=\"#map\">SITE MAP</a></h5>\n");
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
      out.write("\n");
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
