package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class non_005fveg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>NON VEG VARIETY</title>\n");
      out.write("        \n");
      out.write("               <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("              \n");
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
      out.write("           <li><a href=\"#section1\">Menu</a></li>\n");
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
      out.write("        <img src=\"image1.jpg\" alt=\"image\" style=\"width:100%;\">\n");
      out.write("         <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\"><b>VEG PIZZAS</b></h1><br>\n");
      out.write("         <div class=\"container text-center\" style=\"background-color:black ;\" >  \n");
      out.write("           \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\"col-sm-4\" >\n");
      out.write("        <h1 style=\"color:green;\">PEPPER BARBECUE CHICKEN\n");
      out.write("</H1>\n");
      out.write("      <img src=\"Pepper_Barbeque.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkgreen\">Pepper Barbecue Chicken I Cheese\n");
      out.write("</p>\n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("      </div>\n");
      out.write("       \n");
      out.write("    <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:red;\">CHICKEN TIKKA\n");
      out.write("</H1>\n");
      out.write("      <img src=\"Chicken_Tikka.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:maroon;\">Chicken Tikka I Onion on Makhani Sauce\n");
      out.write("</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("                   <H1 style=\"color:goldenrod;\">CHICKEN SAUSAGE\n");
      out.write("</H1>\n");
      out.write("      <img src=\"Farmhouse.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:crimson;\">\n");
      out.write("Chicken Sausage I Cheese\n");
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
      out.write("        <H1 style=\"color:blue;\">Chicken Golden Delight\n");
      out.write("\n");
      out.write("</H1>\n");
      out.write("      <img src=\"Peppy_Paneer.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:midnightblue;\">Mmm! Barbeque chicken with a topping of golden corn loaded with extra cheese. Worth its weight in gold!</p>    \n");
      out.write("    <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("             <div class=\"col-sm-4\">\n");
      out.write("                 <h1 style=\"color:olive\"> CHICKEN FIESTA\n");
      out.write("       </H1>\n");
      out.write("      <img src=\"Mexican_Green_Wave.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:seagreen;\">\n");
      out.write("Grilled Chicken Rashers I Peri-Peri Chicken I Onion I Capsicum\n");
      out.write("</p>\n");
      out.write("<a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("             </div>\n");
      out.write("        <div class=\"col-sm-4\"> \n");
      out.write("            <H1 style=\"color:darkred;\">\n");
      out.write("Non Veg Supreme</H1>\n");
      out.write("      <img src=\"Deluxe_Veggie.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:crimson;\">\n");
      out.write("\n");
      out.write("Bite into supreme delight of Black Olives, Onions, Grilled Mushrooms, Pepper BBQ Chicken, Peri-Peri Chicken, Grilled Chicken Rashers\n");
      out.write("</p>    \n");
      out.write("    <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("        </div>\n");
      out.write("  </div>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"container text-center\" style=\"background-color:black\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:green;\">Chicken Dominator\n");
      out.write("</H1>\n");
      out.write("      <img src=\"5_Pepper.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:darkred;;\">Treat your taste buds with Double Pepper Barbecue Chicken, Peri-Peri Chicken, Chicken Tikka & Grilled Chicken Rashers\n");
      out.write("</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:olive;\">RI-PERI CHICKEN</H1>\n");
      out.write("      <img src=\"Veg_Extravaganz.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:yellow;\">\n");
      out.write("PE\n");
      out.write("Peri-Peri Chicken I Red Paprika\n");
      out.write("</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("         <div class=\"col-sm-4\"> \n");
      out.write("        <h1 style=\"color:orangered;\">PEPPER BARBECUE & ONION</H1>\n");
      out.write("      <img src=\"Corn_&_Cheese.jpg\" class=\"img-circle\"  style=\"width:100%\" alt=\"Image\">\n");
      out.write("      <p style=\"color:violet;\">\n");
      out.write("Pepper Barbecue Chicken I Onion\n");
      out.write("</p>    \n");
      out.write("   <a href=\"#\" class=\"btn btn-primary custom-btn\">ORDER NOW</a>\n");
      out.write("    </div>\n");
      out.write("              </div>\n");
      out.write("    </div>\n");
      out.write("          <h1 style=\"color:red; font-size: 50px;text-align:center; font-family: helvetica\">MORE INFORMATION</h1>\n");
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
