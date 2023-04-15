package my.servlet.sample.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("FlowFilter init");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("prev FlowFilter doFilter");
		// chain
		chain.doFilter(request, response);
		System.out.println("post FlowFilter doFilter");
	}
	
	@Override
	public void destroy() {
		System.out.println("FlowFilter destory");
	}
}
