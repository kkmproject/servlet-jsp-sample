package my.servlet.sample.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class RequestSampleListener implements ServletRequestListener{
	public RequestSampleListener() {
		System.out.println("RequestSampleListener constructor");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("RequestSampleListener initialized");
	}
	
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("RequestSampleListener destroyed");
	}
}
