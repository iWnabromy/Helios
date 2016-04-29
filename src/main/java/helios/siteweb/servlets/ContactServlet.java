package helios.siteweb.servlets;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;

@WebServlet("/galerie")

public class ContactServlet extends HttpServlet {

	private static final long serialVersionUID = 6880801727716084460L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		RequestDispatcher view = request.getRequestDispatcher("WEB-INF/galerie.jsp");
		view.forward(request, response);
	}

	//default value for mail server address, in case the user
	//doesn't provide one
	private final static String DEFAULT_SERVER = "mail.attbi.com";

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, java.io.IOException {

		String smtpServ = DEFAULT_SERVER;

		String from = request.getParameter("email"); 

		String to = "romain.bondois@hei.com";

		String subject = "[Helios-solarteam.rhcloud.com]";

		String emailContent = request.getParameter("message"); 

		response.setContentType("text/html");
		java.io.PrintWriter out = response.getWriter();

		try {

			sendMessage(smtpServ, to, from, subject, emailContent);

		} catch (Exception e) {

			throw new ServletException(e.getMessage());

		}

	} //doPost

	private void sendMessage(String smtpServer, String to, String from,
			String subject, String emailContent) throws Exception {

		Properties properties = System.getProperties();

		//populate the 'Properties' object with the mail
		//server address, so that the default 'Session'
		//instance can use it.
		properties.put("mail.smtp.host", smtpServer);

		Session session = Session.getDefaultInstance(properties);

		Message mailMsg = new MimeMessage(session);//a new email message

		InternetAddress[] addresses = null;

		try {

			if (to != null) {

				//throws 'AddressException' if the 'to' email address
				//violates RFC822 syntax
				addresses = InternetAddress.parse(to, false);

				mailMsg.setRecipients(Message.RecipientType.TO, addresses);

			} else {

				throw new MessagingException(
						"The mail message requires a 'To' address.");

			}

			if (from != null) {

				mailMsg.setFrom(new InternetAddress(from));

			} else {

				throw new MessagingException(
						"The mail message requires a valid 'From' address.");

			}

			if (subject != null)
				mailMsg.setSubject(subject);

			if (emailContent != null)
				mailMsg.setText(emailContent);

			//Finally, send the meail message; throws a 'SendFailedException'
			//if any of the message's recipients have an invalid adress
			Transport.send(mailMsg);

		} catch (Exception exc) {

			throw exc;

		}

	}//sendMessage

}//EmailServlet


