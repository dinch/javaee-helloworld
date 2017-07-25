package helloworld.bean;

import javax.inject.Named;

@Named
public class HelloWorld {
	
	public String getTitle() {
		return "CI/CD Demo";
	}

	public String sayHello() {
		return "Hello World!";
	}
	
	public long getCurrentTimeMillis() {
		return System.currentTimeMillis();
	}
	
}
