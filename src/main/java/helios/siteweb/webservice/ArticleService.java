package helios.siteweb.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Article;

@Path("/article")
@Produces({"application/json; charset=utf-8"})
public class ArticleService {
	private List<Article> liste;
	private Gson gson = new Gson();
	
	@Path("/accueil")
	@GET
	public Response recupArticleAccueil(){
		this.liste = HeliosManager.getInstance().getArticleAccueil();
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
	
	@Path("/blog")
	@GET
	public Response recupArticle(){
		this.liste = HeliosManager.getInstance().getArticle();
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
	
	@Path("/categorie")
	@GET
	public Response recupCategorie(){
		this.liste = HeliosManager.getInstance().getCategorie();
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
	
	@Path("/articleCategorie")
	@GET
	public Response recupArticleCategorie(String categorie_Article){
		this.liste = HeliosManager.getInstance().getArticleCategorie(categorie_Article);
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
	
	@Path("/recherche")
	@GET
	public Response recupArticleRecherche(String texte){
		this.liste = HeliosManager.getInstance().getArticleRecherche(texte);
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
}
