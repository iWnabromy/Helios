var nb = 0;

var getPartenaire = function(int){
	var requeteGetPartenaire = new XMLHttpRequest();
	requeteGetPartenaire.open("GET", "partenairesAJAX");
	requeteGetPartenaire.responseType = "json";
	requeteGetPartenaire.onload = function(){
		var a = this.response.length;
		for(var i=int; i<int+5; i++){
			var lienPartenaire = this.response[i].lien_Partenaire;
			var lienImg = this.response[i].photo_Partenaire;
			
			var divPartenaire = document.createElement('div');
			
			var div1Partenaire = document.createElement('div');			
			var a1Partenaire = document.createElement('a');
			var img1Partenaire = document.createElement('img');
			
			var div2Partenaire = document.createElement('div');
			var h3Partenaire = document.createElement('h3');
			var pPartenaire = document.createElement('p');
			
			var hrPartenaire = document.createElement('hr');
			
			hrPartenaire.setAttribute("class", "partenaire");
			divPartenaire.setAttribute("class", "row partenaire");
			
			div1Partenaire.setAttribute("class", "col-md-7");
			a1Partenaire.setAttribute("href", lienPartenaire);
			img1Partenaire.setAttribute("class", "img-responsive img-hover");
			img1Partenaire.setAttribute("src", lienImg);
			img1Partenaire.setAttribute("alt", "");
			
			div2Partenaire.setAttribute("class", "col-md-5");
			h3Partenaire.textContent = this.response[i].nom_Partenaire;
			pPartenaire.textContent = this.response[i].description_Partenaire;
			
			a1Partenaire.appendChild(img1Partenaire);
			div1Partenaire.appendChild(a1Partenaire);
			
			div2Partenaire.appendChild(h3Partenaire);
			div2Partenaire.appendChild(pPartenaire);
			
			divPartenaire.appendChild(div1Partenaire);
			divPartenaire.appendChild(div2Partenaire);
			
			var id = "containerPartenaire";
			var id2 = "paginationPartenaire";
			document.getElementById(id).insertBefore(divPartenaire, document.getElementById(id2));
			document.getElementById(id).insertBefore(hrPartenaire, document.getElementById(id2));
		}
		
	}
	requeteGetPartenaire.send();
};

function remove(string){
	var obj = document.getElementById("containerPartenaire");
	var liste = document.getElementsByClassName(string);
	var longueur = liste.length;
	
	for(var j = 0; j<longueur; j++){
		var el = liste[0];
		obj.removeChild(el);
	}
}

window.onload = function() {
	getPartenaire(nb);
	
	document.getElementById("page0").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 0;
		document.getElementById("page0").setAttribute("class", "active");
		if(document.getElementsByClassName("partenaire").length != 0){
			remove("partenaire");
		}
		getPartenaire(nb);
	};
	
	document.getElementById("page5").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 5;
		document.getElementById("page5").setAttribute("class", "active");
		if(document.getElementsByClassName("partenaire").length != 0){
			remove("partenaire");
		}
		getPartenaire(nb);
	};
	
	document.getElementById("page10").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 10;
		document.getElementById("page10").setAttribute("class", "active");
		if(document.getElementsByClassName("partenaire").length != 0){
			remove("partenaire");
		}
		getPartenaire(nb);
	};
	
	document.getElementById("page15").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 15;
		document.getElementById("page15").setAttribute("class", "active");
		if(document.getElementsByClassName("partenaire").length != 0){
			remove("partenaire");
		}
		getPartenaire(nb);
	};
	
	document.getElementById("page20").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 20;
		document.getElementById("page20").setAttribute("class", "active");
		if(document.getElementsByClassName("partenaire").length != 0){
			remove("partenaire");
		}
		getPartenaire(nb);
	};
	
	document.getElementById("avant").onclick=function(){
		if(nb != 0){
			document.getElementById("page"+nb).setAttribute("class", "");
			nb = nb - 5;
			document.getElementById("page"+nb).setAttribute("class", "active");
			if(document.getElementsByClassName("partenaire").length != 0){
				remove("partenaire");
			}
			getPartenaire(nb);
		}
	};
	
	document.getElementById("apres").onclick=function(){
		if(nb != 20){
			document.getElementById("page"+nb).setAttribute("class", "");
			nb = nb + 5;
			document.getElementById("page"+nb).setAttribute("class", "active");
			if(document.getElementsByClassName("partenaire").length != 0){
				remove("partenaire");
			}
			getPartenaire(nb);
		}
	};
}