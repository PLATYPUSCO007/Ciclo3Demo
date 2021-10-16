<%@include file="../Template/header.jsp"%>
<br />
<br />

<div class="container" style="padding-left: 21%;">
	<form method="post" action="./ClienteServlet">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-4 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="id-card-outline"></ion-icon> Cedula</label> <input type="text"
							name="cedula" class="form-control" id="cedula">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte una cedula valida</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="body-outline"></ion-icon> Nombre Completo</label> <input
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
						<label for="exampleInputEmail1" class="form-label"><ion-icon
								name="at-outline"></ion-icon> Correo Electronico</label> <input
							type="email" name="email" class="form-control" id="email"
							aria-describedby="emailHelp">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un correo valido</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="finger-print-outline"></ion-icon> Dirección</label> <input
							type="text" name="direccion" class="form-control" id="usuario">
						<div class="error" id="errorMsg4">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte una direccion valida</div>
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
								name="finger-print-outline"></ion-icon> Telefono</label> <input
							type="text" name="telefono" class="form-control" id="telefono">
						<div class="error" id="errorMsg5">
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
		<div class="container-fluid buttons">
			<div class="row" id="map_section">
				<div class="col-2">
					<button type="submit" value="Listar" name="Listar"
						class="btn btn-dark cliente">
						<ion-icon name="document-text-outline"></ion-icon>
						Consultar
					</button>
				</div>
				<div class="col-2">
					<button type="submit" value="Agregar" name="Agregar"
						class="btn btn-dark cliente" id="agregar">
						<ion-icon name="checkmark-done-outline"></ion-icon>
						Crear
					</button>
				</div>
				<div class="col-2">
					<button type="submit" value="Actualizar" name="Actualizar"
						class="btn btn-dark cliente" id="actualizar">
						<ion-icon name="checkmark-done-outline"></ion-icon>
						Actualizar
					</button>
				</div>
				<div class="col-2">
					<button type="submit" value="Borrar" name="Borrar"
						class="btn btn-dark cliente" id="borrar">
						<ion-icon name="checkmark-done-outline"></ion-icon>
						Borrar
					</button>
				</div>
			</div>
		</div>
	</form>



</div>

<br />
<br />
<%@include file="../Template/footer.jsp"%>