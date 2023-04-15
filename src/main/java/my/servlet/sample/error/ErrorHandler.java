package my.servlet.sample.error;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/errorHandler")
public class ErrorHandler extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer code = (Integer)req.getAttribute("javax.servlet.error.status_code");
		String message = (String)req.getAttribute("javax.servlet.error.message");
		Object type = req.getAttribute("javax.servlet.error.exception");
		Throwable exception = (Throwable)req.getAttribute("javax.servlet.error.exception");
		String uri = (String)req.getAttribute("javax.servlet.error.request_uri");
	}
}
