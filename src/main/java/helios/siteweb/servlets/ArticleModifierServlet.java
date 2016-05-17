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

@WebServlet("/admin/articlemodifier")
public class ArticleModifierServlet extends HttpServlet{
	
	private static final long serialVersionUID = 4667046972882137986L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		try {
			Integer id = Integer.parseInt(request.getParameter("id"));
			Article article = HeliosManager.getInstance().getArticle(id);
			request.setAttribute("article", article);

			RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/articleModifier.jsp");
			view.forward(request, response);
		} catch (NumberFormatException e) {
			response.sendRedirect("admin/article");
		}
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id_Article1 =request.getParameter("id");
		Integer id_Article =Integer.parseInt(id_Article1);
		String titre_Article = request.getParameter("titre"); 
		String photoPresentation_Article = request.getParameter("photoPresentation"); 
		String textePresentation_Article = request.getParameter("textePresentation");
		String photo_Article = request.getParameter("photo");
		String texte_Article = request.getParameter("input"); 
		String date_Article = request.getParameter("date"); 
		String categorie_Article = request.getParameter("categorie");
		String langue_Article = "fr";

		Article nouvelArticle = new Article(id_Article, titre_Article, photoPresentation_Article,
				textePresentation_Article, photo_Article, texte_Article,
				date_Article, categorie_Article, langue_Article);
		HeliosManager.getInstance().modifierArticle(nouvelArticle);

		response.sendRedirect("article");
		
	}

}
