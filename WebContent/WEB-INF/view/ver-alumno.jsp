<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Procesar alumno</title>
</head>
<body>
	<h1>Cliente</h1>
	<p>Nombre:${alumno.nombre}</p>
	<p>DNI:${alumno.dni}</p>
	<p>Becado${alumno.becado}</p>
	Asignaturas:

	<ul>
		<c:forEach var="asignatura" items="${alumno.listaAsignaturas}">

			<li>${asignatura}</li>

		</c:forEach>
	</ul>
</body>
</html>