package helios.siteweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Partenaire;

@WebServlet("/admin/sponsormodifier")
public class SponsorModifServlet extends HttpServlet {

	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Partenaire sponsor = HeliosManager.getInstance().getPartenaire(id);
			request.setAttribute("sponsor", sponsor);

			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/sponsorModif.jsp");
			view.forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("admin/sponsor");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id1 =request.getParameter("id");
		Integer id_Sponsor =Integer.parseInt(id1);
		String nom_Sponsor = request.getParameter("nom"); 
		String lien_Sponsor = request.getParameter("lien"); 
		String photo_Sponsor = request.getParameter("photo"); 
		String description_Sponsor = request.getParameter("description"); 
		String importance = request.getParameter("importance"); 
		Integer importance_Sponsor = Integer.parseInt(importance);
		String langue_Sponsor = request.getParameter("langue");

			Partenaire nouveauPartenaire = new Partenaire(id_Sponsor, nom_Sponsor, description_Sponsor, photo_Sponsor, lien_Sponsor, importance_Sponsor, langue_Sponsor );
			HeliosManager.getInstance().ModifierPartenaire(nouveauPartenaire);

			response.sendRedirect("sponsor");
		
	}

}

