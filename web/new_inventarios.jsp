<%@include file="header.jsp" %>

        <div class="container">
            <h3>Inventarios</h3><br>
            <a href="lista_inventarios.jsp">Volver</a>
            <form action="InventarioControl" method="POST">
                <div class="form-group">
                    <label for="bodega">Bodega:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Bodega" id="bodega" name="bodega">
                </div>
                
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" placeholder="Ingrese Fecha" id="fecha" name="fecha">
                </div>
               
                <div class="form-group">
                    <label for="observacion">Observacion:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Observacion" id="observacion" name="observacion">
                </div>
                
                <button type="submit" class="btn btn-primary">Crear Inventario</button>
            </form>           
          
        </div>

<%@include file="footer.jsp" %>
