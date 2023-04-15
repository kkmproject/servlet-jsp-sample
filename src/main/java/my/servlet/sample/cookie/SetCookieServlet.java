package my.servlet.sample.cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/setcookieservlet")
public class SetCookieServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie = new Cookie("test_cookie", "test_cookie_value");
		// 60 seconds. if setMaxAge(0) : remove cookie
		cookie.setMaxAge(60);
		cookie.setPath("/");
		
		resp.addCookie(cookie);
	}
}
