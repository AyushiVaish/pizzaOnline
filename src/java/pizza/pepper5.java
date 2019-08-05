/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

import java.io.IOException;
import java.io.PrintWriter;
import static javafx.scene.paint.Color.color;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
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
   
    int onion=0;
    int capsicum=0;
    int tomato=0;
    int jalapeno=0;
    int corn=0;
    int paneer=0;
    int paprika=0;
    int mushroom=0;
    int olive=0;
        String name=request.getParameter("size");
    
        if(name.equals("regular")){
            reg = 205;
        }
        else if(name.equals("medium")){
             med = 385;
        }
        else {
          large = 695;
        }
 String name1=request.getParameter("crust");
  if(name1.equals("new1")){
            new1 = 450;
        }
  else if(name1.equals("wheat")){
             wheat = 500;
        }
    else if(name1.equals("cheese")){
             cheese = 549;
        }
    else if (name1.equals("fresh")){
            fresh = 485;
        }
    else{
     multi = 510;
    }
        
 int quantity = Integer.parseInt(request.getParameter("quantity"));

        String add = request.getParameter("add");
 if(add.equals("checked")){
 addition=65;
 }
 else {
 addition=0;
 }


/*String onion1 = request.getParameter("onion");
         if(onion1.equals("checked"))
         {
             onion=50;
         }
         else
         {
             onion=0;
         }
String capsicum1 = null;
        capsicum1 = request.getParameter("capsicum");
        if(capsicum1.equals("checked")){
     capsicum=50;
 }
        else{
        capsicum=0;
        }
String tomato1=null;
        tomato1 = request.getParameter("tomato");
         if(tomato1.equals("checked")){
     tomato=50;
 }
         else{
         tomato=0;
         }
String mushroom1=null;
        mushroom1 = request.getParameter("mushroom");
        if(mushroom1.equals("checked")){
     mushroom=50;
 }
        else{
        mushroom=0;
        }
String jalapeno1=null;
        jalapeno1 = request.getParameter("jalapeno");
        if(jalapeno1.equals("checked")){
     jalapeno=50;
 }
        else{
        jalapeno=0;
        }
        String olive1=null;
        olive1 = request.getParameter("olive");
         if(olive1.equals("checked")){
     olive=50;
 }
         else{
         olive=0;
         }
String paprika1=null;
        paprika1 = request.getParameter("paprika");
        if(paprika1.equals("checked")){
     paprika=50;
 }
        else{
            paprika=0;
            }
String corn1=null;
        corn1 = request.getParameter("corn");
         if(corn1.equals("checked")){
     corn=50;
 }
         else{
         corn=0;
         }
      
String paneer1=null;
        paneer1 = request.getParameter("paneer");
         if(paneer1.equals("checked")){
     paneer=50;
 }
         else{
         
         paneer=0;
         } */
 
 int total = 0;
 total=quantity*(reg+med+large+cheese+fresh+multi+new1+wheat+addition+onion+capsicum+tomato+mushroom+jalapeno+olive+paprika+corn+paneer);
sos.print("<h1>The total amount is :"+ total +"</h1>");
 sos.print("<a href='order.jsp'>Click me</a>");

 
    sos.close();
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
