package my.servlet.sample.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionSampleListener implements HttpSessionListener{
	public HttpSessionSampleListener() {
		System.out.println("HttpSessionSampleListener contructor");
	}
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("HttpSessionSampleListener created");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("HttpSessionSampleListener destoryed");
	}
}
