package helios.siteweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.RequestDispatcher;
import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Categorie;

@WebServlet("/admin/categorieajouter")

public class CategorieAjoutServlet extends HttpServlet {

	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/categorieAjouter.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String nom_Categorie = request.getParameter("nom"); 
		
		Categorie nouvellecategorie = new Categorie(null, nom_Categorie);
		HeliosManager.getInstance().ajouterCategorie(nouvellecategorie);

		response.sendRedirect("categorie");

	}

}

