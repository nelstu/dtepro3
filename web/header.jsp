<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Modulo de Inventarios</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    </head>
    <body>

        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <!-- Brand -->
            <a class="navbar-brand" href="#">N2</a>

            <!-- Links -->
            <ul class="navbar-nav">
                 <!-- Dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                        Tablas
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="lista_productos.jsp">Productos</a>
                        <a class="dropdown-item" href="BodegaControl?accion=show">Bodegas</a>
                      
                    </div>
                </li>

                <!-- Dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                        Inventarios
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="InventarioControl?accion=show">Inventarios</a>
                        <a class="dropdown-item" href="lista_entradas.jsp">Entradas</a>
                        <a class="dropdown-item" href="lista_salidas.jsp">Salidas</a>
                        <a class="dropdown-item" href="lista_traspasos.jsp">Traspasos</a>
                    </div>
                </li>
                
                  <!-- Dropdown -->
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">
                        Informes
                    </a>
                    <div class="dropdown-menu">
                        <a class="dropdown-item" href="lista_stock.jsp">Stock de Productos</a>
                       
                    </div>
                </li>
                
                
            </ul>
        </nav>
        <br>