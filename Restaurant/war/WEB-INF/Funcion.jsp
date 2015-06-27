<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div aling="center">
<form action="/elegir" method="get">
<select name= "Ingresar">
<option value="1">Ingresar plato</option>
<option value="2">Ingresar bebida</option>
<option value="3">Ingresar administrador</option>
<option value="4">Lista de clientes</option>
<option value="5">Lista </option>
</select>
<input type="submit" value="enviar">
</form>

<form method="get" action="/iniciarSesion">
<input type="submit" value="salir" name="salir">
</form>

</body>
</html>