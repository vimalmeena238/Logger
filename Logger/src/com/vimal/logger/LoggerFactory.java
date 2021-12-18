package com.vimal.logger;

public class LoggerFactory {
	private static Logger logger;
	
	private LoggerFactory() {
		
	}
	
	public static Logger getLogger(LoggerConfig config) {
		if(LoggerFactory.logger == null) {
			LoggerFactory.logger = new LoggerImpl(config);
		}
		
		return LoggerFactory.logger;
	}
}
