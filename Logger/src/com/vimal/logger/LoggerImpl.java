package com.vimal.logger;

import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.Message;
import com.vimal.logger.sink.Sink;

public class LoggerImpl implements Logger {
	
	private LoggerConfig loggerConfig;
	
	public LoggerImpl(LoggerConfig loggerConfig) {
		this.loggerConfig = loggerConfig;
	}
	
	public LoggerConfig getLoggerConfig() {
		return this.loggerConfig;
	}
	
	@Override
	public void log(LogLevel logLevel, Message message) {
		for(Sink sink : this.loggerConfig.getSinks()) {
			sink.writeMessage(logLevel, message);
		}
	}

}
