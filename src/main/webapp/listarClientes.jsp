<%@page import="java.util.Date"%>
<%@page import="co.edu.unbosque.ciclo3demo.Clientes"%>
<%@page import="java.util.ArrayList"%>

<%@include file="../Template/header.jsp"%>
<br />
<br />

<p align="center">LISTADO DE CLIENTES</p>
<p align="center">
	La hora del servidor es
	<%=new Date()%></p>
<table id="results" class="stripe">
	<thead>
		<tr>
			<th>Cedula</th>
			<th>Direccion</th>
			<th>Correo</th>
			<th>Nombre</th>
			<th>Telefono</th>
		</tr>
	</thead>
	<tbody>
		<%
		ArrayList<Clientes> lista = (ArrayList<Clientes>) request.getAttribute("Clientes");
		for (Clientes cliente : lista) {
		%>
		<tr>
			<td><%=cliente.getCedula_cliente()%></td>
			<td><%=cliente.getDireccion_cliente()%></td>
			<td><%=cliente.getEmail_cliente()%></td>
			<td><%=cliente.getNombre_cliente()%></td>
			<td><%=cliente.getTelefono_cliente()%></td>
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