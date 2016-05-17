package helios.siteweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Categorie;
import helios.siteweb.model.Partenaire;

@WebServlet("/admin/categoriemodifier")
public class CategorieModifServlet extends HttpServlet {

	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Partenaire categorie = HeliosManager.getInstance().getPartenaire(id);
			request.setAttribute("categorie", categorie);

			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/categorieModif.jsp");
			view.forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("admin/categorie");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id1 =request.getParameter("id");
		Integer id_Sponsor =Integer.parseInt(id1);
		String nom_Categorie = request.getParameter("nom"); 

			Categorie nouvellecategorie = new Categorie(id_Sponsor, nom_Categorie);
			HeliosManager.getInstance().ModifierCategorie(nouvellecategorie);

			response.sendRedirect("categorie");
		
	}

}

