<%@page import="java.util.Iterator"%>
<%@page import="java.util.ListIterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Bodega"%>
<%@page import="dao.BodegaDAO"%>
<%@include file="header.jsp" %>

        <div class="container">
            <h3>Bodegas</h3><br>
            <a href="BodegaControl?accion=showadd">Nuevo</a>
            <table  class="table table-hover">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Bodega</th>
                         <th>Editar</th>
                          <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        ArrayList<Bodega> arr = BodegaDAO.listar();
                        Iterator<Bodega> it = arr.iterator();
                        // mientras al iterador queda proximo juego
                        while (it.hasNext()) {
                            Bodega item = it.next();
                    %>
                    <tr>
                        <td><%= item.getId()%></td>
                        <td><%= item.getBodega()%></td>
                        <td><a href="BodegaControl?accion=showedit&id=<%=item.getId() %>">Editar</a></td>
                        <td><a href="BodegaControl?accion=showeli&id=<%=item.getId() %>">Eliminar</a></td>
                    </tr>
                    <%
                        }
                    %> 
                     
                 
                 
                 
                </tbody>
            </table>
          
        </div>

<%@include file="footer.jsp" %>
