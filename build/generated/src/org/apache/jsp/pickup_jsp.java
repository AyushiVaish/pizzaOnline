package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class pickup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 String connectionURL="jdbc:derby://localhost:1527/pizza";
Connection connection=null;
PreparedStatement statement=null;
ResultSet rs=null;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Pick Up</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-inverse\">\n");
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
      out.write("      <a href=\"index.html\" style=\"color:red;font-size:70px;font-family:Georgia;text-align: center\"><b>FooDuDE</b></a>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\" style=\"font-size:20px;color:green;\">\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("           <li><a href=\"#menu\">Menu</a></li>\n");
      out.write("           \n");
      out.write("          <li><a href=\"specialOffer.jsp\">SPECIAL OFFERS</a></li>\n");
      out.write("          \n");
      out.write("           <li> <a href=\"tel:714653\">\n");
      out.write("                   <span class=\"glyphicon glyphicon-earphone\"></span> 714653</a></li>\n");
      out.write("        <li><a href=\"reister.jsp\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\n");
      out.write("        <li><a href=\"login.jsp\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\n");
      out.write("   \n");
      out.write("      </ul>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</nav>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("        ");
 
         try {
             Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
              String value1=request.getParameter("name");
            
              Integer value2=Integer.parseInt(request.getParameter("number"));
              String sql = "insert into pickup values(?,?)" ;
                connection = DriverManager.getConnection(connectionURL,"pizza","pizza");
                statement=connection.prepareStatement(sql);
                statement.setString(1,value1);  
                statement.setInt(2,value2);
                  statement.executeUpdate();
                  out.print(" <center><p><strong>Arrive soon !!!</strong> your order will be ready within 15 minutes </p></center>");
                  
      out.write("\n");
      out.write("                  <h2><center>Thanks for Choosing us!!!</center></h2>\n");
      out.write("                  <a href=\"index.html\"><b style=\"color:red\"><center>Prev.</center></b></a>\n");
      out.write("         ");
                      
         }
         catch (SQLException e)
         {
             e.printStackTrace();
         }
         
      out.write("\n");
      out.write("        </div>\n");
      out.write("           \n");
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
