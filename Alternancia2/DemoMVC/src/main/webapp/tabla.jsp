<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TABLA DE MULTIPLICAR</title>
</head>
<body>
<jsp:include page="menu.jsp"/>
<h2>LA TABLA</h2>
<form method="post" action="tabla">
    <div>
        <label>Tabla:</label>
        <select name="tabla">
            <option value="S">Sumar</option>
            <option value="R">Restar</option>
            <option value="M">Multiplicar</option>
            <option value="D">Dividir</option>
        </select>
    </div>
    <div>
        <label>Número 1:</label>
        <input type="number" name="num">
    </div>
    <div>
        <input type="submit" name="btnProcesar" value="Procesar">
    </div>
</form>

<c:if test="${tabla != null}">
    <h2>${titulo}</h2>
    <table>
        <c:forEach items="${tabla}" var="r">
            <tr>
                <td>${r.num1}</td>
                <td>${r.operador}</td>
                <td>${r.num2}</td>
                <td>=</td>
                <td>${r.rpta}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
</body>
</html>