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

<title>Article</title>

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
				<h1 class="page-header">${article.titre_Article}</h1>
				<ol class="breadcrumb">
					<li><a href="index">Accueil</a></li>
					<li><a href="blog">Blog</a></li>
					<li class="active">${article.titre_Article}</li>
				</ol>
			</div>
		</div>
		<!-- /.row -->

		<!-- Content Row -->
		<div class="row">

			<!-- Blog Post Content Column -->
			<div class="col-lg-8">

				<!-- Blog Post -->

				<hr>

				<!-- Date/Time -->
				<p>
					<i class="fa fa-clock-o"></i> Publié le ${article.date_Article}
				</p>

				<hr>

				<!-- Preview Image -->
				<img class="img-responsive" src="img/${article.photoPresentation_Article}"
					alt="">

				<hr>

				<!-- Post Content -->
				<p class="lead">${article.textePresentation_Article}</p>
				<p>${article.texte_Article}</p>

				<hr>
			</div>


		</div>
		
		<ul class="pager" id="passagePage">
            <li class="previous" id="recent">
                <a href="#">&larr; Articles plus récents</a>
            </li>
            <li class="next" id="ancien">
                <a href="#">Articles plus anciens &rarr;</a>
            </li>
        </ul>


		<!-- /.row -->

		<hr>

		<!-- Footer -->
		<c:import url="footer.jsp">
		</c:import>


	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="js/bootstrap.min.js"></script>

</body>