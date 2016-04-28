var nb = 0;

var getEvenement = function(int){
	var requeteGetEvenement = new XMLHttpRequest();
	requeteGetEvenement.open("GET", "ws/evenement");
	requeteGetEvenement.responseType = "json";
	requeteGetEvenement.onload = function(){
		var a = this.response.length;
		for(var i=int; i<int+5; i++){
			var lienPage = "article/"+this.response[i].article_Evenement;
			var lienImg = "img/"+this.response[i].photo_Evenement;
			
			var divEvenement = document.createElement('div');
			
			var div1Evenement = document.createElement('div');			
			var a1Evenement = document.createElement('a');
			var img1Evenement = document.createElement('img');
			
			var div2Evenement = document.createElement('div');
			var h3Evenement = document.createElement('h3');
			var h4Evenement = document.createElement('h4');
			var pEvenement = document.createElement('p');
			var a2Evenement = document.createElement('a');
			var iEvenement = document.createElement('i');
			
			var hrEvenement = document.createElement('hr');
			
			hrEvenement.setAttribute("class", "evenement");
			divEvenement.setAttribute("class", "row evenement");
			
			div1Evenement.setAttribute("class", "col-md-7");
			a1Evenement.setAttribute("href", lienPage);
			img1Evenement.setAttribute("class", "img-responsive img-hover");
			img1Evenement.setAttribute("src", lienImg);
			img1Evenement.setAttribute("alt", "");
			
			div2Evenement.setAttribute("class", "col-md-5");
			h3Evenement.textContent = this.response[i].nom_Evenement;
			h4Evenement.textContent = this.response[i].date_Evenement;
			pEvenement.textContent = this.response[i].description_Evenement;
			a2Evenement.setAttribute("class", "btn btn-primary");
			a2Evenement.setAttribute("href", lienPage);
			iEvenement.textContent = "Voir plus";
			
			a1Evenement.appendChild(img1Evenement);
			div1Evenement.appendChild(a1Evenement);
			
			a2Evenement.appendChild(iEvenement);
			div2Evenement.appendChild(h3Evenement);
			div2Evenement.appendChild(h4Evenement);
			div2Evenement.appendChild(pEvenement);
			div2Evenement.appendChild(a2Evenement);
			
			divEvenement.appendChild(div1Evenement);
			divEvenement.appendChild(div2Evenement);
			
			var id = "containerEvenement";
			var id2 = "paginationEvenement";
			document.getElementById(id).insertBefore(divEvenement, document.getElementById(id2));
			document.getElementById(id).insertBefore(hrEvenement, document.getElementById(id2));
		}
		
	}
	requeteGetEvenement.send();
};

function remove(string){
	var obj = document.getElementById("containerEvenement");
	var liste = document.getElementsByClassName(string);
	var longueur = liste.length;
	
	for(var j = 0; j<longueur; j++){
		var el = liste[0];
		obj.removeChild(el);
	}
}

window.onload = function() {
	getEvenement(nb);
	
	document.getElementById("page0").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 0;
		document.getElementById("page0").setAttribute("class", "active");
		if(document.getElementsByClassName("evenement").length != 0){
			remove("evenement");
		}
		getEvenement(nb);
	};
	
	document.getElementById("page5").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 5;
		document.getElementById("page5").setAttribute("class", "active");
		if(document.getElementsByClassName("evenement").length != 0){
			remove("evenement");
		}
		getEvenement(nb);
	};
	
	document.getElementById("page10").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 10;
		document.getElementById("page10").setAttribute("class", "active");
		if(document.getElementsByClassName("evenement").length != 0){
			remove("evenement");
		}
		getEvenement(nb);
	};
	
	document.getElementById("page15").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 15;
		document.getElementById("page15").setAttribute("class", "active");
		if(document.getElementsByClassName("evenement").length != 0){
			remove("evenement");
		}
		getEvenement(nb);
	};
	
	document.getElementById("page20").onclick=function(){
		document.getElementById("page"+nb).setAttribute("class", "");
		nb = 20;
		document.getElementById("page20").setAttribute("class", "active");
		if(document.getElementsByClassName("evenement").length != 0){
			remove("evenement");
		}
		getEvenement(nb);
	};
	
	document.getElementById("avant").onclick=function(){
		if(nb != 0){
			document.getElementById("page"+nb).setAttribute("class", "");
			nb = nb - 5;
			document.getElementById("page"+nb).setAttribute("class", "active");
			if(document.getElementsByClassName("evenement").length != 0){
				remove("evenement");
			}
			getEvenement(nb);
		}
	};
	
	document.getElementById("apres").onclick=function(){
		if(nb != 20){
			document.getElementById("page"+nb).setAttribute("class", "");
			nb = nb + 5;
			document.getElementById("page"+nb).setAttribute("class", "active");
			if(document.getElementsByClassName("evenement").length != 0){
				remove("evenement");
			}
			getEvenement(nb);
		}
	};
}