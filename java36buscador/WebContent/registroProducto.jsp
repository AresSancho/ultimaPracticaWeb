<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

introduce los datos del nuevo producto:<br/>
<form method="post" action="ServletRegistroProducto" 
enctype="multipart/form-data">
	nombre: <input type="text" name="campoNombre"/><br/>
	precio: <input type="text" name="campoPrecio"/><br/>
	
	selecciona una categoria:
	<select name="campoIdCategoria">
		<c:forEach items="${categorias}" var="categoria">
			<option value="${categoria.id}">${categoria.nombre}</option>
		</c:forEach>
	</select><br/>
	
	imagen: <input type="file" name="campoImagen"/><br/>
	<input type="submit" value="REGISTRAR PRODUCTO"/> 
</form>



</body>
</html>







