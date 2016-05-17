<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="utf-8"%>

<!-- Navigation -->
<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<div class="container">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#bs-example-navbar-collapse-1" aria-expanded="true">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="accueil" style="padding-top: 6px;"> 
			<img src="img/logo/helios.jpg" alt="">
			</a>
		</div>
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1" style="margin-top: 20px;">
			<ul class="nav navbar-nav navbar-right"
				style="padding-bottom: 0px; border-top-width: 20px;">
				<li><a href="index">Accueil</a></li>
				<li><a href="blog">Blog</a></li>
				<li><a href="galerie">Galerie</a></li>
				<li><a href="evenements">Evénements</a></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown">Voitures <b class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a href="voiture">Les prototypes</a></li>
						<li><a href="helios1">Hélios I</a></li>
						<li><a href="helios2">Hélios II</a></li>
						<li><a href="helios3">Hélios III</a></li>
						<li><a href="helios4">Hélios IV</a></li>
						<li><a href="helios5">Hélios V</a></li>
					</ul></li>
				<li><a href="team">L'équipe</a></li>
				<li><a href="partenaires">Partenaires</a></li>
				<li><a href="contact">Contact</a></li>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.container -->
</nav>

<!-- Header Carousel -->
<header id="myCarousel" class="carousel slide">
	<!-- Indicators -->
	<ol class="carousel-indicators">
		<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
		<li data-target="#myCarousel" data-slide-to="1"></li>
	</ol>

	<!-- Wrapper for slides -->

	<div class="carousel-inner">
		<div class="item active">
			<div class="fill"
				style="background-image: url(http://helios-solarteam.rhcloud.com/static/accueil1.jpg;)"></div>
			<div class="carousel-caption">
				<h2></h2>
			</div>
		</div>
		<div class="item">
			<div class="fill"
				style="background-image: url(http://helios-solarteam.rhcloud.com/static/accueil2.jpg;)"></div>
			<div class="carousel-caption">
				<h2></h2>
			</div>
		</div>
	</div>

	<!-- Controls -->
	<a class="left carousel-control" href="#myCarousel" data-slide="prev">
		<span class="icon-prev"></span>
	</a> <a class="right carousel-control" href="#myCarousel" data-slide="next">
		<span class="icon-next"></span>
	</a>
</header>