package my.servlet.sample.request;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/includerequestdispatcherservlet")
public class IncludeRequestDispatcherServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = this.getServletContext();
		RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/includedrequestdispatcherservlet");
		requestDispatcher.include(req, resp);
	}
}
