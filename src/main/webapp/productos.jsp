<%@include file="../Template/header.jsp"%>
<br />
<br />

<div class="container" style="padding-left: 21%;">
	<form method="post" action="./DemoServlet">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-4 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon
								name="body-outline"></ion-icon> Nombre del Archivo</label> <input
							type="text" name="nombre" class="form-control"
							id="exampleInputText1">
					</div>
				</div>
				<div class="col-4">
					<div class="mb-3">
						<button type="submit" name="Examinar" class="btn btn-dark">
							<ion-icon name="document-text-outline"></ion-icon>
							Examinar
						</button>
					</div>
				</div>
			</div>
		</div>
	</form>

	<div class="container-fluid buttons">
		<div class="row" id="map_section">
			<div class="col-2">
				<button type="submit" name="Cargar" class="btn btn-dark">
					<ion-icon name="document-text-outline"></ion-icon>
					Cargar
				</button>
			</div>
		</div>
	</div>

</div>

<br />
<br />
<%@include file="../Template/footer.jsp"%>