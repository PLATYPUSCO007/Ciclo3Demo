<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
<title>Loguin</title>
<style type="text/css">

</style>
</head>
<body>
	<div class="card text-center">
		<img src="./img/tienda.jpg" style="height:250px" class="card-img-top" alt="tiendagenerica">
		<div class="card-header" style="text-align:center;">Loguin</div>
		<div class="card-body">
			<h5 class="card-title">Tienda Generica</h5>
			<form method="post" action="./DemoServlet">
			<div class="container">
				<div class="row">
				    <div class="col-sm-5">
				    	<div class="mb-3">
							<label for="exampleInputText1" class="form-label"><ion-icon name="finger-print-outline"></ion-icon> Usuario</label> 
						</div>
				    </div>
				    <div class="col-sm-5">
				    	<div class="mb-3">
							<input type="text" name="usuario" class="form-control" id="exampleInputText1">
						</div>
				    </div>
  				</div>
  				<div class="row">
				    <div class="col-sm-5">
				    	<div class="mb-3">
							<label for="exampleInputPassword1" class="form-label"><ion-icon name="keypad-outline"></ion-icon> Password</label>
						</div>
				    </div>
				    <div class="col-sm-5">
				    	<div class="mb-3">
							<input type="password" name="password" class="form-control" id="exampleInputPassword1">
						</div>
				    </div>
  				</div>
  				<div class="row">
				    <div class="col-sm-5">
				    	<div class="mb-3">
							
						</div>
				    </div>
				    <div class="col-sm-5">
				    	<div class="mb-3">
							<button type="submit" value="Agregar" name="Ingresar" class="btn btn-primary"><ion-icon name="checkmark-done-outline"></ion-icon> Ingresar</button>
						</div>
				    </div>
  				</div>
			</div>
			</form>
		</div>
	</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
<script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
<script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
</body>
</html>