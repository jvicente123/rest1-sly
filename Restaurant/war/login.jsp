<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Aries</title>
    <link rel="stylesheet" href="css/registro.css">
    <link rel="stylesheet" href="css/style.css">
    <script src="http://code.jquery.com/jquery-latest.js"></script>
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
	<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="/js/home.js"></script>


  </head>

  <body>
	<header>
		<div class="contenedor">
			<div class="logo">
			<img src="/css/logo.png" alt="" id="logo">		
			</div>	
			<nav class="menu">
				<ul>
					<li><a href="index.jsp"><spam class=" "><i class="icon icon-home"></i></spam>INICIO</a>
						<ul>
							<li><a href="ubicacion.jsp">Ubicacion</a></li>
							<li><a href="contactenos.jsp">Contactenos</a></li>
							<li><a href="">Reseña</a></li>
						</ul>
						
					</li>
					<li><a href=""><spam class=" "><i class="icon icon-spoon-knife"></i></spam>MENUS</a>
						<ul>
							<li><a href="entradas.jsp">Entradas</a></li>
							<li><a href="sopa.jsp">Sopas</a></li>
							<li><a href="">Ensaladas</a></li>
							<li><a href="platosfondo.jsp">Platos de fondos</a></li>
							<li><a href="">Extra</a></li>
						</ul>
					</li>
					<li><a href=""><spam class=" "><i class="icon icon-glass"></i></spam>BEBIDAS</a>
						<ul>
							<li><a href="">bebidas con alcohol</a></li>
							<li><a href="bebidasgas.jsp">bebidas gasificadas</a></li>
							<li><a href="">otros</a></li>
						</ul>
					</li>
					<li><a href=""><spam class=" "><i class="icon icon-earth"></i></spam>EVENTOS Y RESERVAS</a>
						<ul>
							<li><a href="">Eventos </a></li>
							<li><a href="Sesion.jsp">Reservas</a>L</li>
							<li><a href="">sefsdf</a></li>
						</ul>
					</li>
					<li><a href="login.jsp"><spam class=" "><i class="icon icon-user-tie"></i></spam>LOGIN </a>
						
					</li>
					<li>
					<form method="post" Action="mailto:tuemailaqui" name=GRANAKULUS>
							 <input size=30 maxlength=245>
							 <input type="Submit" value="buscar"> 
							</form>
													
					</li>
				</ul>
			</nav>	
			
		</div>	
	</header>
	<div id="registro">
		<h1>LOGIN</h1><br>
		<form method="post" action="/iniciarSesion">
Usuario:
<input type="text" name="user" PATTERN="^[a-z]{5}" required> <br>
Contraseña 
<input type="password" name="pass" PATTERN="[a-z]{5}"required> <br>
<input type="submit" value="Ingresar">
<a href="registro.jsp">Registro</a>

</form>
	</div>
	<div class="social">
		<ul>
			<li><a href="" target="_blank" class="icon-facebook "></a></li>
			<li><a href="" target="_blank" class="icon-twitter "></a></li>
			<li><a href="" target="_blank" class="icon-instagram "></a></li>
			<li><a href="" target="_blank" class="icon-google-plus "></a></li>
			<li><a href="mailto:el.manolito2013.jlb@gmail.com"  class="icon-mail2"></a></li>
		</ul>
	
	</div>
	<footer id="pie">
		Derechos reservados juanma @copy
	</footer>

  </body>
</html>
