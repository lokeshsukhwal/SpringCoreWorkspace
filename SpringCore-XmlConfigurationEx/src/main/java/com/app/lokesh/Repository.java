package com.app.lokesh;

public class Repository {
	private String entity;

	public Repository() {
		super();
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getEntity() {
		return entity;
	}

	@Override
	public String toString() {
		return "Repository [entity=" + entity + "]";
	}

}
