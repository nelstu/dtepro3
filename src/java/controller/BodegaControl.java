/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BodegaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Bodega;

/**
 *
 * @author dev
 */
public class BodegaControl extends HttpServlet {

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
            out.println("<title>Servlet BodegaControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BodegaControl at " + request.getContextPath() + "</h1>");
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

        String bodega = request.getParameter("bodega");
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("showadd")) {
            request.getRequestDispatcher("new_bodegas.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("showedit")) {
            String idbodega = request.getParameter("id");
            request.setAttribute("idbodega", idbodega);
            BodegaDAO.listarf(idbodega);

            request.getRequestDispatcher("edit_bodegas.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("showeli")) {
            String idbodega = request.getParameter("id");
            request.setAttribute("idbodega", idbodega);
            BodegaDAO.listarf(idbodega);
            request.getRequestDispatcher("eli_bodegas.jsp").forward(request, response);

        }
        
            if (action.equalsIgnoreCase("show")) {
            request.getRequestDispatcher("lista_bodegas.jsp").forward(request, response);

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
        String action = request.getParameter("accion");

        if (action.equalsIgnoreCase("Actualizar")) {
            String idbodega = request.getParameter("id");
            Bodega b = new Bodega();
            b.setId(Integer.parseInt(idbodega));
            b.setBodega(bodega);

            if (BodegaDAO.actualizar(b)) {
                request.setAttribute("mensaje", "Registro Actualizado");
            } else {
                request.setAttribute("mensaje", "Registro No Registrado");
            }
            request.getRequestDispatcher("lista_bodegas.jsp").forward(request, response);
            
             

        }

        if (action.equalsIgnoreCase("agregar")) {
            Bodega b = new Bodega();
            b.setBodega(bodega);

            if (BodegaDAO.registrar(b)) {
                request.setAttribute("mensaje", "Registro OK");
            } else {
                request.setAttribute("mensaje", "Registro No Registrado");
            }
            request.getRequestDispatcher("lista_bodegas.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("Eliminar")) {
            String idbodega = request.getParameter("id");
            Bodega b = new Bodega();
            b.setId(Integer.parseInt(idbodega));
            b.setBodega(bodega);

            if (BodegaDAO.eliminar(b)) {
                request.setAttribute("mensaje", "Registro Eliminado");
            } else {
                request.setAttribute("mensaje", "Registro No Eliminado");
            }
            request.getRequestDispatcher("lista_bodegas.jsp").forward(request, response);

        }

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
