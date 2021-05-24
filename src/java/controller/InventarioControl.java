/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.InventarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Inventario;

/**
 *
 * @author dev
 */
public class InventarioControl extends HttpServlet {

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
            out.println("<title>Servlet InventarioControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InventarioControl at " + request.getContextPath() + "</h1>");
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
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("show")) {
            request.getRequestDispatcher("lista_inventarios.jsp").forward(request, response);

        }

           if (action.equalsIgnoreCase("showdetalle")) {
            String id= request.getParameter("id");
            request.setAttribute("id", id);
            request.getRequestDispatcher("lista_detalles.jsp").forward(request, response);

        }
        
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

        String bodega = request.getParameter("bodega");
        String fecha = request.getParameter("fecha");
        String observacion = request.getParameter("observacion");

        Inventario b = new Inventario();
        b.setBodega(bodega);
        b.setFecha(fecha);
        b.setObservacion(observacion);

        if (InventarioDAO.registrar(b)) {
            request.setAttribute("mensaje", "Registro OK");
        } else {
            request.setAttribute("mensaje", "Registro No Registrado");
        }
        request.getRequestDispatcher("lista_inventarios.jsp").forward(request, response);

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
