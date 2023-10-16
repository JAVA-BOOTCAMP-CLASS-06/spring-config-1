package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.MessageBean;
import bo.SampleBO;
import spring.AppConfig;

public class App {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();

		SampleBO bo = ac.getBean(SampleBO.class);
		
		MessageBean msg = bo.processData();
		
		System.out.println(msg);
		
		ac.close();
	}

}
