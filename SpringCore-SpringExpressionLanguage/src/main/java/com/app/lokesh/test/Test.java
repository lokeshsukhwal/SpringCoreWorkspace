package com.app.lokesh.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.lokesh.Progress;
import com.app.lokesh.config.AppConfig;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Progress progress = context.getBean("progress", Progress.class);
		System.out.println(progress);
	}
}
