package com.app.lokesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import com.app.lokesh.DatabaseCon;
import com.app.lokesh.config.AppConfig;

@Component
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		DatabaseCon connnectionCon = context.getBean("con",DatabaseCon.class);
		System.out.println(connnectionCon);
	}
}
