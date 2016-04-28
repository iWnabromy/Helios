package helios.siteweb.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Article;

@Path("/categorie")
@Produces({"application/json; charset=utf-8"})
public class GetCategorieService {
	private List<Article> liste;
	private Gson gson = new Gson();
	
	@Path("/{categorie}")
	@GET
	public Response getCategorie(@PathParam("categorie") String categorie){
		this.liste = HeliosManager.getInstance().getArticleCategorie(categorie);
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}
	
}
