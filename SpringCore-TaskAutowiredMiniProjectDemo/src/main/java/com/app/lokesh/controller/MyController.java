package com.app.lokesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lokesh.service.IMyService;

@Component
public class MyController {
	@Autowired
	private IMyService service;

	@Override
	public String toString() {
		return "MyController [service=" + service + "]";
	}

}
