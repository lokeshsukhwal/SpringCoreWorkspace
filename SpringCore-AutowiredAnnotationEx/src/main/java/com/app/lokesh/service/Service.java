package com.app.lokesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lokesh.repository.Repository;

@Component
public class Service {
//	@Autowired(required = false) to Hold null value
	@Autowired
	private Repository repository; // HAS-A

	@Override
	public String toString() {
		return "Service [repository=" + repository + "]";
	}

}