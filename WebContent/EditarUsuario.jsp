<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Editar Factura</title>
</head>
<body>

<h1>Editar Factura</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="EditarUsuario" method="post">
	Nombre: <input type="text" name="txtnombre" value="${datosusuario.getNombre()}" /><br/>
	Fecha: <input type="text" name="txtfecha" value="${datosusuario.getFecha()}" /> <br/>
	Concepto: <input type="text" name="txtconcepto" value="${datosusuario.getConcepto()}" /> <br/>
	Cantidad: <input type="text" name="txtcantidad" value="${datosusuario.getCantidad()}" /> <br/>
	Precio: <input type="text" name="txtprecio" value="${datosusuario.getPrecio()}" /> <br/>
	Subtotal: <input type="text" name="txtsubtotal" value="${datosusuario.getSubtotal()}" /> <br/>
	Iva (19%): <input type="text" name="txtiva" value="${datosusuario.getIva()}" /> <br/>
	Total: <input type="text" name="txttotal" value="${datosusuario.getTotal()}" /> <br/>
	<input type="hidden" name="hdnidusuario"  value="${datosusuario.getId()}" />
	<input type="submit" value="Agregar factura" />
</form>

<a href="${pageContext.request.contextPath}/ListarUsuarios">Volver al listado de factura</a>

</body>
</html>