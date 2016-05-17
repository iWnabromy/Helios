var nb = 0;

var getArticle = function(int){
var requeteGetArticle = new XMLHttpRequest();
requeteGetArticle.open("GET", "articlesAJAX");
requeteGetArticle.responseType = "json";
requeteGetArticle.onload = function(){
var a = this.response.length;
for(var i=int; i<int+5; i++){
var lienPage =  "article?id="+this.response[i].id_Article;
var lienImg = this.response[i].photoPresentation_Article;

var h2Article = document.createElement('h2');
var ah2Article = document.createElement('a');

var p1Article = document.createElement('p');
var ap1Article = document.createElement('a');

var p2Article = document.createElement('p');
var ip2Article = document.createElement('i');

var hr1Article = document.createElement('hr');

var a1Article = document.createElement('a');
var imga1Article = document.createElement('img');

var hr2Article = document.createElement('hr');

var p3Article = document.createElement('p');

var a2Article = document.createElement('a');
var ia2Article = document.createElement('i');

var hr3Article = document.createElement('hr');

h2Article.setAttribute("class", "blog1");
ah2Article.setAttribute("href", lienPage);
ah2Article.textContent = this.response[i].titre_Article;
h2Article.appendChild(ah2Article);

p1Article.setAttribute("class", "lead blog1");
p1Article.textContent = "by ";
ap1Article.setAttribute("href", lienPage);
ap1Article.textContent = "Auteur";
p1Article.appendChild(ap1Article);

ip2Article.setAttribute("class", "fa fa-clock-o");
p2Article.setAttribute("class", "blog1");
p2Article.appendChild(ip2Article);
p2Article.textContent = "Posté le "+this.response[i].date_Article;

hr1Article.setAttribute("class", "blog1");

a1Article.setAttribute("href", lienPage);
a1Article.setAttribute("class", "blog1");
imga1Article.setAttribute("class", "img-responsive img-hover");
imga1Article.setAttribute("src", lienImg);
imga1Article.setAttribute("alt", "");
a1Article.appendChild(imga1Article);

hr2Article.setAttribute("class", "blog1");

p3Article.setAttribute("class", "blog1");
p3Article.textContent = this.response[i].textePresentation_Article;

a2Article.setAttribute("class", "btn btn-primary blog1");
a2Article.setAttribute("href", lienPage);
a2Article.textContent = "Article complet";
ia2Article.setAttribute("class", "fa fa-angle-right");

hr3Article.setAttribute("class", "blog1");

var id = "articleBlog";
var id2 = "passagePage";

document.getElementById(id).insertBefore(h2Article, document.getElementById(id2));
//document.getElementById(id).insertBefore(p1Article, document.getElementById(id2));
document.getElementById(id).insertBefore(p2Article, document.getElementById(id2));
document.getElementById(id).insertBefore(hr1Article, document.getElementById(id2));
document.getElementById(id).insertBefore(a1Article, document.getElementById(id2));
document.getElementById(id).insertBefore(hr2Article, document.getElementById(id2));
document.getElementById(id).insertBefore(p3Article, document.getElementById(id2));
document.getElementById(id).insertBefore(a2Article, document.getElementById(id2));
document.getElementById(id).insertBefore(hr3Article, document.getElementById(id2));

}

}
requeteGetArticle.send();
};

function remove(string){
var obj = document.getElementById("articleBlog");
var liste = document.getElementsByClassName(string);
var longueur = liste.length;

for(var j = 0; j<longueur; j++){
var el = liste[0];
obj.removeChild(el);
}
}

var getCategorie = function(){
	var requeteCategorie = new XMLHttpRequest();
	requeteCategorie.open("GET", "categoriesAJAX");
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
				var lienPage = "categorie?categorie="+this.response[i].categorie_Article;
				
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
getArticle(nb);
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