package my.servlet.sample.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextSampleListener implements ServletContextListener{
	
	public ServletContextSampleListener() {
		System.out.println("ServletContextSampleListener constructor");
	}
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContextSampleListener initialized");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("ServletContextSampleListener destoryed");
	}
}
