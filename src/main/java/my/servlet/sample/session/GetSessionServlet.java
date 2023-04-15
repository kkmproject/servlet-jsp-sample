package my.servlet.sample.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/getsessionservlet")
public class GetSessionServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession httpSession = req.getSession();
		
		String sessionValue = (String)httpSession.getAttribute("test_session");
		if (sessionValue != null) {
			String printformat = "key=%s : value=%s";
			System.out.println(String.format(printformat, "test_session", sessionValue));
			
			// remove session
			httpSession.invalidate();
		}
	}
}
