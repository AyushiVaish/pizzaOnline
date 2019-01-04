package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reset_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("   <form role=\"form\" method=\"post\">\n");
      out.write("    <div class=\"box box-primary\">\n");
      out.write("        <div class=\"box-header\">\n");
      out.write("            <h2 class=\"page-header\"><i class=\"fa fa-lock\"></i> Change Password</h2>\n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("                <button type=\"button\" name=\"Submit\" value=\"Save\" class=\"btn btn-danger\"><i class=\"livicon\" data-n=\"pen\" data-s=\"16\" data-c=\"#fff\" data-hc=\"0\" ></i><a href=\"password.jsp\"> Save</a></button>\n");
      out.write("                <button type=\"reset\" name=\"Reset\" value=\"Clear\" class=\"btn btn-primary\"><i class=\"livicon\" data-n=\"trash\" data-s=\"16\" data-c=\"#fff\" data-hc=\"0\"></i> Clear</button>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- /.box-header -->\n");
      out.write("\n");
      out.write("        <div class=\"box-body\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <label>Old Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\">\n");
      out.write("                            <i class=\"fa fa-lock\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <input class=\"form-control\" id=\"oldPassword\" name=\"oldPassword\" value=\"\" placeholder=\"Enter the Old Password\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.input group -->\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <label>New Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\">\n");
      out.write("                            <i class=\"fa fa-lock\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <input class=\"form-control\" id=\"newPassword\" name=\"newPassword\" value=\"\" placeholder=\"Enter the New Password\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.input group -->\n");
      out.write("            </div>\n");
      out.write("            <br/>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <label>Confirm Password</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-xs-12 col-sm-3 col-md-3\">\n");
      out.write("                    <div class=\"input-group\">\n");
      out.write("                        <div class=\"input-group-addon\">\n");
      out.write("                            <i class=\"fa fa-lock\"></i>\n");
      out.write("                        </div>\n");
      out.write("                        <input class=\"form-control\" id=\"confirmPassword\" name=\"confirmPassword\" value=\"\" placeholder=\"Re-enter the New Password\" type=\"password\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- /.input group -->\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("</form>\n");
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
