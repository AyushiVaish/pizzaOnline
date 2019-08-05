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
public class SideOrders extends HttpServlet {

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
            out.println("<title>Servlet SideOrders</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SideOrders at " + request.getContextPath() + "</h1>");
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

       
                ServletOutputStream sos = response.getOutputStream();
            
            int quantity1=0;
            int quantity2=0;
            int quantity3=0;
            int quantity4=0;
            int quantity5=0;
            int quantity6=0;
            int quantity7=0;
            int quantity8=0;
            int quantity9=0;
            int quantity0=0;
            int quantity10=0;
            int quantity11=0;
            int quantity12=0;
            int quantity13=0;
            int quantity14=0;
            int quantity15=0;
            int quantity16=0;
            int quantity17=0;
            int quantity18=0;
            int quantity19=0;
            int quantity20=0;
            int quantity21=0;
            int quantity22=0;
            int quantity23=0;
            int quantity25=0;
            int quantity24=0;
            int quantity26=0;
            int quantity27=0;
            
             quantity1 = Integer.parseInt(request.getParameter("quantity1"));
             quantity2 = Integer.parseInt(request.getParameter("quantity2"));
             quantity3 = Integer.parseInt(request.getParameter("quantity3"));
             quantity4 = Integer.parseInt(request.getParameter("quantity4"));
             quantity5 = Integer.parseInt(request.getParameter("quantity5"));
             quantity6 = Integer.parseInt(request.getParameter("quantity6"));
             quantity7 = Integer.parseInt(request.getParameter("quantity7"));
             quantity8 = Integer.parseInt(request.getParameter("quantity8"));
             quantity9 = Integer.parseInt(request.getParameter("quantity9"));
             quantity0 = Integer.parseInt(request.getParameter("quantity0"));
             quantity10 = Integer.parseInt(request.getParameter("quantity10"));
             quantity11 = Integer.parseInt(request.getParameter("quantity11"));
             quantity12 = Integer.parseInt(request.getParameter("quantity12"));
             quantity13 = Integer.parseInt(request.getParameter("quantity13"));
             quantity14 = Integer.parseInt(request.getParameter("quantity14"));
             quantity15 = Integer.parseInt(request.getParameter("quantity15"));
             quantity16 = Integer.parseInt(request.getParameter("quantity16"));
             quantity17 = Integer.parseInt(request.getParameter("quantity17"));
             quantity18 = Integer.parseInt(request.getParameter("quantity18"));
             quantity19 = Integer.parseInt(request.getParameter("quantity19"));
             quantity20 = Integer.parseInt(request.getParameter("quantity20"));
             quantity21 = Integer.parseInt(request.getParameter("quantity21"));
             quantity22 = Integer.parseInt(request.getParameter("quantity22"));
             quantity23 = Integer.parseInt(request.getParameter("quantity23"));
             quantity24 = Integer.parseInt(request.getParameter("quantity24"));
             quantity25 = Integer.parseInt(request.getParameter("quantity25"));
             quantity26 = Integer.parseInt(request.getParameter("quantity26"));
             quantity27 = Integer.parseInt(request.getParameter("quantity27"));
            
            int total =0;
            total= (quantity1*99) + (quantity2 *145) +(quantity3*139) +(quantity4*139) +(quantity5*135) +(quantity6*135) +(quantity7*129) +(quantity8*125) +(quantity9*99) +(quantity0*99)+(quantity10*60)+(quantity11*59)+(quantity12*59)+(quantity13*59)+(59*quantity14)+(quantity15*59)+(39*quantity16)+(quantity17*35)+(quantity18*25)+(quantity19*25)+(quantity20*99)+(quantity21*109)+(quantity22*139)+(quantity23*139)+(quantity24*109)+(quantity25*90)+(quantity26*99)+(quantity27*1);
            
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
