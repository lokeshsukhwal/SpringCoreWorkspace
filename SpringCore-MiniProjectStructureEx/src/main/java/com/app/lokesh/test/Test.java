package com.app.lokesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.lokesh.config.AppConfig;
import com.app.lokesh.controller.EmpController;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmpController controller = context.getBean("empController", EmpController.class);
		controller.getInfo();
	}
}
