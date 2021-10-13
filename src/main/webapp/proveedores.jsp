<%@include file="../Template/header.jsp"%>
<br />
<br />

<div class="container" style="padding-left: 21%;">
	<form method="post" action="">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-4 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="id-card-outline"></ion-icon> NIT</label> <input type="text"
							name="cedula" class="form-control" id="nit">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un NIT valido</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="body-outline"></ion-icon> Nombre Proveedor</label> <input
							type="text" name="nombre" class="form-control" id="nombre">
						<div class="error" id="errorMsg2">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un nombre valido</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="finger-print-outline"></ion-icon> Dirección</label> <input
							type="text" name="direccion" class="form-control" id="direccion">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte una direccion valida</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="finger-print-outline"></ion-icon> Teléfono</label> <input
							type="text" name="telefono" class="form-control" id="telefono">
						<div class="error" id="errorMsg4">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un telefono valido</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>

		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="finger-print-outline"></ion-icon> Ciudad</label> <input
							type="text" name="ciudad" class="form-control" id="ciudad">
						<div class="error" id="errorMsg5">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte una Ciudad valida</div>
							</div>
						</div>
					</div>
				</div>


			</div>
		</div>

	</form>

	<div class="container-fluid buttons">
		<div class="row" id="map_section">
			<div class="col-2">
				<button type="submit" name="Listar" class="btn btn-dark">
					<ion-icon name="document-text-outline"></ion-icon>
					Consultar
				</button>
			</div>
			<div class="col-2">
				<button type="submit" value="Agregar" name="Agregar"
					class="btn btn-dark proveedor" id="agregar">
					<ion-icon name="checkmark-done-outline"></ion-icon>
					Crear
				</button>
			</div>
			<div class="col-2">
				<button type="submit" value="Actualizar" name="Actualizar"
					class="btn btn-dark proveedor" id="actualizar">
					<ion-icon name="checkmark-done-outline"></ion-icon>
					Actualizar
				</button>
			</div>
			<div class="col-2">
				<button type="submit" value="Borrar" name="Borrar"
					class="btn btn-dark proveedor" id="borrar">
					<ion-icon name="checkmark-done-outline"></ion-icon>
					Borrar
				</button>
			</div>
		</div>
	</div>

</div>

<br />
<br />
<%@include file="../Template/footer.jsp"%>