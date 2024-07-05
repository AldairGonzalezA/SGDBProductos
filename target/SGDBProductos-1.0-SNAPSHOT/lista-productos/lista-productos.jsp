<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>JSP Page</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="lista-productos-style.css">
        <link href="https://fonts.googleapis.com/css2?family=Bona+Nova+SC:ital,wght@0,400;0,700;1,400&display=swap" rel="stylesheet">
    </head>
    <body>
        <nav class="navbar navbar-dark bg-dark fixed-top position-relative">
            <div class="container-fluid">
                <a class="navbar-brand" href="./index.jsp">Sistema de Gestion de Productos</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="offcanvas" data-bs-target="#offcanvasDarkNavbar" aria-controls="offcanvasDarkNavbar" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="offcanvas offcanvas-end text-bg-dark" tabindex="-1" id="offcanvasDarkNavbar" aria-labelledby="offcanvasDarkNavbarLabel">
                    <div class="offcanvas-header">
                        <h5 class="offcanvas-title" id="offcanvasDarkNavbarLabel">Sistema de Gestion</h5>
                        <button type="button" class="btn-close btn-close-white" data-bs-dismiss="offcanvas" aria-label="Close"></button>
                    </div>
                    <div class="offcanvas-body">
                        <ul class="navbar-nav justify-content-end flex-grow-1 pe-3">
                            <li class="nav-item">
                                <a class="nav-link" aria-current="page" href="../index.jsp">Inicio</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link"  aria-current="page" href="../formulario-productos/formulario-productos.jsp">Formulario de Productos</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link active"  aria-current="page" href="lista-productos.jsp">Lista de Productos</a>
                            </li>


                            </li>
                        </ul>

                    </div>
                </div>
            </div>
        </nav>
        <div class="divTitle">
            <h2>Lista de Productos</h2>
        </div>
        <div class="principalDiv">
            <table class="table table-striped">
                <body>
                    <thead>
                        <th>Nombre</th>
                        <th>Marca</th>
                        <th>Descripcion</th>
                        <th>Precio</th>
                    </thead>
                </body>
                <tr>
                    <td>Gaseosa</td>
                    <td>Coca Cola</td>
                    <td>Gaseosa azucarada </td>
                    <td>22.00</td>
                </tr>
                <tr>
                    <td>Cereal</td>
                    <td>Choco Chiwi</td>
                    <td>Cereal hecho con arroz y sabor a chocolate</td>
                    <td>20.00</td>
                </tr>
                <tr>
                    <td>Salami</td>
                    <td>Santa Lucia</td>
                    <td>Salami</td>
                    <td>18.00</td>
                </tr>
                <tr>
                    <td>Yogurt</td>
                    <td>Lala</td>
                    <td>Yogurt hecho a base de leche</td>
                    <td>25.00</td>
                </tr>
                <tr>
                    <td>Galleta</td>
                    <td>Oreo</td>
                    <td>Deliciosa galleta de chocolate con relleno cremoso</td>
                    <td>23.00</td>
                </tr>
            </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
    </body>
</html>
