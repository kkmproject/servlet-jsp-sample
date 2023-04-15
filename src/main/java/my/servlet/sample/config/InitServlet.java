package my.servlet.sample.config;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet{
	
	private String environment;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		this.environment = config.getInitParameter("environment");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("environment: " + environment);
		
		// or
		// - HttpServlet extends GenericServlet
		// - GenericServlet implements ServletConfig
		// if not Override init method:
		// System.out.println("environment: " + this.getInitParameter("environment"));
	}
}
