package helios.siteweb.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Membre;

@WebServlet("/admin/membre")

public class MembreServlet extends HttpServlet {

	private static final long serialVersionUID = 6880801727716084460L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Membre> membres = HeliosManager.getInstance().getMembre();
		request.setAttribute("listeMembres", membres);


		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/membre.jsp");
		view.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id_Membre1 =request.getParameter("id");
		Integer id_Membre =Integer.parseInt(id_Membre1);
		

			HeliosManager.getInstance().supprimerMembre(id_Membre);

			response.sendRedirect("membre");
		
	}


}
