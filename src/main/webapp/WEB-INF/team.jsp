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

<title>Team</title>

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
	<c:import url="header1.jsp">
	</c:import>

	<!-- Page Content -->
	<div class="container">

		<!-- Page Heading/Breadcrumbs -->
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header">A propos de l'équipe</h1>
			</div>
		</div>
		<!-- /.row -->

		<!-- Intro Content -->
		<div class="row">
			<div class="col-md-6">
				<img class="img-responsive" src="img/heliosteam.jpg" alt="">
			</div>
			<div class="col-md-6">
				<h2>Hélios Solar Car Team</h2>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Sed
					voluptate nihil eum consectetur similique? Consectetur, quod,
					incidunt, harum nisi dolores delectus reprehenderit voluptatem
					perferendis dicta dolorem non blanditiis ex fugiat.</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit.
					Saepe, magni, aperiam vitae illum voluptatum aut sequi impedit non
					velit ab ea pariatur sint quidem corporis eveniet. Odit, temporibus
					reprehenderit dolorum!</p>
				<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Et,
					consequuntur, modi mollitia corporis ipsa voluptate corrupti eum
					ratione ex ea praesentium quibusdam? Aut, in eum facere corrupti
					necessitatibus perspiciatis quis?</p>
			</div>
		</div>
		<!-- /.row -->

		<!-- Team Members -->
		<div class="row" id="divMembre">
			<div class="col-lg-12">
				<h2 class="page-header">Nos membres</h2>
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
	<script type="text/javascript" src="js/membreJS.js" charset="utf-8"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>

</html>
