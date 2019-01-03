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
      out.write("                <script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("  $(\"#myInput\").on(\"keyup\", function() {\n");
      out.write("    var value = $(this).val().toLowerCase();\n");
      out.write("    $(\".dropdown-menu li\").filter(function() {\n");
      out.write("      $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)\n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("       \n");
      out.write("\n");
      out.write(" \n");
      out.write("      \n");
      out.write("            <button class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\">Our MeNu<span class=\"caret\"></span></button>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                 <input class=\"form-control\" id=\"myInput\" type=\"text\" placeholder=\"Search..\">\n");
      out.write("                    <li><a href=\"#section41\">VEG PIZZAS</a></li>\n");
      out.write("                    <li><a href=\"#section42\">NON VEG PIZZAS</a></li>\n");
      out.write("                    <li><a href=\"#\">SIDE ORDERS</a></li>\n");
      out.write("                    <li><a href=\"#\">BEVERAGES</a></li>\n");
      out.write("                    <li><a href=\"#\">CHOICE OF CRUSTS</a></li>\n");
      out.write("                    <li><a href=\"#\">CHOICE OF TOPPINGS</a></li>\n");
      out.write("                    <li><a href=\"#\">PIZZA MANIA</a></li>\n");
      out.write("                    <li><a href=\"#\">BURGER PIZZA</a></li>\n");
      out.write("                    <li><a href=\"#\">CHICKEN</a></li>\n");
      out.write("            </ul>\n");
      out.write("      </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <ul>\n");
      out.write("          <li><a href=\"#section1\">SPECIAL OFFERS</a></li>\n");
      out.write("          <li><a href=\"#section1\">INSIDE FooDuDe</a></li>\n");
      out.write("          <li><a href=\"#section2\">GIFT CARD</a></li>\n");
      out.write("          <li><a href=\"#section3\">CONTACT</a></li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("        </div>\n");
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
