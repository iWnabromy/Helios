package helios.siteweb.webservice;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Evenement;

@Path("/evenement")
@Produces({"application/json; charset=utf-8"})
public class EvenementService {
	private List<Evenement> liste;
	private Gson gson = new Gson();
	
	@Path("")
	@GET
	public Response recupEvenement(){
		this.liste = HeliosManager.getInstance().getEvenement();
		String listeString = gson.toJson(this.liste);
		return Response.status(200).entity(listeString).build();
	}

}
