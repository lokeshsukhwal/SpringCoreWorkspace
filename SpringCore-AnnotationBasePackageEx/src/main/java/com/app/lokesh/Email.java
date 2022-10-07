package com.app.lokesh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Email {
	@Value("8080")
	private Integer port;
	@Value("gmail")
	private String host;

	public Email() {
		super();
	}

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	@Override
	public String toString() {
		return "EmailConfiguration [port=" + port + ", host=" + host + "]";
	}

}
