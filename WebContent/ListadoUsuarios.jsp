<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Factura</title>
</head>
<body>

<h1>Listado de Factura</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<table>
	<tr>
		<th>ID</th>
		<th>Nombre</th>
		<th>Fecha</th>
		<th>Concepto</th>
		<th>Cantidad</th>
		<th>Precio</th>
		<th>Subtotal</th>
		<th>Iva (19%)</th>
		<th>Total</th>
		<th>Acciones</th>
	</tr>

<c:forEach items="${listadousuarios}" var="user">
	<tr>
		<td>${user.getId()} </td>
		<td>${user.getNombre()}</td>
		<td>${user.getFecha()}</td>
		<td>${user.getConcepto()}</td>
		<td>${user.getCantidad()}</td>
		<td>${user.getPrecio()}</td>
		<td>${user.getSubtotal()}</td>
		<td>${user.getIva()}</td>
		<td>${user.getTotal()}</td>
		<td>
			<a href="${pageContext.request.contextPath}/EliminarUsuario?id=${user.getId()}">Eliminar</a>
			&nbsp;
			<a href="${pageContext.request.contextPath}/EditarUsuario?id=${user.getId()}">Editar</a>
		</td>
	</tr>
</c:forEach>	
	
</table>

<a href="${pageContext.request.contextPath}/CrearUsuario">Creación de factura</a>


</body>
</html>