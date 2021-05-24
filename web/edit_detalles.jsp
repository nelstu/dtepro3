<%@page import="model.DetInventario"%>
<%@page import="dao.DetInventarioDAO"%>
<%@include file="header.jsp" %>
<%
    String id = String.valueOf(request.getAttribute("id"));
    DetInventarioDAO dao = new DetInventarioDAO();
    DetInventario p = DetInventarioDAO.listarf(id);
%>

<div class="container">
    <h3>Editar Detalle de Inventarios</h3><br>
    <a href="InventarioControl?accion=showdetalle&id=<%= p.getIde() %>">Volver</a>
    <form action="DetInventarioControl" method="POST">
        <div class="form-group">
            <label for="id">Id:</label>
            <input type="text" class="form-control" readonly placeholder="Id" id="id"  name="id" value="<%= id%>">
        </div>

        <div class="form-group">
            <label for="ide">Ide:</label>
            <input type="text" class="form-control" readonly placeholder="Ide" id="ide" name="ide" value="<%= p.getIde()%>">
        </div>

        <div class="form-group">
            <label for="codigo">Codigo:</label>
            <input type="text" class="form-control" placeholder="Ingrese Codigo" id="codigo" name="codigo" value="<%= p.getCodigo()%>">
        </div>
        <div class="form-group">
            <label for="producto">Producto:</label>
            <input type="text" class="form-control" placeholder="Ingrese Producto" id="producto" name="producto" value="<%= p.getProducto()%>">
        </div>

        <div class="form-group">
            <label for="un">Un:</label>
            <input type="text" class="form-control" placeholder="Ingrese Un" id="un" name="un" value="<%= p.getUn()%>">
        </div>

        <div class="form-group">
            <label for="cantidad">Cantidad:</label>
            <input type="text" class="form-control" placeholder="Ingrese Cantidad" id="cantidad" name="cantidad" value="<%= p.getCantidad()%>">
        </div>


        <input class="btn btn-primary" type="submit" name="accion" value="Actualizar"> 
    </form>           

</div>

<%@include file="footer.jsp" %>

