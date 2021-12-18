package com.vimal.logger.log;

public class LogRecord {
	
	private LogLevel logLevel;
	private Message message;
	
	public LogRecord(LogLevel logLevel, Message mes, Message message) {
		super();
		this.logLevel = logLevel;
		this.message = message;
	}

	public LogLevel getLogLevel() {
		return logLevel;
	}

	public void setLogLevel(LogLevel logLevel) {
		this.logLevel = logLevel;
	}

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "LogRecord [logLevel=" + logLevel + ", message=" + message + "]";
	}
	
}
