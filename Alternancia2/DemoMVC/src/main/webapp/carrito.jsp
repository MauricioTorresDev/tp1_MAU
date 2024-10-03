<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>CARRITO</title>
</head>
<body>

<div class="container">
    <jsp:include page="menu.jsp"/>

    <div class="card">
        <div class="card-header">
            Nuevo contacto
        </div>
        <div class="card-body">
            <form method="post" action="carrito_agregar">
                <div class="row">
                    <div class="col">
                        <input type="text" class="form-control" placeholder="Contacto" aria-label="Contacto"
                               name="contacto">
                    </div>
                    <div class="col">
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </div>
                </div>
            </form>
        </div>
    </div>

    <div class="card">
        <div class="card-header">
            Lista de contactos
        </div>
        <div class="card-body">
            <table>
                <thead>
                    <th>CONTACTO</th>
                    <th>ELIMINAR</th>
                    <th>EDITAR</th>
                </thead>
                <tbody>
                <c:forEach items="${sessionScope.contactos}" var="contacto">
                    <tr>
                        <td>${contacto}</td>
                        <td>
                            <a href="carrito_eliminar?contacto=${contacto}">Eliminar</a>
                        </td>
                        <td>

                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>

</body>
</html>