package my.servlet.sample.query;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryservlet")
public class QueryServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		
		Map<String, String> queryMap = new HashMap<>();
		
		String inputForm = req.getParameter("inputForm");
		queryMap.put("inputForm", inputForm);
		String passwordForm = req.getParameter("passwordForm");
		queryMap.put("passwordForm", passwordForm);
		String checkForm = req.getParameter("checkForm");
		queryMap.put("checkForm", checkForm);
		String selectForm = req.getParameter("selectForm");
		queryMap.put("selectForm", selectForm);
		String textareaForm = req.getParameter("textareaForm");
		queryMap.put("textareaForm", textareaForm);
		
		String printformat = "key=%s : value=%s";
		for (String key : queryMap.keySet()) {
			System.out.println(String.format(printformat, key, queryMap.get(key)));
		}
	}
	
}
