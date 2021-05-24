/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.DetInventarioDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.DetInventario;

/**
 *
 * @author dev
 */
public class DetInventarioControl extends HttpServlet {

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
            out.println("<title>Servlet DetInventarioControl</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DetInventarioControl at " + request.getContextPath() + "</h1>");
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
        if (action.equalsIgnoreCase("showadd")) {
            request.getRequestDispatcher("new_detalles.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("showedit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id", id);
            DetInventarioDAO.listarf(String.valueOf(id));
            request.getRequestDispatcher("edit_detalles.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("showeli")) {
            int id = Integer.parseInt(request.getParameter("id"));
            request.setAttribute("id", id);
            DetInventarioDAO.listarf(String.valueOf(id));
            request.getRequestDispatcher("eli_detalles.jsp").forward(request, response);

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

        String action = request.getParameter("accion");
        int id = Integer.parseInt(request.getParameter("id"));
        int ide = Integer.parseInt(request.getParameter("ide"));
        String codigo = request.getParameter("codigo");
        String producto = request.getParameter("producto");
        String un = request.getParameter("un");
        Double cantidad = Double.parseDouble(request.getParameter("cantidad"));

        if (action.equalsIgnoreCase("Actualizar")) {
            DetInventario b = new DetInventario();
            b.setId(id);
            b.setIde(ide);
            b.setCodigo(codigo);
            b.setProducto(producto);
            b.setUn(un);
            b.setCantidad(cantidad);

            if (DetInventarioDAO.actualizar(b)) {
                request.setAttribute("mensaje", "Registro Actualizado");
            } else {
                request.setAttribute("mensaje", "Registro No Registrado");
            }
            request.setAttribute("id", ide);
            request.getRequestDispatcher("lista_detalles.jsp").forward(request, response);

        }
        
              if (action.equalsIgnoreCase("Eliminar")) {
            String idbodega = request.getParameter("id");
            DetInventario b = new DetInventario();
            b.setId(Integer.parseInt(idbodega));
           

            if (DetInventarioDAO.eliminar(b)) {
                request.setAttribute("mensaje", "Registro Eliminado");
            } else {
                request.setAttribute("mensaje", "Registro No Eliminado");
            }
             request.setAttribute("id", ide);
            request.getRequestDispatcher("lista_detalles.jsp").forward(request, response);

        }

        if (action.equalsIgnoreCase("agregar")) {
            DetInventario b = new DetInventario();
            b.setIde(ide);
            b.setCodigo(codigo);
            b.setProducto(producto);
            b.setUn(un);
            b.setCantidad(cantidad);

            if (DetInventarioDAO.registrar(b)) {
                request.setAttribute("mensaje", "Registro OK");
            } else {
                request.setAttribute("mensaje", "Registro No Registrado");
            }
            request.setAttribute("id", ide);
            request.getRequestDispatcher("lista_detalles.jsp").forward(request, response);

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
