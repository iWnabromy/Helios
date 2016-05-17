package helios.siteweb.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import helios.siteweb.metier.HeliosManager;
import helios.siteweb.model.Article;

@WebServlet("/categoriesAJAX")

public class CategorieAJAXServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		List<Article> listeCategorie = HeliosManager.getInstance().getCategorie();
		
		Gson gson = new Gson();
		String parametreJson = gson.toJson(listeCategorie);
		PrintWriter out = response.getWriter();
		out.append(parametreJson);
	}
	
}
