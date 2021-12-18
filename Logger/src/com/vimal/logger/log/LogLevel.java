package com.vimal.logger.log;

public enum LogLevel {
	FATAL(6),
	ERROR(5),
	WARN(4),
	INFO(3),
	DEBUG(2);
	
	private int value;
	
	private LogLevel(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
