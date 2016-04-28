var getMembre = function(){
	var requeteGetMembre = new XMLHttpRequest();
	requeteGetMembre.open("GET", "ws/membre");
	requeteGetMembre.responseType = "json";
	requeteGetMembre.onload = function(){
		var a = this.response.length;
		for(var i=0; i<a; i++){
			var lienImg = "img/"+this.response[i].photo_Membre;
			
			var div1Membre = document.createElement('div');
			
			var div2Membre = document.createElement('div');			
			var img2Membre = document.createElement('img');
			
			var div3Membre = document.createElement('div');			
			var h3Membre = document.createElement('h3');
			var brMembre = document.createElement('br');
			var smallMembre = document.createElement('small');
			var pMembre = document.createElement('p');
			
			var ulMembre = document.createElement('ul');
			
			var li1Membre = document.createElement('li');
			var a1Membre = document.createElement('a');
			var i1Membre = document.createElement('i');
			
			var li2Membre = document.createElement('li');
			var a2Membre = document.createElement('a');
			var i2Membre = document.createElement('i');
			
			var li3Membre = document.createElement('li');
			var a3Membre = document.createElement('a');
			var i3Membre = document.createElement('i');
			
			var li4Membre = document.createElement('li');
			var a4Membre = document.createElement('a');
			var i4Membre = document.createElement('i');
			
			var li5Membre = document.createElement('li');
			var a5Membre = document.createElement('a');
			var i5Membre = document.createElement('i');
						
			div1Membre.setAttribute("class", "col-md-4 text-center");
			
			div2Membre.setAttribute("class", "thumbnail");
			img2Membre.setAttribute("class", "img-responsive");
			img2Membre.setAttribute("src", lienImg);
			img2Membre.setAttribute("alt", "");
			
			div3Membre.setAttribute("class", "caption");
			h3Membre.textContent = this.response[i].prenom_Membre + " " + this.response[i].nom_Membre;
			
			smallMembre.textContent = this.response[i].job_Membre;
			console.log(this.response[i].job_Membre);
			pMembre.textContent = this.response[i].description_Membre;
			
			ulMembre.setAttribute("class", "list-inline");
			
			a1Membre.setAttribute("style", "color : #3b5998;")
			a1Membre.setAttribute("href", this.response[i].facebook_Membre);
			i1Membre.setAttribute("class", "fa fa-2x fa-facebook-square");
			
			a1Membre.appendChild(i1Membre);
			li1Membre.appendChild(a1Membre);
			
			a2Membre.setAttribute("style", "color : #0976b4;")
			a2Membre.setAttribute("href", this.response[i].link_Membre);
			i2Membre.setAttribute("class", "fa fa-2x fa-linkedin-square");
			
			a2Membre.appendChild(i2Membre);
			li2Membre.appendChild(a2Membre);
			
			a3Membre.setAttribute("style", "color : #55acee;")
			a3Membre.setAttribute("href", this.response[i].twitter_Membre);
			i3Membre.setAttribute("class", "fa fa-2x fa-twitter-square");
			
			a3Membre.appendChild(i3Membre);
			li3Membre.appendChild(a3Membre);
			
			a4Membre.setAttribute("style", "color : #3f729b;")
			a4Membre.setAttribute("href", this.response[i].insta_Membre);
			i4Membre.setAttribute("class", "fa fa-2x fa-instagram");
			
			a4Membre.appendChild(i4Membre);
			li4Membre.appendChild(a4Membre);
			
			a5Membre.setAttribute("href", this.response[i].mail_Membre);
			i5Membre.setAttribute("class", "fa fa-2x fa-envelope");
			
			a5Membre.appendChild(i5Membre);
			li5Membre.appendChild(a5Membre);
			
			ulMembre.appendChild(li1Membre);
			ulMembre.appendChild(li2Membre);
			ulMembre.appendChild(li3Membre);
			ulMembre.appendChild(li4Membre);
			ulMembre.appendChild(li5Membre);
			
			h3Membre.appendChild(brMembre);
			h3Membre.appendChild(smallMembre);
			
			div3Membre.appendChild(h3Membre);
			div3Membre.appendChild(pMembre);
			div3Membre.appendChild(ulMembre);
			
			div2Membre.appendChild(img2Membre);
			div2Membre.appendChild(div3Membre);
			
			div1Membre.appendChild(div2Membre);
			
			var id = "divMembre";
			document.getElementById(id).appendChild(div1Membre);
		}
		
	}
	requeteGetMembre.send();
};

window.onload = function() {
	getMembre();
	
}