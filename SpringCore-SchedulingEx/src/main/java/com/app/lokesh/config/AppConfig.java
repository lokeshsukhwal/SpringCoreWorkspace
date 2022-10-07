package com.app.lokesh.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan(basePackages = "com.app.lokesh")
@EnableScheduling
public class AppConfig {

}
