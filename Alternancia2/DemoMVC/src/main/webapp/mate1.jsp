<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">


    <title>MCD y MCM de dos números</title>
</head>
<body>
<div class="container">
    
<jsp:include page="menu.jsp"/>
<h2>MCD y MCM de dos Números</h2>
<form method="post" action="mcdmcm">
    <div>
        <label>Número 1:</label>
        <input type="number" name="num1">
    </div>
    <div>
        <label>Número 2:</label>
        <input type="number" name="num2">
    </div>
    <div>
        <input type="submit" name="btnProcesar" value="Procesar">
    </div>
</form>

<c:if test="${dto != null}">
    <h1>RESULTADO</h1>
    <div>Número 1: ${dto.num1}</div>
    <div>Número 2: ${dto.num2}</div>
    <div>MCD: ${dto.mcd}</div>
    <div>MCM: ${dto.mcm}</div>
</c:if>

</div>
<!-- Option 1: Bootstrap Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>