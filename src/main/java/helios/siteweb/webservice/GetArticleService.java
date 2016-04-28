package helios.siteweb.webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import helios.siteweb.metier.HeliosManager;

@Path("/article")
@Produces({"application/json; charset=utf-8"})
public class GetArticleService {


	@GET
	@Path("/{id}")
	public void getArticle(@PathParam("id") Integer id) {
		HeliosManager.getInstance().getArticle(id);

	}

}
