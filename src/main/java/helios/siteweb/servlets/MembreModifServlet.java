package helios.siteweb.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Membre;

@WebServlet("/admin/membremodifier")
public class MembreModifServlet extends HttpServlet {

	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Membre membre = HeliosManager.getInstance().getMembre(id);
			request.setAttribute("membre", membre);

			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/membreModif.jsp");
			view.forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("admin/membre");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id_Membre1 =request.getParameter("id");
		Integer id_Membre =Integer.parseInt(id_Membre1);
		String nom_Membre = request.getParameter("nom"); 
		String prenom_Membre = request.getParameter("prenom"); 
		String job_Membre = request.getParameter("job");
		String photo_Membre = request.getParameter("photo");
		String description_Membre= request.getParameter("description"); 
		String facebook_Membre = request.getParameter("facebook"); 
		String link_Membre = request.getParameter("linkedin");
		String twitter_Membre = request.getParameter("twitter"); 
		String insta_Membre = request.getParameter("instagram");
		String mail_Membre = request.getParameter("mail");
		String langue_Membre = request.getParameter("langue");

			Membre nouveauMembre = new Membre(id_Membre, nom_Membre, prenom_Membre, job_Membre,photo_Membre,
					description_Membre, facebook_Membre,link_Membre,twitter_Membre,insta_Membre,mail_Membre,langue_Membre );
			HeliosManager.getInstance().ModifierMembre(nouveauMembre);

			response.sendRedirect("membre");
		
	}

}

