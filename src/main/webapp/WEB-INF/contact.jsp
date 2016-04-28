<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Contact</title>

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
				<h1 class="page-header">
					Contact <small></small>
				</h1>
			</div>
		</div>
		<!-- /.row -->

		<!-- Content Row -->
		<div class="row">
			<!-- Map Column -->
			<div class="col-md-8">
				<!-- Embedded Google Map -->
				<iframe
					src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5230465.975113893!2d-0.8001054831620583!3d50.19968114979603!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x47c2d5795af8fd31%3A0x6932e8ba296a5afc!2s13+Rue+de+Toul%2C+59000+Lille!5e0!3m2!1sen!2sfr!4v1455793162607"
					width="600" height="450" frameborder="0" style="border: 0"
					allowfullscreen></iframe>
			</div>
			<!-- Contact Details Column -->
			<div class="col-md-4">
				<h3>Détails</h3>
				<p>
					13 rue de Toul<br>Lille, 59000<br>
				</p>
				<p>
					<i class="fa fa-phone"></i> <abbr title="Phone">Tél.</abbr>:
					0327272727
				</p>
				<p>
					<i class="fa fa-envelope-o"></i> <abbr title="Email">Mail</abbr>: <a
						href="mailto:name@example.com">name@example.com</a>
				</p>
				<p>
					<i class="fa fa-clock-o"></i> <abbr title="Hours">H</abbr>: Monday
					- Friday: 9:00 AM to 5:00 PM
				</p>
				<ul class="list-inline" style="text-align: center;">
					<li><a style="color: #3b5998;" href="#"><i
							class="fa fa-2x fa-facebook-square"></i></a></li>
					<li><a style="color: #0976b4;" href="#"><i
							class="fa fa-2x fa-linkedin-square"></i></a></li>
					<li><a style="color: #55acee;" href="#"><i
							class="fa fa-2x fa-twitter-square"></i></a></li>
					<li><a style="color: #3f729b;" href="#"><i
							class="fa fa-2x fa-instagram"></i></a></li>
					<li><a style="color: #e52d27;" href="#"><i
							class="fa fa-2x fa-youtube-play"></i></a></li>
					<li><a href="#"><i class="fa fa-2x fa-envelope"></i></a></li>
				</ul>
			</div>
		</div>
		<!-- /.row -->

		<!-- Contact Form -->
		<!-- In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
		<div class="row">
			<div class="col-md-8">
				<h3>Envoyez nous un message</h3>
				<form name="sentMessage" id="contactForm" novalidate>
					<div class="control-group form-group">
						<div class="controls">
							<label>Nom:</label> <input type="text" class="form-control"
								id="name" required
								data-validation-required-message="Veuillez entrer votre nom">
							<p class="help-block"></p>
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Numéro de téléphone</label> <input type="tel"
								class="form-control" id="phone" required
								data-validation-required-message="Veuillez entrer votre numéro de téléphone">
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Adresse mail</label> <input type="email"
								class="form-control" id="email" required
								data-validation-required-message="Veuillez entrer votre adresse mail.">
						</div>
					</div>
					<div class="control-group form-group">
						<div class="controls">
							<label>Message:</label>
							<textarea rows="10" cols="100" class="form-control" id="message"
								required
								data-validation-required-message="Veuillez entrer votre message"
								maxlength="999" style="resize: none"></textarea>
						</div>
					</div>
					<div id="success"></div>
					<!-- For success/fail messages -->
					<button type="submit" class="btn btn-primary" href="mailto:romain.bondois@hei.fr">Envoyer</button>
				</form>
			</div>

		</div>
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

	<!-- Contact Form JavaScript -->
	<!-- Do not edit these files! In order to set the email address and subject line for the contact form go to the bin/contact_me.php file. -->
	<script src="js/jqBootstrapValidation.js"></script>
	<script src="js/contact_me.js"></script>

</body>

</html>
