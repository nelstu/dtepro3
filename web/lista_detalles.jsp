<%@page import="dao.DetInventarioDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="model.DetInventario"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>
<%
   String ide= String.valueOf(request.getAttribute("id"));
    %>
        <div class="container">
            <h3>Detalle Inventario<%= ide %></h3><br>
            <a href="InventarioControl?accion=show">Volver</a>
            <a href="DetInventarioControl?accion=showadd&id=<%= ide %>">Nuevo</a>
            <table  class="table table-hover">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>ide</th>
                        <th>Codigo</th>
                        <th>Productos</th>
                        <th>Un</th>
                        <th>Cantidad</th>
                       
                         <th>Editar</th>
                          <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
             
                       <%
                        ArrayList<DetInventario> arr = DetInventarioDAO.listar(ide);
                        Iterator<DetInventario> it = arr.iterator();
                        // mientras al iterador queda proximo juego
                        while (it.hasNext()) {
                            DetInventario item = it.next();
                    %>
                    <tr>
                        <td><%= item.getId()%></td>
                        <td><%= item.getIde()%></td>
                        
                        <td><%= item.getCodigo() %></td>
                        <td><%= item.getProducto() %></td>
                        <td><%= item.getUn() %></td>
                        <td><%= item.getCantidad() %></td>
                        <td><a href="DetInventarioControl?accion=showedit&id=<%= item.getId() %>">Editar</a></td>
                        <td><a href="DetInventarioControl?accion=showeli&id=<%= item.getId() %>">Eliminar</a></td>
                    </tr>
                    <%
                        }
                    %> 
                     
                 
                    
                    
                </tbody>
            </table>
          
        </div>

<%@include file="footer.jsp" %>
