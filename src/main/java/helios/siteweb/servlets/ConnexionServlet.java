package helios.siteweb.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Admin;
import helios.siteweb.utilis.MotDePasseUtils;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {
	private static final long serialVersionUID = -2793586799100543352L;

	private Map<String, String> utilisateursAutorises;
	
	@Override
	public void init() throws ServletException {
		utilisateursAutorises = new HashMap<String, String>();
		List<Admin> utili = HeliosManager.getInstance().getAdmin();
		for (int i =0; i< utili.size();i++)
		{
			utilisateursAutorises.put(utili.get(i).getLogin_Admin(), utili.get(i).getMdp_Admin());
		}
		
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String utilisateur = (String) request.getSession().getAttribute("utilisateurConnecte");
		if (utilisateur != null && !"".equals(utilisateur)) {
			response.sendRedirect("admin/administration");
			//RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Admin/administration.jsp");
			//view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/Admin/connexion.jsp");
			view.forward(request, response);
			//response.sendRedirect("connexion");

		}
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String identifiant = request.getParameter("login");
		String motDePasse = request.getParameter("motdepasse");
		

		
		try {
			if(utilisateursAutorises.containsKey(identifiant) && MotDePasseUtils.validerMotDePasse(motDePasse, utilisateursAutorises.get(identifiant))) {
				System.out.println("Enregistrement de l'utilisateur en session");
				request.getSession().setAttribute("utilisateurConnecte", identifiant);
			} else {
				System.err.println("Erreur d'identification !!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 

		response.sendRedirect("connexion");

	}

}
