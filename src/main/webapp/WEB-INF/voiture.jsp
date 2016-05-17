<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="fr">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Voiture</title>

<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="css/modern-business.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">

<link href="css/lightbox.css" rel="stylesheet">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<!-- Header et Menu de navigation -->
	<c:import url="header1.jsp">
	</c:import>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">
					Les prototypes Hélios depuis 1992 : <small></small>
				</h1>
			</div>
		</div>
		
		<div class="row evenement">
			<div class="col-md-7">
				<a href="helios1"> <img class="img-responsive img-hover"
					src="http://helios-solarteam.rhcloud.com/static/helios1_Presentation.jpg"
					alt="Hélios I">
				</a>
			</div>
			<div class="col-md-5">
				<h3>HELIOS I</h3>
				<h4>Vitesse maximale : 115 km/h</h4>
				<h4>Vitesse moyenne : 42 km/h</h4>
				<h4>Châssis : Treillis soudé Alu</h4>
				<h4>Batteries : Nickel-Cadmium</h4>
				<h4>Rendement des cellules 14%</h4>
				<a class="btn btn-primary"
					href="helios1"><i>Voir
						plus</i></a>
			</div>
		</div>
		<hr>
		<div class="row evenement">
			<div class="col-md-7">
				<a href="helios2"> <img class="img-responsive img-hover"
					src="http://helios-solarteam.rhcloud.com/static/helios2_Presentation.jpg"
					alt="Hélios II">
				</a>
			</div>
			<div class="col-md-5">
				<h3>HELIOS II</h3>
				<h4>Vitesse maximale : 90 km/h</h4>
				<h4>Vitesse moyenne : 45 km/h</h4>
				<h4>Châssis : Carbone-Nomex</h4>
				<h4>Batteries : Argent-Zinc</h4>
				<h4>Rendement des cellules 17%</h4>
				<h4>Classement : 12èmes au WSC 1999</h4>
				<a class="btn btn-primary"
					href="helios2"><i>Voir
						plus</i></a>
			</div>
		</div>
		<hr>
		<div class="row evenement">
			<div class="col-md-7">
				<a href="helios3"> <img class="img-responsive img-hover"
					src="http://helios-solarteam.rhcloud.com/static/helios3_Presentation.jpg"
					alt="Hélios III">
				</a>
			</div>
			<div class="col-md-5">
				<h3>HELIOS III</h3>
				<h4>Vitesse maximale : 90 km/h</h4>
				<h4>Vitesse moyenne : 50 km/h</h4>
				<h4>Châssis : Carbone-Nomex</h4>
				<h4>Batteries : Lithium-Polymère</h4>
				<h4>Rendement des cellules 17%</h4>
				<a class="btn btn-primary"
					href="helios3"><i>Voir
						plus</i></a>
			</div>
		</div>
		<hr>
		<div class="row evenement">
			<div class="col-md-7">
				<a href="helios4"> <img class="img-responsive img-hover"
					src="http://helios-solarteam.rhcloud.com/static/Helios4Voiture.png"
					alt="Hélios IV">
				</a>
			</div>
			<div class="col-md-5">
				<h3>HELIOS IV</h3>
				<h4>Vitesse maximale : 105 km/h</h4>
				<h4>Vitesse moyenne : 58 km/h</h4>
				<h4>Châssis : Carbone Tubulaire</h4>
				<h4>Batteries : Lithium-Polymère</h4>
				<h4>Rendement des cellules 21.5%</h4>
				<h4>Classement : 18èmes au WSC 2007</h4>
				<a class="btn btn-primary"
					href="helios4"><i>Voir
						plus</i></a>
			</div>
		</div>
		<hr>
		<div class="row evenement">
			<div class="col-md-7">
				<a href="helios5"> <img class="img-responsive img-hover"
					src="http://helios-solarteam.rhcloud.com/static/Helios5Voiture.png"
					alt="Hélios V">
				</a>
			</div>
			<div class="col-md-5">
				<h3>HELIOS V</h3>
				<p>Sa conception est déjà entièrement achevée, l'année 2015-2016
				sera réservée à la fabrication du nouveau véhicule solaire Hélios V.</p>
				<a class="btn btn-primary"
					href="helios5"><i>Voir
						plus</i></a>
			</div>
		</div>
		<hr>
		<!-- Footer -->
		<c:import url="footer.jsp">
		</c:import>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>
	<script src="js/lightbox.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>

</html>
