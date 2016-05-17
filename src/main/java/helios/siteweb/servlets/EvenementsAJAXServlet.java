package helios.siteweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Evenement;

@WebServlet("/evenementsAJAX")

public class EvenementsAJAXServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		List<Evenement> listeEvenement = HeliosManager.getInstance().getEvenement();
		
		Gson gson = new Gson();
		String parametreJson = gson.toJson(listeEvenement);
		PrintWriter out = response.getWriter();
		out.append(parametreJson);
	}

}
