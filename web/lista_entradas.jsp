<%@include file="header.jsp" %>

        <div class="container">
            <h3>Entradas</h3><br>
            <a href="new_entradas.jsp">Nuevo</a>
            <table  class="table table-hover">
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Fecha</th>
                        <th>Bodega</th>
                        <th>Rut</th>
                        <th>Razon</th>
                        <th>Total</th>
                         <th>Editar</th>
                          <th>Eliminar</th>
                    </tr>
                </thead>
                <tbody>
                     <tr>
                        <td>1</td>
                        <td>10-01-2021</td>
                        <td>Bodega 1</td>
                        <td>11111111-1</td>
                        <td>Razon</td>
                        <td>10000</td>
                        <td><a href="edit_entradas.jsp">Editar</a></td>
                        <td><a href="eli_entradas.jsp">Eliminar</a></td>
                    </tr>
                </tbody>
            </table>
          
        </div>

<%@include file="footer.jsp" %>
