<%@page import="model.Bodega"%>
<%@page import="dao.BodegaDAO"%>
<%@include file="header.jsp" %>
<%
    String  idbodega=String.valueOf(request.getAttribute("idbodega"));
    

              BodegaDAO dao=new BodegaDAO();
              String id=String.valueOf(request.getAttribute("idbodega"));
              Bodega p=BodegaDAO.listarf(id);
   
    %>
        <div class="container">
            <h3>Bodegas</h3><br>
            <a href="lista_bodegas.jsp">Volver</a>
            <form action="BodegaControl" method="POST">
                 <div class="form-group">
                    <label for="id">Id:</label>
                    <input type="text" class="form-control" readonly placeholder="Id" id="id"  name="id" value="<%= idbodega%>">
                </div>
                <div class="form-group">
                    <label for="bodega">Bodega:</label>
                    <input type="text" class="form-control" placeholder="Ingrese Bodega" id="bodega"  name="bodega" value="<%= p.getBodega()%>">
                </div>
               
                <input class="btn btn-danger" type="submit" name="accion" value="Eliminar">
            </form>           
          
        </div>

<%@include file="footer.jsp" %>