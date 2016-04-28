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

    <title>Blog</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

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
                <h1 class="page-header">Blog
                    <small></small>
                </h1>
            </div>
        </div>
        <!-- /.row -->

        <div class="row">

            <!-- Blog Entries Column -->
            <div class="col-md-8" id="articleBlog">
            <c:forEach items="${article}" var="article">
            	<h2 class="blog1">
                    <a href="article?id=${article.id_Article}">${article.titre_Article }</a>
                </h2>
                <p class="blog1"><i class="fa fa-clock-o"></i> Posté le ${article.date_Article}</p>
                <hr class="blog1">
                <a href="article?id=${article.id_Article}" class="blog1">
                    <img class="img-responsive img-hover" src="img/${article.photoPresentation_Article}" alt="">
                </a>
                <hr class="blog1">
                <p class="blog1">${article.textePresentation_Article}</p>
                <a class="btn btn-primary" href="article?id=${article.id_Article}">Article complet <i class="fa fa-angle-right"></i></a>

                <hr class="blog1">
			</c:forEach>
                <!-- Pager -->
                <div class="row text-center" id="passagePage">
			<div class="col-lg-12">
				<ul class="pagination">
					<li><a href="" id="avant">&laquo;</a></li>
					<li class="active" id="page0"><a href="#1">1</a></li>
					<li id="page5"><a href="#2">2</a></li>
					<li id="page10"><a href="#3">3</a></li>
					<li id="page15"><a href="#4">4</a></li>
					<li id="page20"><a href="#5">5</a></li>
					<li id="apres"><a href="">&raquo;</a></li>
				</ul>
			</div>
		</div>

            </div>

            <!-- Blog Sidebar Widgets Column -->
            <div class="col-md-4">

                <!-- Blog Search Well -->
                <div class="well">
                    <h4>Rechercher</h4>
                    <div class="input-group">
                        <input type="text" class="form-control" id="champRecherche">
                        <span class="input-group-btn">
                            <button class="btn btn-default" type="button" id="boutonRecherche"><i class="fa fa-search"></i></button>
                        </span>
                    </div>
                    <!-- /.input-group -->
                </div>

                <!-- Blog Categories Well -->
                <div class="well">
                    <h4>Catégories</h4>
                    <div class="row" id="rowCategorie">
                        <!-- /.col-lg-6 -->
                    </div>
                    <!-- /.row -->
                </div>

                <!-- Side Widget Well 
                <div class="well">
                    <h4>Side Widget Well</h4>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Inventore, perspiciatis adipisci accusamus laudantium odit aliquam repellat tempore quos aspernatur vero.</p>
                </div>-->

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
    <script type="text/javascript" src="js/blogsJS.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

</body>

</html>
