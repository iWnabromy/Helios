<%@ page pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html lang="fr">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Liste membres |</title>

<!-- Bootstrap core CSS -->

<link href="../css/bootstrap.min.css" rel="stylesheet">

<link href="../fonts/css/font-awesome.min.css" rel="stylesheet">
<link href="../css/animate.min.css" rel="stylesheet">

<!-- Custom styling plus plugins -->
<link href="../css/custom.css" rel="stylesheet">
<link href="../css/icheck/flat/green.css" rel="stylesheet">
<link href="../css/datatables/tools/css/dataTables.tableTools.css"
	rel="stylesheet">

<script src="../js/jquery.min.js"></script>

<!--[if lt IE 9]>
        <script src="../../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

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
									Liste des membres <small></small>
								</h2>
								<div class="clearfix"></div>
							</div>
							<div class="x_content">
								<div id="example_wrapper" class="dataTables_wrapper" role="grid">
									<div class="clear"></div>
									<div class="dataTables_filter" id="example_filter">
										<label>Recherche : <input type="text"
											aria-controls="example"></label>
									</div>
									<table id="example"
										class="table table-striped responsive-utilities jambo_table dataTable"
										aria-describedby="example_info">
										<thead>
											<tr class="headings" role="row">
												<th class="sorting" role="columnheader" tabindex="0"
													aria-controls="example" rowspan="1" colspan="1"
													aria-label="Nom : activate to sort column ascending"
													style="width: 104px;">Nom</th>
												<th class="sorting" role="columnheader" tabindex="0"
													aria-controls="example" rowspan="1" colspan="1"
													aria-label="Invoice Date : activate to sort column ascending"
													style="width: 104px;">Prénom</th>
												<th class="sorting" role="columnheader" tabindex="0"
													aria-controls="example" rowspan="1" colspan="1"
													aria-label="Order : activate to sort column ascending"
													style="width: 104px;">Job</th>
												<th class="sorting" role="columnheader" tabindex="0"
													aria-controls="example" rowspan="1" colspan="1"
													aria-label="Status : activate to sort column ascending"
													style="width: 69px;">Mail</th>
												<th class="sorting" role="columnheader" tabindex="0"
													aria-controls="example" rowspan="1" colspan="1"
													aria-label="Status : activate to sort column ascending"
													style="width: 69px;">Photo</th>
												<th class="no-link last sorting" role="columnheader"
													tabindex="0" aria-controls="example" rowspan="1"
													colspan="1"
													aria-label="Action
                                                : activate to sort column ascending"
													style="width: 71px;"><span class="nobr">Action</span>
												</th>
											</tr>
										</thead>



										<tbody role="alert" aria-live="polite" aria-relevant="all">
											<tr class="pointer odd">

												<c:forEach var="membres" items="${listeMembres}">
													<tr>
														<td class=" ">${membres.nom_Membre}</td>
														<td>${membres.prenom_Membre}</td>
														<td>${membres.job_Membre}</td>
														<td>${membres.mail_Membre}</td>
														<td>${membres.photo_Membre}</td>
														<td class=" last "><a
															href="membremodifier?id=${membres.id_Membre}"><span
																class="glyphicon glyphicon-pencil"> Modifier</span></a> <br>
															<form method="post" action="membre">
																<input type="hidden" id="id" name="id"
																	value="${membres.id_Membre}"> <span
																	class="glyphicon glyphicon-remove"></span> <input
																	style="font-style: normal; font-family: 'Glyphicons Halflings'; background: none; border: none;"
																	type="submit" value="Supprimer"
																	onclick="return confirm('Voulez-vous vraiment supprimer ${membres.prenom_Membre} ${membres.nom_Membre} ?')">
															</form></td>

													</tr>
												</c:forEach>
											</tr>
										</tbody>
									</table>
									<div class="dataTables_paginate paging_full_numbers"
										id="example_paginate">
										<a tabindex="0"
											class="first paginate_button paginate_button_disabled"
											id="example_first">Début</a><a tabindex="0"
											class="previous paginate_button paginate_button_disabled"
											id="example_previous">Précédent</a><a
											tabindex="0" class="paginate_active">1</a><a tabindex="0"
											class="paginate_button">2</a><a tabindex="0"
											class="paginate_button">3</a><a tabindex="0"
											class="next paginate_button" id="example_next">Suivant</a><a
											tabindex="0" class="last paginate_button" id="example_last">Fin</a>
									</div>
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

	<script src="../js/bootstrap.min.js"></script>

	<!-- chart js -->
	<script src="../js/chartjs/chart.min.js"></script>
	<!-- bootstrap progress js -->
	<script src="../js/progressbar/bootstrap-progressbar.min.js"></script>
	<script src="../js/nicescroll/jquery.nicescroll.min.js"></script>
	<!-- icheck -->
	<script src="../js/icheck/icheck.min.js"></script>

	<script src="../js/custom.js"></script>


	<!-- Datatables -->
	<script src="../js/datatables/js/jquery.dataTables.js"></script>
	<script src="../js/datatables/tools/js/dataTables.tableTools.js"></script>
	<script>
		$(document).ready(function() {
			$('input.tableflat').iCheck({
				checkboxClass : 'icheckbox_flat-green',
				radioClass : 'iradio_flat-green'
			});
		});

		var asInitVals = new Array();
		$(document)
				.ready(
						function() {
							var oTable = $('#example')
									.dataTable(
											{
												"oLanguage" : {
													"sSearch" : "Search all columns:"
												},
												"aoColumnDefs" : [ {
													'bSortable' : false,
													'aTargets' : [ 0 ]
												} //disables sorting for column one
												],
												'iDisplayLength' : 12,
												"sPaginationType" : "full_numbers",
												"dom" : 'T<"clear">lfrtip',
												"tableTools" : {
													"sSwfPath" : "<?php echo base_url('assets2/js/Datatables/tools/swf/copy_csv_xls_pdf.swf'); ?>"
												}
											});
							$("tfoot input").keyup(
									function() {
										/* Filter on the column based on the index of this element's parent <th> */
										oTable.fnFilter(this.value, $(
												"tfoot th").index(
												$(this).parent()));
									});
							$("tfoot input").each(function(i) {
								asInitVals[i] = this.value;
							});
							$("tfoot input").focus(function() {
								if (this.className == "search_init") {
									this.className = "";
									this.value = "";
								}
							});
							$("tfoot input")
									.blur(
											function(i) {
												if (this.value == "") {
													this.className = "search_init";
													this.value = asInitVals[$(
															"tfoot input")
															.index(this)];
												}
											});
						});
	</script>


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
</body>