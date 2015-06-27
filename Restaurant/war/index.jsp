<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Aries</title>
    <link rel="stylesheet" href="css/home.css">
    <link rel="stylesheet" href="css/style.css">
    <link rel="Stylesheet" href="css/slider.css">
	<script type="text/javascript" src="/js/home.js"></script>
	<script type="text/javascript"src="//code.jquery.com/jquery-1.11.3.min.js"></script>
	<link href='http://fonts.googleapis.com/css?family=Roboto:400,300,700' rel='stylesheet' type='text/css'>

  </head>
		  <div id="fb-root"></div>
		<script type="text/javascript">(function(d, s, id) {
		  var js, fjs = d.getElementsByTagName(s)[0];
		  if (d.getElementById(id)) return;
		  js = d.createElement(s); js.id = id;
		  js.src = "//connect.facebook.net/es_LA/sdk.js#xfbml=1&version=v2.3";
		  fjs.parentNode.insertBefore(js, fjs);
		}(document, 'script', 'facebook-jssdk'));</script>
	

  <body>
	<header >
		<div class="contenedor">
			<div class="logo">
			<img src="/css/logo.png" id="logo" alt="" >		
			</div>	
			<nav class="menu">
				<ul>
					<li><a href="index.jsp"><span class="sp"><i class="icon icon-home"></i></span>INICIO</a>
						<ul>
							<li><a href="ubicacion.jsp">Ubicacion</a></li>
							<li><a href="contactenos.jsp">Contactenos</a></li>
							<li><a href="">Reseña</a></li>
						</ul>
						
					</li>
					<li><a href=""><span class="sp"><i class="icon icon-spoon-knife"></i></span>MENUS</a>
						<ul>
							<li><a href="entradas.jsp">Entradas</a></li>
							<li><a href="sopa.jsp">Sopas</a></li>
							<li><a href="">Ensaladas</a></li>
							<li><a href="platosfondo.jsp">Platos de fondo</a></li>
							<li><a href="">Extras</a></li>
						</ul>
					</li>
					<li><a href=""><span class="sp"><i class="icon icon-glass"></i></span>BEBIDAS</a>
						<ul>
							<li><a href="">bebidas con alcohol</a></li>
							<li><a href="bebidasgas.jsp">bebidas gasificadas</a></li>
							<li><a href="">otros</a></li>
						</ul>
					</li>
					<li><a href=""><span class="sp"><i class="icon icon-earth"></i></span>EVENTOS Y RESERVAS</a>
						<ul>
							<li><a href="">Eventos </a></li>
							<li><a href="Sesion.jsp">Reservas</a></li>
							<li><a href="">fhg</a></li>
						</ul>
					</li>
					<li><a href="login.jsp"><span class="sp"><i class="icon icon-user-tie"></i></span>LOGIN </a>
						
					</li>
					<li>
					<form method="post" Action="mailto:tuemailaqui" name=GRANAKULUS >
							 <input type="text" placeholder="buscador" size=20 maxlength=8 >
							 <input type="Submit" value="buscar"> 
							</form>
													
					</li>
				</ul>
			</nav>	
			
		</div>	
	</header>
	<div class="main">
		<div class="slides">
			<img src="css/img/p1.jpg" alt="">
			<img src="css/img/Pisco-Sour.jpg" alt="">
			<img src="css/img/rocoto-relleno.jpg" alt="">
			<img src="css/img/baile.jpg" alt="">
			<img src="css/img/cusqueña.jpg" alt="">
		</div>
	</div>
	<script type = "text/javascript" src="http://code.jquery.com/jquery-1.9.1.min.js"></script>
	<script type = "text/javascript" src="js/jquery.slides.js"></script>
	<script type = "text/javascript" >
	$(function(){
		  $(".slides").slidesjs({
		    play: {
		      active: true,
		        // [boolean] Generate the play and stop buttons.
		        // You cannot use your own buttons. Sorry.
		      effect: "slide",
		        // [string] Can be either "slide" or "fade".
		      interval: 3000,
		        // [number] Time spent on each slide in milliseconds.
		      auto: true,
		        // [boolean] Start playing the slideshow on load.
		      swap: true,
		        // [boolean] show/hide stop and play buttons
		      pauseOnHover: false,
		        // [boolean] pause a playing slideshow on hover
		      restartDelay: 2500
		        // [number] restart delay on inactive slideshow
		    }
		  });
		});
		 
	</script>
	<section id="cero">
		<section id="uno">
			<nav id="dos">
				<h2 align="center">Bienvenidos a "<strong> DELITZO</strong> "</h2>
				<h3>Tenemos ambiente agradable para usted ,
				que son nuestra prioridad </h3>
				<h3>Les ofrecemos todo tipo de comida desde : <br>
				1.Menus Economicos .<br>
				2.Menus Ejecutivos.<br>
				3.Postres .<br>
				4.Ensalasdas.<br>
				5.bebidas en general:</h3><br>
			<div class="fb-like" data-href="https://www.facebook.com/Rusticaaqp" data-width="150" data-layout="box_count" data-action="recommend" data-show-faces="true" data-share="true"></div>
			
			</nav>
			<nav id="tres">
				<h2>¿Quienes Somos?</h2><br>
				<p>Delitzo es una picantería donde encontrará lo más puro y natural en platos de la cocina arequipeña.
					<br>de todo el mundo visitan Arequipa y no dudan en probar algún potaje de nuestra carta, preparado como antaño y a leña,  al momento que nos lo pidan. Nos especializamos en la elaboración del cuy chactado, rocoto relleno, el costillar a la piedra, los picantes y camarones.
					<br>Ambientes amplios con decoración tradicional, ofrece una carta completa con comida tradicional de Arequipa y variedad de licores, tiene un servicio personalizado con vestimenta de la zona; el sabor de la comida es buena y aceptan pagos en efectivo y tarjetas de credito.>
				</p>
			</nav>
		</section>
	</section>
	<div class="social">
		<ul>
			<li><a href="" target="_blank" class="icon-facebook "></a></li>
			<li><a href="" target="_blank" class="icon-twitter "></a></li>
			<li><a href="" target="_blank" class="icon-instagram "></a></li>
			<li><a href="" target="_blank" class="icon-google-plus "></a></li>
			<li><a href="mailto:el.manolito2013.jlb@gmail.com"  class="icon-mail2"></a></li>
		</ul>
	</div>
	<footer>
		Derechos reservados juanma @copy
	</footer>
  </body>
</html>
