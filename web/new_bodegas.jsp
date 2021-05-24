<%@include file="header.jsp" %>

        <div class="container">
            <h3>Bodegas</h3><br>
            <a href="lista_bodegas.jsp">Volver</a>
            <form action="BodegaControl" method="POST">
                <div class="form-group">
                    <label for="bodega">Bodega:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Bodega" id="bodega" name="bodega">
                </div>
               <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
                
            </form>           
           
        </div>


      

<%@include file="footer.jsp" %>
