package com.vimal.logger.sink;

import com.vimal.logger.log.LogLevel;

public abstract class SinkInitializationContext {
	private LogLevel logLevel;

	public SinkInitializationContext(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	@Override
	public String toString() {
		return "SinkInitializationContext [logLevel=" + logLevel + "]";
	}
	
	
}
