package helios.siteweb.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import helios.siteweb.dao.SendMail;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

@WebServlet("/contact")

public class ContactServlet extends HttpServlet {

	private static final long serialVersionUID = 6880801727716084460L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/contact.jsp");
		view.forward(request, response);
	}

	//default value for mail server address, in case the user
	//doesn't provide one


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {
		
		 response.setContentType("text/html;charset=UTF-8");
	        String subject = "[Helios-solarteam.rhcloud.com]";
	        
	        String to = "romain.bondois@hei.com";
	        String message =  request.getParameter("message");
	        String user = request.getParameter("email");
	        String pass = request.getParameter("pass");
	        SendMail.send(to,subject, message, user, pass);
	        
	        RequestDispatcher view = request.getRequestDispatcher("WEB-INF/contact.jsp");
			view.forward(request, response);
		
		
		/*String from = request.getParameter("email"); 
		
		
		
		
		String messagecomplet = from+" vous a envoyé un message : "+message;


		String to = "romain.bondois@hei.com";*/

		try {

			//sendMessage(smtpServ, to, from, subject, emailContent);

		} catch (Exception e) {

			throw new ServletException(e.getMessage());

		}

	}
}

	