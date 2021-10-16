<%@page import="java.util.Date"%>
<%@page import="co.edu.unbosque.ciclo3demo.Usuarios"%>
<%@page import="java.util.ArrayList"%>

<%@include file="../Template/header.jsp"%>
<br />
<br />
<p align="center">LISTADO DE USUARIOS</p>
<p align="center">
	La hora del servidor es
	<%=new Date()%></p>
<table id="results" class="stripe">
	<thead>
		<tr>
			<th>Cedula</th>
			<th>Nombre</th>
			<th>Correo</th>
			<th>Usuario</th>
			<th>Password</th>
		</tr>
	</thead>
	<tbody>
	<%
	ArrayList<Usuarios> lista = (ArrayList<Usuarios>) request.getAttribute("lista");
	for (Usuarios usuario : lista) {
	%>
		<tr>
			<td><%=usuario.getCedula_usuario()%></td>
			<td><%=usuario.getNombre_usuario()%></td>
			<td><%=usuario.getEmail_usuario()%></td>
			<td><%=usuario.getUsuario()%></td>
			<td><%=usuario.getPassword()%></td>
		</tr>
	<%
	}
	%>
	</tbody>
</table>

<script>
	$(document).ready(function() {
		console.log("cargando tablas");
		$("#results").DataTable();
	});
</script>
</body>
</html>