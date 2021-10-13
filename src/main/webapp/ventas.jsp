<%@include file="../Template/header.jsp"%>
<br />
<br />

<div class="container" style="max-width:93%; margin: 0 7%">
	<form method="post" action="" id="consultaUsuario">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-3 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="id-card"></ion-icon> NIT</label> <input type="text"
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
				<div class="col-2 row-4" style="padding-right: 20px; margin-top: 0.5%">
					<div class="mb-3">
						<br />
						<button type="submit" name="consultar" class="btn btn-dark">
							<ion-icon name="caret-forward-circle"></ion-icon>
							Consultar
						</button>
					</div>
				</div>
				<div class="col-3 row-4" style"margin-left:8%">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="accessibility"></ion-icon> Cliente</label> <input type="text"
							name="cliente" class="form-control" id="cliente">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>El cliente no existe</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-3 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="flag"></ion-icon> Consecutivo</label> <input type="text"
							name="consecutivo" class="form-control" id="consecutivo">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>El cliente no existe</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>

<div class="container">
	<form method="post" action="" id="consultaProducto">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-3 row-4" style="padding-left: 3%">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="key-outline"></ion-icon> Codigo Producto</label> <input type="text"
							name="codigoProducto" class="form-control" id="codigoProducto">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un codigo valido</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4" style="margin-top: 0.5%; margin-left: 1.5%;"">
					<div class="mb-3">
						<br />
						<button type="submit" name="consultar" class="btn btn-dark">
							<ion-icon name="caret-forward-circle"></ion-icon>
							Consultar
						</button>
					</div>
				</div>
				<div class="col-3 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="fast-food-outline"></ion-icon> Nombre Producto</label> <input type="text"
							name="nombreProducto" class="form-control" id="nombreProducto">
						<div class="error" id="errorMsg2">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>El producto no existe</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-1 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="file-tray-stacked-outline"></ion-icon> Cant.</label> <input type="text"
							name="cantidad" class="form-control" id="cantidad">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Cantidad no disponible</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="calculator-outline"></ion-icon> Valor Total</label> <input type="text"
							name="total" class="form-control" id="total">
						<div class="error" id="errorMsg4">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Total no calculado</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
<div class="container">
	<form method="post" action="" id="consultaProducto">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-3 row-4" style="padding-left: 3%">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="key-outline"></ion-icon> Codigo Producto</label> <input type="text"
							name="codigoProducto" class="form-control" id="codigoProducto">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un codigo valido</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4" style="margin-top: 0.5%; margin-left: 1.5%;"">
					<div class="mb-3">
						<br />
						<button type="submit" name="consultar" class="btn btn-dark">
							<ion-icon name="caret-forward-circle"></ion-icon>
							Consultar
						</button>
					</div>
				</div>
				<div class="col-3 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="fast-food-outline"></ion-icon> Nombre Producto</label> <input type="text"
							name="nombreProducto" class="form-control" id="nombreProducto">
						<div class="error" id="errorMsg2">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>El producto no existe</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-1 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="file-tray-stacked-outline"></ion-icon> Cant.</label> <input type="text"
							name="cantidad" class="form-control" id="cantidad">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Cantidad no disponible</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="calculator-outline"></ion-icon> Valor Total</label> <input type="text"
							name="total" class="form-control" id="total">
						<div class="error" id="errorMsg4">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Total no calculado</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
<div class="container">
	<form method="post" action="" id="consultaProducto">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-3 row-4" style="padding-left: 3%">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="key-outline"></ion-icon> Codigo Producto</label> <input type="text"
							name="codigoProducto" class="form-control" id="codigoProducto">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Inserte un codigo valido</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4" style="margin-top: 0.5%; margin-left: 1.5%;"">
					<div class="mb-3">
						<br />
						<button type="submit" name="consultar" class="btn btn-dark">
							<ion-icon name="caret-forward-circle"></ion-icon>
							Consultar
						</button>
					</div>
				</div>
				<div class="col-3 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="fast-food-outline"></ion-icon> Nombre Producto</label> <input type="text"
							name="nombreProducto" class="form-control" id="nombreProducto">
						<div class="error" id="errorMsg2">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>El producto no existe</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-1 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="file-tray-stacked-outline"></ion-icon> Cant.</label> <input type="text"
							name="cantidad" class="form-control" id="cantidad">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Cantidad no disponible</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-2 row-4">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="calculator-outline"></ion-icon> Valor Total</label> <input type="text"
							name="total" class="form-control" id="total">
						<div class="error" id="errorMsg4">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Total no calculado</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>

<div class="container">
	<form method="post" action="" id="totales">
		<div class="container-fluid">
			<div class="row" id="map_section">
				<div class="col-6"></div>
				<div class="col-2 row-4" style="margin-top: 0.5%; margin-left: 1.5%;"">
					<div class="mb-3">
						<br />
						<button type="submit" name="consultar" class="btn btn-primary">
							<ion-icon name="checkmark-done-sharp"></ion-icon>
							Confirmar
						</button>
					</div>
				</div>
				<div class="col-3 row-4" style="padding-left: 3%">
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="diamond-sharp"></ion-icon> Total Venta</label> <input type="text"
							name="totalVenta" class="form-control" id="totalVenta">
						<div class="error" id="errorMsg1">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Error en el calculo de Total Venta</div>
							</div>
						</div>
					</div>
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="ice-cream-sharp"></ion-icon> Total IVA</label> <input type="text"
							name="totalIva" class="form-control" id="totalIva">
						<div class="error" id="errorMsg2">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Error en el calculo de Total IVA</div>
							</div>
						</div>
					</div>
					<div class="mb-3">
						<label for="exampleInputText1" class="form-label"><ion-icon name="ribbon-sharp"></ion-icon> Total con IVA</label> <input type="text"
							name="totalConIva" class="form-control" id="totalConIva">
						<div class="error" id="errorMsg3">
							<div class="alert alert-danger d-flex align-items-center"
								role="alert">
								<ion-icon name="warning-outline"></ion-icon>
								<div>Error en el calculo de Total con IVA</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</form>
</div>
<br />
<br />
<%@include file="../Template/footer.jsp"%>