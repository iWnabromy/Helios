package helios.siteweb.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Filtre implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String identifiant = (String) httpRequest.getSession().getAttribute("utilisateurConnecte");
		if (identifiant == null || "".equals(identifiant)) {
			System.out.println("Il faut être connecté pour accéder à cette page !");
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.sendRedirect("../connexion");
			return;
		}
		chain.doFilter(request, response);

	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
