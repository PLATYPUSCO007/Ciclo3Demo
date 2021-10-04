<%@include file="../Template/header.jsp"%>
<br/>
<br/>
<form method="post" action="./DemoServlet">
<div class="container-fluid">
    <div class="row" id="map_section">
        <div class="col-4 row-4">
        	<div class="mb-3">
				<label for="exampleInputText1" class="form-label"><ion-icon name="id-card-outline"></ion-icon> Cedula</label> 
				<input type="text" name="cedula" class="form-control" id="exampleInputText1">
			</div>
        </div>
        <div class="col-4">
        	<div class="mb-3">
				<label for="exampleInputText1" class="form-label"><ion-icon name="body-outline"></ion-icon> Nombre</label> 
				<input type="text" name="nombre" class="form-control" id="exampleInputText1">
			</div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row" id="map_section">
        <div class="col-4">
        	<div class="mb-3">
				<label for="exampleInputEmail1" class="form-label"><ion-icon name="at-outline"></ion-icon> Correo Electronico</label> 
				<input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
			</div>
        </div>
        <div class="col-4">
        	<div class="mb-3">
				<label for="exampleInputText1" class="form-label"><ion-icon name="finger-print-outline"></ion-icon> Usuario</label> 
				<input type="text" name="usuario" class="form-control" id="exampleInputText1">
			</div>
        </div>
    </div>
</div>

<div class="container-fluid">
    <div class="row" id="map_section">
        <div class="col-4">
        	<div class="mb-3">
				<label for="exampleInputPassword1" class="form-label"><ion-icon name="keypad-outline"></ion-icon> Password</label>
				<input type="password" name="password" class="form-control" id="exampleInputPassword1">
			</div>
        </div>
        <div class="col-2">
        	<button type="submit" value="Agregar" name="Agregar" class="btn btn-primary"><ion-icon name="checkmark-done-outline"></ion-icon> Agregar</button>
        </div>
        <div class="col-2">
        	<button type="submit" name="Listar" class="btn btn-secondary"><ion-icon name="document-text-outline"></ion-icon> Listar Usuarios</button>
        </div>
    </div>
</div>
	
</form>

<br/>
<br/>
<!-- <form method="get" action="./inicio">
	<table>
		<tr>
			<td><label><ion-icon name="id-card-outline"></ion-icon>Cedula:
			</td>
			<td><input type="text" name="cedula"></td>
		</tr>
		<tr>
			<td><label><ion-icon name="body-outline"></ion-icon>Nombre:</label></td>
			<td><input type="text" name="nombre"></td>
		</tr>
		<tr>
			<td><label><ion-icon name="at-outline"></ion-icon>Correo
					Electronico:</label></td>
			<td><input type="text" name="email"></td>
		</tr>
		<tr>
			<td><label><ion-icon name="finger-print-outline"></ion-icon>Usuario:</label></td>
			<td><input type="text" name="usuario"></td>
		</tr>
		<tr>
			<td><label><ion-icon name="keypad-outline"></ion-icon>Password:</label></td>
			<td><input type="text" name="password"></td>
		</tr>
		<tr>
			<td><input type="submit" value="Agregar" name="Agregar"></td>
		</tr>
		<tr>
			<td><button type="submit" name="Listar">
					<ion-icon name="document-text-outline"></ion-icon>
					Listar Usuarios
				</button></td>
		</tr>
	</table>
</form> -->
<%@include file="../Template/footer.jsp"%>