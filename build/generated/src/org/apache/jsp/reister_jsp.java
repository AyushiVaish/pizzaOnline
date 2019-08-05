package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>REGISTER</title>\n");
      out.write("            <style>\n");
      out.write("            body {\n");
      out.write("                background-image: url(pizza.jpg);\n");
      out.write("                -webkit-background-size: cover;\n");
      out.write("                background-size:cover;\n");
      out.write("                background-position: center,center;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .form-area {\n");
      out.write("                width:500px;\n");
      out.write("                height: 750px;\n");
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
      out.write("            .form-area h2 {\n");
      out.write("                margin-bottom: 45px;\n");
      out.write("                color: #fff;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .img-area {\n");
      out.write("                width:50px;\n");
      out.write("                height:50px;\n");
      out.write("                border-radius:50%;\n");
      out.write("                background: tomato;\n");
      out.write("                position:absolute;\n");
      out.write("                top:-5%;\n");
      out.write("                left:45%;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .img-area img{\n");
      out.write("                width:95%;\n");
      out.write("                padding:10px;\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                width:100%;\n");
      out.write("                height:50px;\n");
      out.write("                border-radius:15px 0 15px 0;\n");
      out.write("                 border : 2px solid #fff;\n");
      out.write("                 margin-bottom: 15px;\n");
      out.write("                 background-color: transparent;\n");
      out.write("                 color: #fff;\n");
      out.write("            }\n");
      out.write("            .form-area p{\n");
      out.write("                text-align: left;\n");
      out.write("                color:#fff;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                font-weight:bold;\n");
      out.write("            }\n");
      out.write("            .btn {\n");
      out.write("                display:inline-block;\n");
      out.write("                height: 40px;\n");
      out.write("                width:150px;\n");
      out.write("                line-height: 40px;\n");
      out.write("                overflow: hidden;\n");
      out.write("                position: relative;\n");
      out.write("                text-align: center;\n");
      out.write("                background: tomato;\n");
      out.write("                border-radius: 25px;\n");
      out.write("                color:#fff;\n");
      out.write("                text-transform: uppercase;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                text-decoration: none;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .for-pass {\n");
      out.write("                text-decoration: none;\n");
      out.write("                display:block;\n");
      out.write("                margin-top: 30px;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-size: 20px;\n");
      out.write("                color:#fff;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"ControllerServlet\">\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"form-area\">\n");
      out.write("            <div class=\"img-area\">\n");
      out.write("                <img src=\"icon2.jpg\">\n");
      out.write("            </div>\n");
      out.write("            <h2>SIGNUP FORM</h2>\n");
      out.write("            <p>USER NAME:</p>\n");
      out.write("            <input type=\"text\" name=\"username\" required>\n");
      out.write("           \n");
      out.write("            <p>YOUR EMAIL:</p>\n");
      out.write("            <input type=\"email\" name=\"email\" required  />\n");
      out.write("             <p>YOUR PASSWORD:</p>\n");
      out.write("             <input type=\"password\" title=\"Password must contain :Minimum 9 characters\" name=\"pass\" required pattern=\"^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$\" />\n");
      out.write("                   <p>YOUR CONTACT NUMBER:</p>\n");
      out.write("            <input type=\"number\" name=\"number\" required pattern=\"/^\\d{10}$/\" />\n");
      out.write("                <p>YOUR ADDRESS:</p>\n");
      out.write("                <input type=\"text\" name=\"address\" required />\n");
      out.write("                <p>YOUR ZIP CODE:</p>\n");
      out.write("                <input type=\"text\" name=\"zip\" required />\n");
      out.write("                \n");
      out.write("                <input type=\"submit\" value=\"Sign In\" class=\"btn\"> \n");
      out.write("                <p style=\"text-transform: lowercase; font-size: 20px; margin-top: 10px;\">If you are already SignIn <a href=\"login.jsp\">CLICK ME</a></p>\n");
      out.write("              \n");
      out.write("        </div>\n");
      out.write("        </form>\n");
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
