<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Crear Factura</title>
</head>
<body>

<h1>Crear Factura</h1>

<c:if test="${cumensaje != null}">
	<c:out value="${cumensaje}" />
</c:if>

<form action="CrearUsuario" method="post">
	Nombre: <input type="text" name="txtnombre" /><br/>
	Fecha: <input type="text" name="txtfecha" /> <br/>
	Concepto: <input type="text" name="txtconcepto" /> <br/>
	Cantidad: <input type="text" name="txtcantidad" /> <br/>
	Precio: <input type="text" name="txtprecio" /> <br/>
	Subtotal: <input type="text" name="txtsubtotal" /> <br/>
	Iva (19%): <input type="text" name="txtiva" /> <br/>
	Total: <input type="text" name="txttotal" /> <br/>
	<input type="submit" value="Agregar factura" />
</form>

<a href="${pageContext.request.contextPath}/ListarUsuarios">Volver al listado de factura</a>

</body>
</html>