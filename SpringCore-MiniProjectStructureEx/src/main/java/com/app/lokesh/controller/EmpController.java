package com.app.lokesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lokesh.service.IEmpService;

@Component
public class EmpController {
	@Autowired
	private IEmpService iEmpService;

	public void getInfo() {
		iEmpService.checkLogic();
		System.out.println("from getInfo(-) method");
	}

}
