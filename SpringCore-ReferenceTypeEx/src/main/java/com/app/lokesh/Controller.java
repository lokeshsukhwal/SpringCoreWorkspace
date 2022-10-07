package com.app.lokesh;

public class Controller {
	private Service service;

	public Controller() {
		super();
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Controller [service=" + service + "]";
	}

}
