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


@WebServlet("/admin/article")
public class ArticleAdminServlet  extends HttpServlet {
	
	private static final long serialVersionUID = 6880801727716084460L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<Article> articles = HeliosManager.getInstance().getArticle();
		request.setAttribute("listeArticles", articles);


		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/article.jsp");
		view.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		String id_Article1 =request.getParameter("id");
		Integer id_Article =Integer.parseInt(id_Article1);
		

			HeliosManager.getInstance().supprimerArticle(id_Article);

			response.sendRedirect("article");
		
	}



}
