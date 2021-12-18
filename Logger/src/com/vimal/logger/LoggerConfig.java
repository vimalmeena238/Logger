package com.vimal.logger;
import java.util.ArrayList;
import java.util.List;

import com.vimal.logger.sink.Sink;

public class LoggerConfig {
	private String applicationName;
	private String namespace;
	private List<Sink> sinks;
	
	public LoggerConfig(String applicationName, String namespace, List<Sink> sinks) {
		super();
		this.applicationName = applicationName;
		this.namespace = namespace;
		this.sinks = sinks;
	}
	
	public LoggerConfig(String applicationName, String namespace) {
		this.applicationName = applicationName;
		this.namespace = namespace;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public List<Sink> getSinks() {
		return sinks;
	}

	public void setSinks(List<Sink> sinks) {
		this.sinks = sinks;
	}
	
	public void addSink(Sink sink) {
		if(this.sinks == null) {
			this.sinks = new ArrayList<>();
		}
		
		this.sinks.add(sink);
	}
	
	
}
