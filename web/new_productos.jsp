<%@include file="header.jsp" %>

        <div class="container">
            <h3>Bodegas</h3><br>
            <a href="index.jsp">Volver</a>
            <form action="">
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
                
                <button type="submit" class="btn btn-primary">Crear Producto</button>
            </form>           
          
        </div>

<%@include file="footer.jsp" %>
