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

@WebServlet("/admin/Partenaireajouter")
public class SponsorAjoutServlet extends HttpServlet {

	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/sponsorAjouter.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String nom_Partenaire = request.getParameter("nom"); 
		String prenom_Partenaire = request.getParameter("description"); 
		String photo_Partenaire = request.getParameter("photo");
		String lien_Partenaire = request.getParameter("lien");
		String imp = request.getParameter("importance");
		Integer importance_Partenaire = Integer.parseInt(imp);
		String langue_Partenaire = request.getParameter("langue");

		Partenaire nouveauPartenaire = new Partenaire(null, nom_Partenaire,prenom_Partenaire, photo_Partenaire,lien_Partenaire, importance_Partenaire,langue_Partenaire );
		HeliosManager.getInstance().ajouterPartenaire(nouveauPartenaire);

		response.sendRedirect("Partenaire");

	}

}

