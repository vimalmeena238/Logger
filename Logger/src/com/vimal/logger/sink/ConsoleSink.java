package com.vimal.logger.sink;

import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.LogRecord;
import com.vimal.logger.log.Message;

public class ConsoleSink implements Sink {
	
	private ConsoleSinkInitializationContext context;
	
	public ConsoleSink(ConsoleSinkInitializationContext context) {
		this.context = context;
	}

	@Override
	public void writeMessage(LogLevel level, Message message) {
		if(level.getValue() >= this.context.getLogLevel().getValue()) {
			System.out.println(level.toString() + " " + message.getContent());
		}
		
	}

	@Override
	public void writeLogRecord(LogRecord logRecord) {
		// TODO Auto-generated method stub
		this.writeMessage(logRecord.getLogLevel(), logRecord.getMessage());
	}

}
