package my.servlet.sample.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName="AnnotatedFilter", urlPatterns = "/*", initParams = @WebInitParam(name="sampleKey", value="sampleValue"))
public class AnnotatedFilter implements Filter{
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		String sampleValue = filterConfig.getInitParameter("sampleKey");
		System.out.println("AnnotatedFilter init sampleValue=" + sampleValue);
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("AnnotatedFilter doFilter");
		
		// chain
		chain.doFilter(request, response);
	}
}
