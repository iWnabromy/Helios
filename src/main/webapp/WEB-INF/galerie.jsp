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

<title>Galerie</title>

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
					Galerie <small></small>
				</h1>
			</div>
		</div>

		<!-- Service Panels -->
		<!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->

		<!-- Service Tabs -->
		<div class="row">
			<div class="col-lg-12" id="containerPhoto">

				<ul id="myTab" class="nav nav-tabs nav-justified">
					<li class="active"><a href="#photos" data-toggle="tab"><i
							class="fa fa-tree"></i> Photos</a></li>
					<li class=""><a href="#videos" data-toggle="tab"><i
							class="fa fa-car"></i> Vidéos</a></li>
				</ul>

				<div id="myTabContent" class="tab-content">
					<div class="tab-pane fade active in" id="photos">
						<div class="row" id="rowPhoto">
						</div>
					</div>
					<div class="tab-pane fade" id="videos">
						<div class="row" id="rowVideo">
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- Service List -->
		<!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->

		<hr>

		<!-- Footer -->
		<c:import url="footer.jsp">
		</c:import>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>
	<script type="text/javascript" src="js/galerieJS.js"></script>
	<script src="js/lightbox.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>
</body>

</html>
