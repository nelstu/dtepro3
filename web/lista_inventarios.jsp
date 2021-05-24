<%@page import="java.util.Iterator"%>
<%@page import="dao.InventarioDAO"%>
<%@page import="model.Inventario"%>
<%@page import="java.util.ArrayList"%>
<%@include file="header.jsp" %>

<div class="container">
    <h3>Inventarios</h3><br>
    <a href="new_inventarios.jsp">Nuevo</a>
    <table  class="table table-hover">
        <thead>
            <tr>
                <th></th>
                <th>id</th>
                <th>Fecha</th>
                <th>Bodega</th>
                <th>Observacion</th>
                <th>Estado</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
        </thead>
        <tbody>
            <%
                ArrayList<Inventario> arr = InventarioDAO.listar();
                Iterator<Inventario> it = arr.iterator();
                // mientras al iterador queda proximo juego
                while (it.hasNext()) {
                    Inventario item = it.next();
            %>
            <tr>
                <td><a href="InventarioControl?accion=showdetalle&id=<%= item.getId()%>">Detalle</a></td>
                <td><%= item.getId()%></td>
                <td><%= item.getFecha()%></td>
                <td><%= item.getBodega()%></td>
                <td><%= item.getObservacion()%></td>
                <td><%= item.getEstado()%></td>

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
