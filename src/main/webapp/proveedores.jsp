<%@include file="../Template/header.jsp"%>
<br />
<br />
	
	<div class="container" style="padding-left:21%;">
		<form method="post" action="./DemoServlet">
			<div class="container-fluid">
				<div class="row" id="map_section">
					<div class="col-4 row-4">
						<div class="mb-3">
							<label for="exampleInputText1" class="form-label"><ion-icon
									name="id-card-outline"></ion-icon> NIT</label> <input type="text"
								name="cedula" class="form-control" id="exampleInputText1">
						</div>
					</div>
					<div class="col-4">
						<div class="mb-3">
							<label for="exampleInputText1" class="form-label"><ion-icon
									name="body-outline"></ion-icon> Nombre Proveedor</label> <input type="text"
								name="nombre" class="form-control" id="exampleInputText1">
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
								type="text" name="usuario" class="form-control"
								id="exampleInputText1">
						</div>
					</div>
					<div class="col-4">
						<div class="mb-3">
							<label for="exampleInputText1" class="form-label"><ion-icon
									name="finger-print-outline"></ion-icon> Teléfono</label> <input
								type="text" name="usuario" class="form-control"
								id="exampleInputText1">
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
								type="text" name="usuario" class="form-control"
								id="exampleInputText1">
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
						class="btn btn-dark">
						<ion-icon name="checkmark-done-outline"></ion-icon>
						Crear
					</button>
				</div>
				<div class="col-2">
					<button type="submit" value="Actualizar" name="Actualizar"
						class="btn btn-dark">
						<ion-icon name="checkmark-done-outline"></ion-icon>
						Actualizar
					</button>
				</div>
				<div class="col-2">
					<button type="submit" value="Borrar" name="Borrar"
						class="btn btn-dark">
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