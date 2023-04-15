package my.servlet.sample.listener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class HttpSessionAttributeSampleListener implements HttpSessionAttributeListener{
	public HttpSessionAttributeSampleListener() {
		System.out.println("HttpSessionAttributeSampleListener constructor");
	}
	
	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		System.out.println("HttpSessionAttributeSampleListener added");
	}
	
	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		System.out.println("HttpSessionAttributeSampleListener removed");
	}
	
	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		System.out.println("HttpSessionAttributeSampleListener replaced");
	}
}
