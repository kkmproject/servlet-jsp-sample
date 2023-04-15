package my.servlet.sample.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getcookieservlet")
public class GetCookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie[] cookies = req.getCookies();
		Cookie testCookie = null;
		for (Cookie cookie : req.getCookies()) {
			if (cookie.getName().equalsIgnoreCase("test_cookie")) {
				testCookie = cookie;
				break;
			}
		}
		
		if (testCookie != null) {
			String printformat = "key=%s : value=%s";
			System.out.println(String.format(printformat, testCookie.getName(), testCookie.getValue()));
			testCookie.setMaxAge(0);	
		}
	}
}
