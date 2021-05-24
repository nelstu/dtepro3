<%@page import="java.util.Iterator"%>
<%@page import="dao.ProductoDAO"%>
<%@page import="model.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>

        <div class="container">
            <h3>Productos</h3><br>
            <a href="new_productos.jsp">Nuevo</a>
            <table  class="table table-hover">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Codigo</th>
                        <th>Productos</th>
                        <th>Un</th>
                        <th>Familia</th>
                   
                         <th>Editar</th>
                          <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                     <%
                        ArrayList<Producto> arr = ProductoDAO.listar();
                        Iterator<Producto> it = arr.iterator();
                        // mientras al iterador queda proximo juego
                        while (it.hasNext()) {
                            Producto item = it.next();
                    %>
                    <tr>
                        <td><%= item.getId()%></td>
                        <td><%= item.getCodigo() %></td>
                        <td><%= item.getProducto() %></td>
                        <td><%= item.getUn() %></td>
                        <td><%= item.getFamilia() %></td>
                       
                        <td><a href="edit_productos.jsp">Editar</a></td>
                        <td><a href="eli_productos.jsp">Eliminar</a></td>
                    </tr>
                    <%
                        }
                    %> 
                     
                 
                 
                </tbody>
            </table>
          
        </div>

<%@include file="footer.jsp" %>
