package helios.siteweb.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Partenaire;

@Path("/partenaire")
@Produces({"application/json; charset=utf-8"})
public class PartenaireService {
	
	private List<Partenaire> liste;
	private Gson gson = new Gson();
	
	@Path("")
	@GET
	public Response recupPartenaire(){
		this.liste = HeliosManager.getInstance().getPartenaire();
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}

}
