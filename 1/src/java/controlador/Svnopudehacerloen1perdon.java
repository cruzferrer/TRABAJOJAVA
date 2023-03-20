/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controlador;


import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modulo.Producto;
import modulo.arrayyp;
/**
 *
 * @author cruzr
 */
@WebServlet(name = "Svnopudehacerloen1perdon", urlPatterns = {"/Svnopudehacerloen1perdon"})
public class Svnopudehacerloen1perdon extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvComprar</title>");            
            out.println("</head>");
            out.println("<body>" + "<h1>");
            String nombrebuscar=request.getParameter("nombrebuscar").toUpperCase();
            int existenciacomprar=Integer.parseInt(request.getParameter("existenciacomprar"));
            boolean encontrado=false;
            for(Producto objetoproducto:arrayyp.arrayproducto)
                    {
                        if(objetoproducto.getNombrep().equals(nombrebuscar))
                        {
                            int existenciaactual=objetoproducto.getExistenciap();
                            if(existenciaactual>=existenciacomprar)
                            {
                                int existenciaqueda=existenciaactual-existenciacomprar;
                                objetoproducto.setExistenciap(existenciaqueda);
                                double precio=objetoproducto.getPreciop();
                                double pago=existenciacomprar*precio;
                                out.println("Compro: "+existenciacomprar+" existencias de "+objetoproducto.getNombrep());
                                out.println("Debe pagar: "+pago + " pesos"+ "<br>"+
                                        "la cantidad de unidades que quedan son" +" "+ existenciaqueda);
                            } else {
                                out.println("No hay suficientes existencias para realizar la compra, solo hay "+existenciaactual+" existencias de "+objetoproducto.getNombrep());
                            }
                            encontrado=true;
                        }
                    }
            if (!encontrado)
            {
                out.println("Ese producto no esta registrado");
            }
            out.println("</h1></body>");
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
        processRequest(request, response);
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
