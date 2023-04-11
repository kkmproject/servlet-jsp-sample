package my.servlet.sample.request;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/requestservlet")
public class RequestServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<h1>request method and protocol</h1><br/>");
		out.print("Request Scheme : " + req.getScheme() + "<br/>");
		out.print("Server Name : " + req.getServerName() + "<br/>");
		out.print("Server Address : " + req.getLocalAddr() + "<br/>");
		out.print("Server Port : " + req.getServerPort() + "<br/>");
		out.print("Client Address : " + req.getRemoteAddr() + "<br/>");
		out.print("Client Host : " + req.getRemoteHost() + "<br/>");
		out.print("Client Port : " + req.getRemotePort() + "<br/>");
		out.print("<br/>");
		
		out.print("<h1>request header</h1><br/>");
		String elementFormat = "%s : %s<br/>";
		Enumeration<String> enumeration = req.getHeaderNames();
		while (enumeration.hasMoreElements()) {
			String elementName = enumeration.nextElement();
			out.print(String.format(elementFormat, elementName, req.getHeader(elementName)));
		}
		out.print("<br/>");
		
		out.print("<h1>Addtional info</h1><br/>");
		out.print("Request Method : " + req.getMethod() + "<br/>");
		out.print("Path Info : " + req.getPathInfo() + "<br/>");
		out.print("Path Translated : " + req.getPathTranslated() + "<br/>");
		out.print("Query String : " + req.getQueryString() + "<br/>");
		out.print("Content Length : " + req.getContentLength() + "<br/>");
		out.print("Content Type : " + req.getContentType() + "<br/>");
		out.print("</body></html>");
		
		out.close();
	}
}
