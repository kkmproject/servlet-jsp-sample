package my.servlet.sample.servletcontext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servletcontextservlet")
public class ServletContextServlet extends HttpServlet {

	private ServletContext servletContext;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		servletContext = config.getServletContext();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// System.out.println("servletContext id  : " + servletContext);
		
		// get shared attribute at ServletContext.context-param
		System.out.println("servletContext.env : " + servletContext.getInitParameter("servletContext.env"));
		
		// set share attribute for this application
		servletContext.setAttribute("shared attribute", "shared attribute value");
		
		// get shared attribute for this application
		String sharedAttribute = (String)servletContext.getAttribute("shared attribute");
		System.out.println("sharedAttribute: " + sharedAttribute);
	}
}
