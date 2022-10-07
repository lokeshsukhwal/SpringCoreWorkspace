package com.app.lokesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseConnection connection = context.getBean("databaseConnection", DatabaseConnection.class);
		System.out.println(connection);
	}
}
