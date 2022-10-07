package com.app.lokesh.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.app.lokesh.DatabaseCon;

@Configuration
@Component
public class AppConfig {
	@Bean
	public DatabaseCon con() {
		DatabaseCon con = new DatabaseCon();
		con.setDriver("oracle");
		con.setUrl("jdbc:oracle");
		return con;
	}
}
