/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aayu
 */
public class NonVeg extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NonVeg</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NonVeg at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     //   processRequest(request, response);
       ServletOutputStream sos = response.getOutputStream();
    int reg=0;
    int med=0;
    int large=0;
    int new1=0;
    int fresh=0;
    int cheese=0;
    int multi=0;
    int wheat=0;
    int addition=0;
     int addition1=0;
     int addition2=0;
        String name=request.getParameter("size");
        if(name.equals("regular")){
            reg = 295;
        }
        else if(name.equals("medium")){
             med = 555;
        }
        else {
          large = 835;
        }
 String name1=request.getParameter("crust");
  if(name1.equals("new1")){
            new1 = 555;
        }
  else if(name1.equals("wheat")){
             wheat = 605;
        }
    else if(name1.equals("cheese")){
             cheese = 654;
        }
    else if (name1.equals("fresh")){
            fresh =590 ;
        }
    else{
     multi = 615;
    }
 int quantity = Integer.parseInt(request.getParameter("quantity"));
   String add1 = request.getParameter("add");
 if(add1.equals("checked")){
 addition1=65;
 }
 String add = request.getParameter("topveg");
 if(add.equals("checked")){
 addition=50;
 }
String toppings = request.getParameter("topnon");
if(toppings.equals("checked")){
 addition2=65;
 }
  sos.print("<body bgcolor='yellow'>");
 int total = quantity*(reg+med+large+cheese+fresh+multi+new1+wheat+addition+addition1+addition2);

 sos.print("<h1>The total amount is :"+ total +"</h1>");
   
    sos.close();
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
