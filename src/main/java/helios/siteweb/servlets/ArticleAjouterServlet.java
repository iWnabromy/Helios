package helios.siteweb.servlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Article;

@WebServlet("/admin/articleajouter")
public class ArticleAjouterServlet extends HttpServlet{
	
	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/articleAjouter.jsp");
		view.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String titre_Article = request.getParameter("titre"); 
		String photoPresentation_Article = request.getParameter("photoPresentation"); 
		String textePresentation_Article = request.getParameter("textePresentation");
		String photo_Article = request.getParameter("photo");
		String texte_Article = request.getParameter("input"); 
		String date_Article = request.getParameter("date"); 
		String categorie_Article = request.getParameter("categorie");
		String langue_Article = "fr";

		Article nouvelArticle = new Article(null, titre_Article, photoPresentation_Article,
				textePresentation_Article, photo_Article, texte_Article,
				date_Article, categorie_Article, langue_Article);
		HeliosManager.getInstance().ajouterArticle(nouvelArticle);

		response.sendRedirect("article");

	}

}
