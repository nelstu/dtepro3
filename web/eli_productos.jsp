<%@include file="header.jsp" %>

        <div class="container">
            <h3>Productos</h3><br>
            <a href="lista_productos.jsp">Volver</a>
            <form action="">
                  <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" readonly placeholder="Id" id="id">
                </div>
                
                <div class="form-group">
                    <label for="codigo">Codigo:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Codigo" id="codigo">
                </div>
                <div class="form-group">
                    <label for="producto">Producto:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Producto" id="producto">
                </div>

                <div class="form-group">
                    <label for="un">Un:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Un" id="un">
                </div>
                
                <div class="form-group">
                    <label for="familia">Familia:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Familia" id="familia">
                </div>
                
                <div class="form-group">
                    <label for="stock">Stock Actual:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Stock Actual" id="stock">
                </div>
                
                <button type="submit" class="btn btn-danger">Eliminar Producto</button>
            </form>           
          
        </div>

<%@include file="footer.jsp" %>

