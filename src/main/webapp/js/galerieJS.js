var nbPhoto = 8;
var nbVideo = 8;

var getPhoto = function(){
	var requeteGetPhoto = new XMLHttpRequest();
	requeteGetPhoto.open("GET", "ws/galerie/photo");
	requeteGetPhoto.responseType = "json";
	requeteGetPhoto.onload = function(){
		var a = this.response.length;
		for(var i=0; i<nbPhoto; i++){
			var lienPhoto = "article/"+this.response[i].article_Galerie;
			var lienImg = "img/"+this.response[i].lien_Galerie;
			
			var div1Photo = document.createElement('div');			
			div1Photo.setAttribute("class", "col-md-3 col-sm-6 galerieInf");
			
			var div2Photo = document.createElement('div');
			div2Photo.setAttribute("class", "panel panel-default text-center");
			div2Photo.setAttribute("style", "border:none; box-shadow:none;");
			
			var div3Photo = document.createElement('div');
			div3Photo.setAttribute("class", "panel-heading");
			div3Photo.setAttribute("style", "border:none; background-color:white;");
			var span3Photo = document.createElement('span');
			span3Photo.setAttribute("class", "fa-stack fa-5x");
			span3Photo.setAttribute("style", "width:180px");
			var a3Photo = document.createElement('a');
			a3Photo.setAttribute("href", lienImg);
			a3Photo.setAttribute("data-lightbox","photo");
			var img3Photo = document.createElement('img');
			img3Photo.setAttribute("class", "img-responsive");
			img3Photo.setAttribute("src", lienImg);
			img3Photo.setAttribute("alt", "");
			
			/*var div4Photo = document.createElement('div');
			div4Photo.setAttribute("class", "panel-body");
			var h4Photo = document.createElement('h4');
			h4Photo.textContent = this.response[i].titre_Galerie;
			var a4Photo = document.createElement('a');
			a4Photo.setAttribute("href", lienPhoto);
			a4Photo.setAttribute("class", "btn btn-primary");
			a4Photo.textContent = "Voir l'article associé";*/
			a3Photo.appendChild(img3Photo);
			span3Photo.appendChild(a3Photo);
			div3Photo.appendChild(span3Photo);
			
			/*div4Photo.appendChild(h4Photo);
			div4Photo.appendChild(a4Photo);*/
			
			div2Photo.appendChild(div3Photo);
			//div2Photo.appendChild(div4Photo);
			
			div1Photo.appendChild(div2Photo);
			
			var id = "rowPhoto";
			document.getElementById(id).appendChild(div1Photo);
		}
		
	}
	requeteGetPhoto.send();
};

var getVideo = function(){
	var requeteGetPhoto = new XMLHttpRequest();
	requeteGetPhoto.open("GET", "ws/galerie/video");
	requeteGetPhoto.responseType = "json";
	requeteGetPhoto.onload = function(){
		var a = this.response.length;
		for(var i=0; i<nbVideo; i++){
			var lienPhoto = "article/"+this.response[i].article_Galerie;
			var lienImg = "img/"+this.response[i].lien_Galerie;
			
			var div1Photo = document.createElement('div');			
			div1Photo.setAttribute("class", "col-md-3 col-sm-6 galerieInf");
			
			var div2Photo = document.createElement('div');
			div2Photo.setAttribute("class", "panel panel-default text-center");
			div2Photo.setAttribute("style", "border:none; box-shadow:none;");
			
			var div3Photo = document.createElement('div');
			div3Photo.setAttribute("class", "panel-heading");
			div3Photo.setAttribute("style", "border:none; background-color:white;");
			var span3Photo = document.createElement('span');
			span3Photo.setAttribute("class", "fa-stack fa-5x");
			span3Photo.setAttribute("style", "width:180px");
			var a3Photo = document.createElement('a');
			a3Photo.setAttribute("href", lienImg);
			a3Photo.setAttribute("data-lightbox","video");
			var img3Photo = document.createElement('img');
			img3Photo.setAttribute("class", "img-responsive");
			img3Photo.setAttribute("src", lienImg);
			img3Photo.setAttribute("alt", "");
			
			/*var div4Photo = document.createElement('div');
			div4Photo.setAttribute("class", "panel-body");
			var h4Photo = document.createElement('h4');
			h4Photo.textContent = this.response[i].titre_Galerie;
			var a4Photo = document.createElement('a');
			a4Photo.setAttribute("href", lienPhoto);
			a4Photo.setAttribute("class", "btn btn-primary");
			a4Photo.textContent = "Voir l'article associé";*/
			a3Photo.appendChild(img3Photo);
			span3Photo.appendChild(a3Photo);
			div3Photo.appendChild(span3Photo);
			
			/*div4Photo.appendChild(h4Photo);
			div4Photo.appendChild(a4Photo);*/
			
			div2Photo.appendChild(div3Photo);
			//div2Photo.appendChild(div4Photo);
			
			div1Photo.appendChild(div2Photo);
			
			var id = "rowVideo";
			document.getElementById(id).appendChild(div1Photo);
		}
		
	}
	requeteGetPhoto.send();
};

window.onload = function() {
	getPhoto();
	getVideo();
}