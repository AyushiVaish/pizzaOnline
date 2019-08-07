package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class _5Pepper_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");

int reg = Integer.parseInt(request.getParameter("reg"));
int med=Integer.parseInt(request.getParameter("med"));
int large=Integer.parseInt(request.getParameter("large"));
int new1 =Integer.parseInt(request.getParameter("new"));
int wheat=Integer.parseInt(request.getParameter("wheat"));
int cheese=Integer.parseInt(request.getParameter("cheese"));
int fresh=Integer.parseInt(request.getParameter("fresh"));
int multi=Integer.parseInt(request.getParameter("multi"));
 reg=205;
 med=385;
 large=695;
 new1=450;
 wheat=500;
 cheese=549;
 fresh=485;
 multi=510;
 int quantity=Integer.parseInt(request.getParameter("quantity"));
 int add=Integer.parseInt(request.getParameter("add"));
 int toppings=Integer.parseInt(request.getParameter("toppings"));
 int total = quantity*(reg+med+large+new1+wheat+cheese+fresh+multi+(65*add)+(50*toppings));
     
 out.print("The total amount is :"+ total);
   
      out.write("\n");
      out.write("    </body></html>\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("     \n");
      out.write("\n");
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
