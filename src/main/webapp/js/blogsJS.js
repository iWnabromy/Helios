var getCategorie = function(){
	var requeteCategorie = new XMLHttpRequest();
	requeteCategorie.open("GET", "ws/article/categorie");
	requeteCategorie.responseType = "json";
	requeteCategorie.onload = function(){
		var a = this.response.length;
		var b = a % 4;
		var c = 0;
		var d = 0;
		if(a >= 4){
			var c = (a - b) / 4;
		}
		if(c != 0){
			for(var j=0;j<c;j++){
				var divCategorie = document.createElement('div');
				divCategorie.setAttribute("class", "col-lg-6");
				
				var ulCategorie = document.createElement('ul');
				ulCategorie.setAttribute("class", "list-unstyled");
				
				for(var i=d; i<4; i++){
					var lienPage = "categorie?categorie="+this.response[i].categorie_Article;
					
					var liCategorie = document.createElement('li');
					var aCategorie = document.createElement('a');
					aCategorie.setAttribute("href", lienPage);
					aCategorie.textContent = this.response[i].categorie_Article;
					
					liCategorie.appendChild(aCategorie);
					ulCategorie.appendChild(liCategorie);
				
					d++;
				}
				
				divCategorie.appendChild(ulCategorie);
				
				var id = "rowCategorie";
				document.getElementById(id).appendChild(divCategorie);
			}
		}
		
		if(b != 0){
			var divCategorie = document.createElement('div');
			divCategorie.setAttribute("class", "col-lg-6");
			
			var ulCategorie = document.createElement('ul');
			ulCategorie.setAttribute("class", "list-unstyled");
			
			for(var i=d; i<b+d; i++){
				var lienPage = "article?categorie="+this.response[i].categorie_Article;
				
				var liCategorie = document.createElement('li');
				var aCategorie = document.createElement('a');
				aCategorie.setAttribute("href", lienPage);
				aCategorie.textContent = this.response[i].categorie_Article;
				
				liCategorie.appendChild(aCategorie);
				ulCategorie.appendChild(liCategorie);
			}
			
			divCategorie.appendChild(ulCategorie);
			
			var id = "rowCategorie";
			document.getElementById(id).appendChild(divCategorie);
		}
		
	}
	requeteCategorie.send();
};

window.onload = function() {
getCategorie();

document.getElementById("boutonRecherche").onclick=function(){
	var recherche = document.getElementById("champRecherche").value;
	window.location.href = "recherche?texte="+recherche;
};

document.getElementById("champRecherche").onkeydown=function(event){
	if(event.keyCode == 13){
		var recherche = document.getElementById("champRecherche").value;
		window.location.href = "recherche?texte="+recherche;
	}
};

document.getElementById("page0").onclick=function(){
	document.getElementById("page"+nb).setAttribute("class", "");
	nb = 0;
	document.getElementById("page0").setAttribute("class", "active");
	if(document.getElementsByClassName("blog1").length != 0){
		remove("blog1");
	}
	getArticle(nb);
};

document.getElementById("page5").onclick=function(){
	document.getElementById("page"+nb).setAttribute("class", "");
	nb = 5;
	document.getElementById("page5").setAttribute("class", "active");
	if(document.getElementsByClassName("blog1").length != 0){
		remove("blog1");
	}
	getArticle(nb);
};

document.getElementById("page10").onclick=function(){
	document.getElementById("page"+nb).setAttribute("class", "");
	nb = 10;
	document.getElementById("page10").setAttribute("class", "active");
	if(document.getElementsByClassName("blog1").length != 0){
		remove("blog1");
	}
	getArticle(nb);
};

document.getElementById("page15").onclick=function(){
	document.getElementById("page"+nb).setAttribute("class", "");
	nb = 15;
	document.getElementById("page15").setAttribute("class", "active");
	if(document.getElementsByClassName("blog1").length != 0){
		remove("blog1");
	}
	getArticle(nb);
};

document.getElementById("page20").onclick=function(){
	document.getElementById("page"+nb).setAttribute("class", "");
	nb = 20;
	document.getElementById("page20").setAttribute("class", "active");
	if(document.getElementsByClassName("blog1").length != 0){
		remove("blog1");
	}
	getArticle(nb);
};

document.getElementById("avant").onclick=function(){
	if(nb != 0){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = nb - 5;
		document.getElementById("page"+nb).setAttribute("class", "active");
		if(document.getElementsByClassName("blog1").length != 0){
			remove("blog1");
		}
		getArticle(nb);
	}
};

document.getElementById("apres").onclick=function(){
	if(nb != 20){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = nb + 5;
		document.getElementById("page"+nb).setAttribute("class", "active");
		if(document.getElementsByClassName("blog1").length != 0){
			remove("blog1");
		}
		getArticle(nb);
	}
};
}