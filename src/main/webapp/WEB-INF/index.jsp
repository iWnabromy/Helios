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
<title>Accueil Hélios</title>
<link href="css/hover.css" rel="stylesheet" type="text/css">
<!-- Bootstrap Core CSS -->
<link href="css/bootstrap.min.css" rel="stylesheet">
<!-- Custom CSS -->
<link href="css/modern-business.css" rel="stylesheet">
<!-- Custom Fonts -->
<link href="font-awesome/css/font-awesome.min.css" rel="stylesheet"
	type="text/css">
<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<!-- Header et Menu de navigation -->
	<c:import url="header.jsp">
	</c:import>
	<!-- Page Content -->
	<div class="container">
		<!-- Marketing Icons Section -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">Conduire plus, consommer moins</h1>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Itaque, optio corporis quae nulla aspernatur in alias at numquam
					rerum ea excepturi expedita tenetur assumenda voluptatibus eveniet
					incidunt dicta nostrum quod? Nos voitures</p>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							 Nos Voitures
						</h4>
					</div>
					<div class="panel-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Itaque, optio corporis quae nulla aspernatur in alias at numquam
							rerum ea excepturi expedita tenetur assumenda voluptatibus
							eveniet incidunt dicta nostrum quod?</p>
						<a href="/helios/voiture" class="btn btn-default">Voir</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							L'équipe
						</h4>
					</div>
					<div class="panel-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Itaque, optio corporis quae nulla aspernatur in alias at numquam
							rerum ea excepturi expedita tenetur assumenda voluptatibus
							eveniet incidunt dicta nostrum quod?</p>
						<a href="/helios/team" class="btn btn-default">Voir</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="panel panel-default">
					<div class="panel-heading">
						<h4>
							Partenaires
						</h4>
					</div>
					<div class="panel-body">
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
							Itaque, optio corporis quae nulla aspernatur in alias at numquam
							rerum ea excepturi expedita tenetur assumenda voluptatibus
							eveniet incidunt dicta nostrum quod?</p>
						<a href="/helios/partenaires" class="btn btn-default">Voir</a>
					</div>
				</div>
			</div>
		</div>
		<!-- /.row -->
		<!-- Portfolio Section -->
		<div class="row" id="articleAccueil">
			<div class="col-lg-12">
				<h2 class="page-header">Dernières nouveautés</h2>
			</div>
			
		</div>
		<!-- /.row -->
		<hr>
		<!-- footer -->
		<c:import url="footer.jsp">
		</c:import>
	</div>
	<!-- /.container -->
	<!-- jQuery -->
	<script src="js/jquery.js"></script>
	<script type="text/javascript" src="js/accueilJS.js"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Script to Activate the Carousel -->
	<script>
		$('.carousel').carousel({
			interval : 5000
		//changes the speed
		})
	</script>
</body>
</html>