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

@WebServlet(urlPatterns = "/admin/administration")

public class AdministrationServlet extends HttpServlet {

	private static final long serialVersionUID = 6880801727716084460L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Membre> membres = HeliosManager.getInstance().getMembre();
		request.setAttribute("listeMembres", membres);

		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/administration.jsp");
		view.forward(request, response);
	}

}
