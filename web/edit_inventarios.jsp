<%@include file="header.jsp" %>

        <div class="container">
            <h3>Inventarios</h3><br>
            <a href="lista_inventarios.jsp">Volver</a>
            <form action="">
                <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" readonly placeholder="Id" id="id">
                </div>

                <div class="form-group">
                    <label for="bodega">Bodega:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Bodega" id="bodega">
                </div>
                
                <div class="form-group">
                    <label for="fecha">Fecha:</label>
                    <input type="date" class="form-control" placeholder="Ingrese Fecha" id="fecha">
                </div>
               
                <div class="form-group">
                    <label for="observacion">Observacion:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Observacion" id="observacion">
                </div>
                
                <button type="submit" class="btn btn-primary">Editar Inventario</button>
            </form>           
          
        </div>

<%@include file="footer.jsp" %>
