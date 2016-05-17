var getArticleAccueil = function(){
	var requeteGetArticleAccueil = new XMLHttpRequest();
	requeteGetArticleAccueil.open("GET", "articlesAJAX");
	requeteGetArticleAccueil.responseType = "json";
	requeteGetArticleAccueil.onload = function(){
		var a = this.response.length;
		for(var i=0; i<6; i++){
			var lienPage = "article?id="+this.response[i].id_Article;
			var lienImg = this.response[i].photoPresentation_Article;
			var divArticle = document.createElement('div');
			var divHover = document.createElement('div');
			var imgArticle = document.createElement('img');
			var divOverlay = document.createElement('div');
			var h2 = document.createElement('h2');
			var p = document.createElement('p');
			var aArticle = document.createElement('a');
			
			aArticle.innerHTML= "Voir l'article";
			aArticle.setAttribute("href", lienPage);
			aArticle.setAttribute("title", this.response[i].titre_Article);
			divArticle.setAttribute("class", "col-md-4 col-sm-6");
			divHover.setAttribute("class", "hovereffect");
			imgArticle.setAttribute("src", lienImg);
			imgArticle.setAttribute("class", "img-responsive");
			imgArticle.setAttribute("title", this.response[i].titre_Article);
			imgArticle.setAttribute("alt", "");
			divOverlay.setAttribute("class", "overlay");
			h2.textContent = this.response[i].titre_Article;
			
			divHover.appendChild(imgArticle);
			divOverlay.appendChild(h2);
			p.appendChild(aArticle);
			divOverlay.appendChild(p);
			divHover.appendChild(divOverlay);
			divArticle.appendChild(divHover);
			var id = "articleAccueil";
			document.getElementById(id).appendChild(divArticle);
		}
		
	}
	requeteGetArticleAccueil.send();
};

window.onload = function() {
	getArticleAccueil();
	
}