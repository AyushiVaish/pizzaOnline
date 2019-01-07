package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SideOrders_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>SIDE AND BEVERAGES ORDER</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
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
      out.write("                width:1000px;\n");
      out.write("                height: 650px;\n");
      out.write("                margin : 60px auto 0;\n");
      out.write("                position: relative;\n");
      out.write("                background: rgba(0,0,0,0.4);\n");
      out.write("                padding:35px;\n");
      out.write("                border:3px solid #fff;\n");
      out.write("                -webkit-border-radius:70px 0 70px 0;\n");
      out.write("                -moz-border-radius:70px 0 70px 0;\n");
      out.write("                border-radius: 70px 0 70px 0;\n");
      out.write("              \n");
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
      out.write("            <li><a href=\"#section1\">Inside FooDuDe</a></li>\n");
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
      out.write("       \n");
      out.write("            <h1 STYLE=\"COLOR:RED;text-align: CENTER\">PLACE ORDER</h1>\n");
      out.write("           \n");
      out.write("                 <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">GARLIC BREAD @99</H1>\n");
      out.write("      <img src=\"GARLIC.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">WHITE PASTA ITALIANO NON-VEG @145</H1>\n");
      out.write("      <img src=\"non.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">BURGER PIZZA-CLASSIC NON VEG @139</H1>\n");
      out.write("      <img src=\"burgerNon.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("             <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">STUFFED AGRLIC BREADSTICKS @139</H1>\n");
      out.write("      <img src=\"stuffed.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">TACO MEXICANA NON VEG @135</H1>\n");
      out.write("      <img src=\"taco.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">WHITE PASTA ITALIANO VEG @135</H1>\n");
      out.write("      <img src=\"veg1.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">BURGER PIZZA-PREMIUM VEG @129</H1>\n");
      out.write("      <img src=\"burgerVeg.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">TACO MEXICANA VEG @125</H1>\n");
      out.write("      <img src=\"taco_veg.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">BURGER PIZZA-CLASSIC VEG @99</H1>\n");
      out.write("      <img src=\"burgerClassic.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-6\" >\n");
      out.write("        <h1 style=\"color:green;\">CHOCO LAVA CAKE @99</H1>\n");
      out.write("      <img src=\"LAVA.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-6\"> \n");
      out.write("        <h1 style=\"color:red;\">BUTTERSCOTCH MOUSSE CAKE @90</H1>\n");
      out.write("      <img src=\"butter.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("     \n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">BROWNIE FANTASY @59</H1>\n");
      out.write("      <img src=\"browniw.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CRINKLE FRIES @59</H1>\n");
      out.write("      <img src=\"crinkle.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CRUNCHY STRIPS @59</H1>\n");
      out.write("      <img src=\"Crunchy.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">TACO MEXICANA-VEG(SINGLE)@59</H1>\n");
      out.write("      <img src=\"tacoVegSingle.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">POTATO CHEESE SHOTS @59</H1>\n");
      out.write("      <img src=\"potato.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CHICKEN PARCEL @39</H1>\n");
      out.write("      <img src=\"chickenn.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">VEG PARCEL @35</H1>\n");
      out.write("      <img src=\"veg_parcel.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CHEESY DIP @25</H1>\n");
      out.write("      <img src=\"ch.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CHEESY JALAPENO DIP @25</H1>\n");
      out.write("      <img src=\"chj.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("          <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">TOMATO KETCHUP @1</H1>\n");
      out.write("      <img src=\"\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("   \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\" STYLE=\"margin-TOP: 5%\">ADD TO CART</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">PEPSI @ 60</H1>\n");
      out.write("      <img src=\"pepsi.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">BONELESS CHICKEN WINGS PERI-PERI @ 139</H1>\n");
      out.write("      <img src=\"boneless1.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("                     <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">BONELESS CHICKEN WINGS-LEMON PEPPER @139</H1>\n");
      out.write("      <img src=\"boneless.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">ROASTED CHICKEN WINGS CLASSIC HOT SAUCE @109</H1>\n");
      out.write("      <img src=\"ROASTED.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("          <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">ROASTED CHICKEN WINGS PERI-PERI @109</H1>\n");
      out.write("      <img src=\"roasted1.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("                     <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("          <div class=\"col-sm-6\"> \n");
      out.write("        <h1 style=\"color:red;\">CHICKEN MEATBALLS-SRIACHA @99 </H1>\n");
      out.write("      <img src=\"chi.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("         <div class=\"col-sm-6\"> \n");
      out.write("        <h1 style=\"color:red;\">CHICKEN MEATBALLS PERI-PERI @99</H1>\n");
      out.write("      <img src=\"ken.png\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("        \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ADD TO CART</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("  </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("\n");
      out.write("         \n");
      out.write("                <h3 style=\"color:blue;text-align:left\"><b>your total amount is:</b></h3> \n");
      out.write("\n");
      out.write("              \n");
      out.write("          <a href=\"#\" class=\"btn btn-primary custom-btn\" style=\"margin-top: 5%; margin-bottom: 5%\">Buy Now</a></br>\n");
      out.write("      \n");
      out.write("         \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        </form>\n");
      out.write("             <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
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
