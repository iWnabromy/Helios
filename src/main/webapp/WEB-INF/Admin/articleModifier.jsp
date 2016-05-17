<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="fr">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Ajouter article |</title>

<link href="../css/bootstrap.min.css" rel="stylesheet">

<link href="../fonts/css/font-awesome.min.css" rel="stylesheet">
<link href="../css/animate.min.css" rel="stylesheet">

<link href="../css/custom.css" rel="stylesheet">
<link href="../css/icheck/flat/green.css" rel="stylesheet">
<!-- editor -->
<link href="../css/editor/external/google-code-prettify/prettify.css"
	rel="stylesheet">
<link href="../css/editor/index.css" rel="stylesheet">
<!-- select2 -->
<link href="../css/select/select2.min.css" rel="stylesheet">
<!-- switchery -->
<link rel="stylesheet" href="../css/switchery/switchery.min.css">

<script src="../js/jquery.min.js" type="text/javascript"></script>
<style type="text/css"></style>

<!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
<head>
    <link rel="stylesheet" href="../css/jquery.cleditor.css" />
</head>
<body class="nav-md">
	<div class="container body">

		<!-- Header et Menu de navigation -->
		<c:import url="menu.jsp">
		</c:import>

		<!-- page content -->
		<div class="right_col" role="main">
			<div class="">
				<div class="clearfix"></div>
				<div class="row">
					<div class="col-md-12 col-sm-12 col-xs-12">
						<div class="x_panel">
							<div class="x_title">
								<h2>
									Modifier un article <small></small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div id="example_wrapper" class="dataTables_wrapper" role="grid">

									<div class="clear"></div>
									<form role="form" method="post" action="articlemodifier">
										<input type="hidden" id="id" name="id" value="${article.id_Article}">
										<div class="form-group">
											<label for="email">Titre :</label> <input type="text"
												class="form-control" name="titre" id="titre" value="${article.titre_Article}">
										</div>
										<div class="form-group">
											<label>Photo présentation :</label> <input type="text"
												class="form-control" id="photoPresentation"
												name="photoPresentation" value="${article.photoPresentation_Article}">
										</div>
										<div class="form-group">
											<label>Texte présentation :</label>
											<textarea name="textePresentation" id="textePresentation"
												name="textePresentation" class="form-control" rows="10" cols="250">${article.textePresentation_Article}</textarea>
										</div>
										<div class="form-group">
											<label>Photo principale :</label> <input type="text"
												class="form-control" id="photo" name="photo" value="${article.photo_Article}">
										</div>
										<div class="form-group">
											<label for="Description">Texte article :</label>
											<textarea id="input" name="input" class="form-control">${article.texte_Article}</textarea>
										</div>
										<br>
										<div class="form-group">
											<label>Date : </label>
											<input type="date" name="date" id="date" value="${article.date_Article}">
										</div>
										<br>
										<div class="form-group">
											<label>Catégorie :</label> <input type="text" name="categorie"
												id="categorie" class="form-control" value="${article.categorie_Article}">
										</div>
										<br>
										<button type="submit" class="btn btn-default">Enregistrer</button>
									</form>
								</div>
							</div>
						</div>
					</div>

					<br> <br> <br>

				</div>
			</div>
			<!-- footer content -->
			<!-- /footer content -->

		</div>
		<!-- /page content -->
	</div>


	<div id="custom_notifications" class="custom-notifications dsp_none">
		<ul class="list-unstyled notifications clearfix"
			data-tabbed_notifications="notif-group">
		</ul>
		<div class="clearfix"></div>
		<div id="notif-group" class="tabbed_notifications"></div>
	</div>

	<script src="../js/bootstrap.min.js" type="text/javascript"></script>

	<!-- bootstrap progress js -->
	<script src="../js/progressbar/bootstrap-progressbar.min.js"
		type="text/javascript"></script>

	<!-- icheck -->
	<script src="../js/icheck/icheck.min.js" type="text/javascript"></script>
	<!-- tags -->
	<script src="../js/tags/jquery.tagsinput.min.js" type="text/javascript"></script>
	<!-- switchery -->
	<script src="../js/switchery/switchery.min.js" type="text/javascript"></script>
	<!-- daterangepicker -->
	<script type="text/javascript" src="../js/moment/moment.min.js"></script>
	<script type="text/javascript"
		src="../js/datepicker/daterangepicker.js"></script>
	<!-- richtext editor -->
	<script src="../js/editor/bootstrap-wysiwyg.js" type="text/javascript"></script>
	<script src="../js/editor/external/jquery.hotkeys.js"
		type="text/javascript"></script>
	<script src="../js/editor/external/google-code-prettify/prettify.js"
		type="text/javascript"></script>
	<!-- select2 -->
	<script src="../js/select/select2.full.js" type="text/javascript"></script>
	<!-- form validation -->
	<script type="text/javascript" src="../js/parsley/parsley.min.js"></script>
	<!-- textarea resize -->
	<script src="../js/textarea/autosize.min.js" type="text/javascript"></script>
	<script type="text/javascript">
		autosize($('.resizable_textarea'));
	</script>
	<!-- Autocomplete -->
	<script type="text/javascript" src="../js/autocomplete/countries.js"></script>
	<script src="../js/autocomplete/jquery.autocomplete.js"
		type="text/javascript"></script>
	<!-- pace -->
	<script src="../js/pace/pace.min.js" type="text/javascript"></script>

	<script src="../js/custom.js" type="text/javascript"></script>


	<div id="ascrail2000" class="nicescroll-rails"
		style="width: 5px; z-index: auto; cursor: -webkit-grab; position: absolute; top: 0px; left: 225px; height: 620px; opacity: 0; display: none;">
		<div
			style="position: relative; top: 0px; float: right; width: 5px; height: 20px; border: 0px solid rgb(255, 255, 255); border-radius: 5px; background-color: rgba(42, 63, 84, 0.34902); background-clip: padding-box;"></div>
	</div>
	<div id="ascrail2000-hr" class="nicescroll-rails"
		style="height: 5px; z-index: auto; top: 615px; left: 0px; position: absolute; opacity: 0; display: none;">
		<div
			style="position: relative; top: 0px; height: 5px; width: 0px; border: 0px solid rgb(255, 255, 255); border-radius: 5px; left: 0px; background-color: rgba(42, 63, 84, 0.34902); background-clip: padding-box;"></div>
	</div>
	<script src="../js/jquery.min.js"></script>
    <script src="../js/jquery.cleditor.min.js"></script>
    <script>
        $(document).ready(function () { $("#input").cleditor(); });
    </script>
</body>
</html>