$(document).ready(function() {
	console.log("CRUD!!");

	$('.usuario').click(function(e) {
		console.log("No puede realizar acciones");
		var cedula = $('[name="cedula"]').val();
		var nombre = $('[name="nombre"]').val();
		var correo = $('[name="email"]').val();
		var usuario = $('[name="usuario"]').val();
		var pass = $('[name="password"]').val();
		var id = $(this).attr('id');
		var valid = true;
		console.log(id);

		switch (id){
			case "agregar":
				valid = validarInsertCreate(cedula, nombre, correo, usuario, pass);
				return valid;
			break;
			case "actualizar":
				valid = validarInsertCreate(cedula, nombre, correo, usuario, pass);
				return valid;
			break;
			case "borrar":
				valid = validDelete(cedula);
				return valid;
			break;
		}
	});
	
	$('.cliente').click(function(e) {
		console.log("No puede realizar acciones");
		var cedula = $('[name="cedula"]').val();
		var nombre = $('[name="nombre"]').val();
		var correo = $('[name="email"]').val();
		var direccion = $('[name="direccion"]').val();
		var telefono = $('[name="telefono"]').val();
		var id = $(this).attr('id');
		var valid = true;
		console.log(id);

		switch (id){
			case "agregar":
				valid = validarInsertCreate(cedula, nombre, correo, direccion, telefono);
				return valid;
			break;
			case "actualizar":
				valid = validarInsertCreate(cedula, nombre, correo, direccion, telefono);
				return valid;
			break;
			case "borrar":
				valid = validDelete(cedula);
				return valid;
			break;
		}
	});
	
	$('.proveedor').click(function(e) {
		console.log("No puede realizar acciones");
		var nit = $('[name="cedula"]').val();
		var nombre = $('[name="nombre"]').val();
		var direccion = $('[name="direccion"]').val();
		var telefono = $('[name="telefono"]').val();
		var ciudad = $('[name="ciudad"]').val();
		var id = $(this).attr('id');
		var valid = true;
		console.log(id);

		switch (id){
			case "agregar":
				valid = validarInsertCreate(nit, nombre, direccion, telefono, ciudad);
				return valid;
			break;
			case "actualizar":
				valid = validarInsertCreate(nit, nombre, direccion, telefono, ciudad);
				return valid;
			break;
			case "borrar":
				valid = validDelete(nit);
				return valid;
			break;
		}
	});
});

function validDelete(cedula) {
	var valid = true;

	if (cedula == "") {
		$('#errorMsg1').fadeIn();
		setTimeout(function() {
			$('#errorMsg1').fadeOut();
		}, 2000);
		valid = false;
	}
	
	return valid;
}

function validarInsertCreate(cedula, nombre, correo, usuario, pass) {
	var valid = true;

	if (cedula == "") {
		$('#errorMsg1').fadeIn();
		setTimeout(function() {
			$('#errorMsg1').fadeOut();
		}, 2000);
		valid = false;
	}

	if (nombre == "") {
		$('#errorMsg2').fadeIn();
		setTimeout(function() {
			$('#errorMsg2').fadeOut();
		}, 2000);
		valid = false;
	}

	if (correo == "") {
		$('#errorMsg3').fadeIn();
		setTimeout(function() {
			$('#errorMsg3').fadeOut();
		}, 2000);
		valid = false;
	}

	if (usuario == "") {
		$('#errorMsg4').fadeIn();
		setTimeout(function() {
			$('#errorMsg4').fadeOut();
		}, 2000);
		valid = false;
	}

	if (pass == "") {
		$('#errorMsg5').fadeIn();
		setTimeout(function() {
			$('#errorMsg5').fadeOut();
		}, 2000);
		valid = false;
	}

	return valid;
}
