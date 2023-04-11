package my.servlet.sample.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/encodingservlet")
public class EncodingServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("EncodingServlet service method");

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("한글출력");
		printWriter.close();
	}
}
