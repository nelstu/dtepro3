<%-- 
    Document   : new_detalles
    Created on : 23-05-2021, 11:41:00
    Author     : dev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<%
    String ide = request.getParameter("id");
%>
<div class="container">

    <form action="DetInventarioControl" method="POST">
        <div class="form-group">
            <label for="ide">Ide:</label>
            <input type="text" class="form-control" readonly placeholder="Ingrese Ide" id="ide" name="ide" value="<%= ide%>">
        </div>

        <div class="form-group">
            <label for="codigo">Codigo:</label>
            <input type="text" class="form-control" placeholder="Ingrese Codigo" id="codigo"  name="codigo">
        </div>
        <div class="form-group">
            <label for="producto">Producto:</label>
            <input type="text" class="form-control" placeholder="Ingrese Producto" id="producto"  name="producto">
            <button type="button" class="btn btn-primary" id="btn-search">Seleccionar</button>
        </div>

        <div class="form-group">
            <label for="un">Un:</label>
            <input type="text" class="form-control" placeholder="Ingrese Un" id="un"  name="un">
        </div>

        <div class="form-group">
            <label for="cantidad">Cantidad:</label>
            <input type="text" class="form-control" placeholder="Ingrese Cantidad" id="cantidad" name="cantidad">
        </div>



        <input class="btn btn-primary" type="submit" name="accion" value="Agregar">
    </form>


    <!-- Modal -->
    <div class="modal fade" id="mimodalproductos" role="dialog">
        <div class="modal-dialog">

            <!-- Modal content-->
            <div class="modal-content">
                <div class="modal-header">

                    <h4 class="modal-title">Buscar Productos</h4>
                </div>
                <div class="modal-body">
                    Buscar
                    <input type="text" name="buscar"  id="buscar" /><br>
                    <table class="table" id="buscardor" name="buscardor">
                        <thead>
                            <tr>
                                <th></th>
                                <th>Codigo</th>
                                <th>Producto</th>
                                <th>Un</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><button id="btn-seleccionar">Seleccionar</button></td>
                                <td>10-00</td>
                                <td>Producto 1</td>
                                <td>Un</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Salir</button>
                </div>
            </div>

        </div>
    </div>     
    <!-- Modal -->          
</div>


<%@include file="footer.jsp" %>
<script>
    $("#btn-search").on("click", function () {
        $("#mimodalproductos").modal("show");

    });

    $("#buscar").keypress(function (e) {
    var code = (e.keyCode ? e.keyCode : e.which);
            if (code == 13) {
            e.preventDefault();
           
             $('#mimodalproductos').find('.modal-body tbody tr').remove();
            search = $("#buscar").val();
            if (search.length == 0) {
                alert("Ingrese Codigo de barra");
                return;
             }
    $.ajax({
    url: "api/buscarbarra.php?term=" + search,
            type: "POST",
            dataType: "json",
            crossDomain: true,
            data: {
            term: search,
            }
    }).then(function (response) {

    $.each(response, function (i, val) {
       //$('#buscador').append('<tr ><td>' + val.barra + '</td><td>' + decodeURI(val.producto) + '</td><td>UN</td><td>' + val.venta2 + '</td><td>1</td><td class="subtotal">' + val.venta2 + '</td><td><button onclick="deleteRow(this)">-</button></td></tr>');
          $('#mimodalproductos').find('.modal-body tbody')
            .append('<tr>')
            .append('<td><button id="btn-seleccionar">Seleccionar</button></td>')
            .append('<td>10-00</td>')
            .append('<td>Producto 1</td>')
            .append(' <td>Un</td>')
            .append(' </tr>');  
            });
        });
            $('#buscar').val("");
    }
    });
</script>
