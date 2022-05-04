package com.edu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext actx= new AnnotationConfigApplicationContext(ApplicationConfig.class);
		Samsung sob=actx.getBean(Samsung.class);
		sob.MobileConfig();
		
		

	}

}
