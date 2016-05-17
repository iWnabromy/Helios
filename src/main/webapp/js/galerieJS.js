var nbPhoto = -6;
var nbVideo = -5;

var getPhoto = function(){
	var requeteGetPhoto = new XMLHttpRequest();
	requeteGetPhoto.open("GET", "galerieAJAX");
	requeteGetPhoto.responseType = "json";
	requeteGetPhoto.onload = function(){
		var a = this.response.length;
		for(var i=nbPhoto; i<nbPhoto+6; i++){
			var lienImg = this.response[i].lien_Galerie;
			
			var divPhoto = document.createElement('div');
			divPhoto.setAttribute("style", "display:inline-block; max-width:30%;margin:10px 10px 10px 10px;");
			var a3Photo = document.createElement('a');
			a3Photo.setAttribute("href", lienImg);
			a3Photo.setAttribute("data-lightbox","photo");
			var img3Photo = document.createElement('img');
			img3Photo.setAttribute("class", "img-responsive");
			img3Photo.setAttribute("src", lienImg);
			img3Photo.setAttribute("alt", "");
			
			a3Photo.appendChild(img3Photo);
			divPhoto.appendChild(a3Photo);
			
			var id = "rowPhoto";
			document.getElementById(id).appendChild(divPhoto);
		}
		
	}
	nbPhoto = nbPhoto + 6;
	requeteGetPhoto.send();
};

var getVideo = function(){
	var requeteGetPhoto = new XMLHttpRequest();
	requeteGetPhoto.open("GET", "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&contentDetails&maxResults=50&playlistId=UURbUhGH4IGrlilsRBQmLM4w&key=AIzaSyDQ8s9yYV0jj7PMXrfqRl6_DIMtgdMhT4Q");
	requeteGetPhoto.responseType = "json";
	requeteGetPhoto.onload = function(){
		var a = this.response.items.length;
		for(var i=nbVideo; i<nbVideo+5; i++){
			var lienVideo = "https://www.youtube.com/embed/"+this.response.items[i].snippet.resourceId.videoId;
			
			var divVideo = document.createElement('div');

			var div1Video = document.createElement('div');
			var iframeVideo = document.createElement('iframe');

			var div2Video = document.createElement('div');
			var h3Video = document.createElement('h3');
			var pVideo = document.createElement('p');

			var hrVideo = document.createElement('hr');
			hrVideo.setAttribute("class", "partenaire");
			divVideo.setAttribute("class", "row partenaire");

			div1Video.setAttribute("class", "col-md-7");
			iframeVideo.setAttribute("width", "560");
			iframeVideo.setAttribute("height", "315");
			iframeVideo.setAttribute("src", lienVideo);
			iframeVideo.setAttribute("frameborder", "0");
			iframeVideo.setAttribute("allowfullscreen", "");
			

			div2Video.setAttribute("class", "col-md-5");
			h3Video.textContent = this.response.items[i].snippet.title;
			pVideo.textContent = this.response.items[i].snippet.description;

			div1Video.appendChild(iframeVideo);

			div2Video.appendChild(h3Video);
			div2Video.appendChild(pVideo);

			divVideo.appendChild(div1Video);
			divVideo.appendChild(div2Video);

			var id = "rowVideo";
			document.getElementById(id).appendChild(divVideo);
			document.getElementById(id).appendChild(hrVideo);
		}
	}
	nbVideo = nbVideo +5;
	requeteGetPhoto.send();
};

window.onload = function() {
	getPhoto();
	getVideo();
	
	document.getElementById("buttonVideo").onclick = function() {
		getVideo();
	};
	document.getElementById("buttonPhoto").onclick = function() {
		getPhoto();
	};
}