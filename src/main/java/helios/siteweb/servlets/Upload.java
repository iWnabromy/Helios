package helios.siteweb.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/admin/upload")
@MultipartConfig(location = "/var/lib/openshift/57220db87628e1cd5800005e/app-root/data")
public class Upload extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		getServletContext().getRequestDispatcher("/WEB-INF/Admin/form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Collection<Part> parts = request.getParts();

		out.write("<h2> Total parts : " + parts.size() + "</h2>");

		for (Part part : parts) {
			printEachPart(part, out);
			part.write(getFileName(part));
		}
		RequestDispatcher view = request.getRequestDispatcher("../WEB-INF/Admin/administration.jsp");
		view.forward(request, response);
	}

	private void printEachPart(Part part, PrintWriter pw) {
		StringBuffer sb = new StringBuffer();
		sb.append("<p>");
		sb.append("Name : " + part.getName());
		sb.append("<br>");
		sb.append("Content Type : " + part.getContentType());
		sb.append("<br>");
		sb.append("Size : " + part.getSize());
		sb.append("<br>");
		for (String header : part.getHeaderNames()) {
			sb.append(header + " : " + part.getHeader(header));
			sb.append("<br>");
		}
		sb.append("</p>");
		pw.write(sb.toString());

	}

	private String getFileName(Part part) {
		String partHeader = part.getHeader("content-disposition");
		for (String cd : partHeader.split(";")) {
			if (cd.trim().startsWith("filename")) {
				return cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
			}
		}
		return null;
	}
}