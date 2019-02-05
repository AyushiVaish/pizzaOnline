/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USER
 */
public class pepper5 extends HttpServlet {

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
            out.println("<title>Servlet pepper5</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet pepper5 at " + request.getContextPath() + "</h1>");
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
       // processRequest(request, response);
        
       
response.setContentType("text/html;charset=UTF-8");
PrintWriter out= response.getWriter();

  Integer reg = Integer.parseInt(request.getParameter("reg"));
  Integer med=Integer.parseInt(request.getParameter("med"));
  Integer large=Integer.parseInt(request.getParameter("large"));
  Integer new1 =Integer.parseInt(request.getParameter("new"));
  Integer wheat=Integer.parseInt(request.getParameter("wheat"));
  Integer cheese=Integer.parseInt(request.getParameter("cheese"));
  Integer fresh=Integer.parseInt(request.getParameter("fresh"));
  Integer multi=Integer.parseInt(request.getParameter("multi"));
 reg=205;
 med=385;
 large=695;
 new1=450;
 wheat=500;
 cheese=549;
 fresh=485;
 multi=510;
  Integer quantity=Integer.parseInt(request.getParameter("quantity"));
   Integer add=Integer.parseInt(request.getParameter("add"));
    Integer toppings=Integer.parseInt(request.getParameter("toppings"));
    Integer total=quantity*(reg+med+large+new1+wheat+cheese+fresh+multi+(65*add)+(50*toppings));
     
   out.print(total);
    
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
