package my.servlet.sample.request;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/fromrequestdispatcherservlet")
public class FromRequestDispatcharServlet extends HttpServlet {
	private void doget() {
		System.out.println("ToRequestDispatchserServlet to FromRequestDispatcherServlet");
	}
}
