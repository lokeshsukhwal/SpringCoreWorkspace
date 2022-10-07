package com.app.lokesh.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Repository {
	@Value("entityValue")
	private String entity;

	@Override
	public String toString() {
		return "Service [entity=" + entity + "]";
	}
}
