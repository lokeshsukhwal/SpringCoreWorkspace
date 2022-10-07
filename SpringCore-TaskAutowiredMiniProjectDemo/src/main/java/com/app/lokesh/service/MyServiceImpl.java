package com.app.lokesh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.lokesh.dao.IMyDao;

@Component
public class MyServiceImpl implements IMyService {
	@Autowired
	private IMyDao dao;

	@Override
	public String toString() {
		return "MyServiceImpl [dao=" + dao + "]";
	}

}
