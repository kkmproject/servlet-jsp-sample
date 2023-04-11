package my.servlet.sample.response;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/responseservlet")
public class ResponseServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("ResponseServlet service method");
		
		// 1byte ~OutputStream, ~InputStream
		ServletOutputStream servletOutputStream = resp.getOutputStream();
		servletOutputStream.print("ServletOutputStream test");
		servletOutputStream.close();
		
		// 2byte ~Writer, ~Reader
		/*
		PrintWriter printWriter = resp.getWriter();
		printWriter.print("PrintWriter test");
		printWriter.close();
		*/
	}
}
