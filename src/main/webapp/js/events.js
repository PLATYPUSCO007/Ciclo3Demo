$(document).ready(function() {
	
	

	let pagina = getUrl();
	console.log(pagina);

	switch (pagina) {
		case "usuarios":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link active" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="ventas" href="ventas.jsp">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="reporte" href="#">Reportes</a>` +
				`</li>`
			);

			break;
		case "clientes":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link active" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="ventas" href="ventas.jsp">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="reporte" href="#">Reportes</a>` +
				`</li>`);
				
			break;
		case "proveedores":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link active" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="ventas" href="ventas.jsp">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="reporte" href="#">Reportes</a>` +
				`</li>`);
			break;
		case "productos":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link active" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="ventas" href="ventas.jsp">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="reporte" href="#">Reportes</a>` +
				`</li>`);
			break;
		case "ventas":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link active" id="ventas" href="ventas.jsp">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="reporte" href="#">Reportes</a>` +
				`</li>`);
			break;
		case "reporte":
			refreshLow();
			$('.nav').empty().append(`<li class="nav-item"> ` +
				`<a class="nav-link" id="usuarios" aria-current="page" href="usuarios.jsp">Usuarios</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="clientes" href="clientes.jsp">Clientes</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="proveedores" href="proveedores.jsp">Proveedores</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="productos" href="productos.jsp">Productos</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link" id="ventas" href="#">Ventas</a>` +
				`</li>` +
				`<li class="nav-item">` +
				`<a class="nav-link active" id="reporte" href="#">Reportes</a>` +
				`</li>`);
			break;
		default:
			refreshLow();
			$('.nav').empty().append('<h1>ESTA PAGINA NO EXISTE</h1>');		
	}

});

function getUrl() {
	let url = window.location.href;
	var array_url = url.split("/");
	let pagina = array_url[array_url.length - 1].split(".");
	return pagina[0];
}

function refreshLow() {
	$("body").fadeIn(500);
	$("img").fadeIn(500);
}