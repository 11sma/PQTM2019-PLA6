<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta clientes</title>
<style>
.error {
	color: red;
}
</style>
</head>
<body>
	<form:form action="procesar" modelAttribute="alumno">
		Nombre(*):<form:input path="nombre" />
		<form:errors path="nombre" cssClass="error" />
		<br />
		DNI:<form:input path="dni" />
		<form:errors path="dni" cssClass="error" />
		<br />
		Mail:<form:input type="mail" path="mail" />
		<form:errors path="mail" cssClass="error" />
		<br />
			Becado: <form:radiobuttons path="becado"
			items="${alumno.listaBecado}" />
		<br />
				Asignaturas: <form:checkboxes path="asignaturas" items="${alumno.listaAsignaturas}" />
		<input type="submit">
	</form:form>
</body>
</html>