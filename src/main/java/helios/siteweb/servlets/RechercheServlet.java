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
import helios.siteweb.model.Article;

@WebServlet("/recherche")

public class RechercheServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		try {
			String texte = request.getParameter("texte");
			List<Article> article = HeliosManager.getInstance().getArticleRecherche(texte);
			request.setAttribute("article", article);

			RequestDispatcher view = request.getRequestDispatcher("WEB-INF/blogs.jsp");
			view.forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("blog");
		}

	}

}
