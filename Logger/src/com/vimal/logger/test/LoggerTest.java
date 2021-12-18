package com.vimal.logger.test;

import com.vimal.logger.*;
import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.Message;
import com.vimal.logger.sink.ConsoleSink;
import com.vimal.logger.sink.ConsoleSinkInitializationContext;
import com.vimal.logger.sink.TextFileSink;
import com.vimal.logger.sink.TextFileSinkInitializationContext;

public class LoggerTest {
	
	private static Logger myLogger;
	
	public static void foo() {
		for(int i = 0; i < 10; i++) {
			myLogger.log(LogLevel.DEBUG, new Message(" Debug print from Foo" + i));
			myLogger.log(LogLevel.FATAL, new Message(" Debug print from Foo" + i));
			myLogger.log(LogLevel.INFO, new Message(" Debug print from Foo" + i));
		}
	}
	
	public static void bar() {
		for(int i = 0; i < 10; i++) {
			myLogger.log(LogLevel.INFO, new Message(" warn print from Bar" + i));
			myLogger.log(LogLevel.WARN, new Message(" warn print from Bar" + i));
		}
	}
	
	public static void main(String[] args) {
		
		LoggerConfig myConfig = new LoggerConfig("LoggerTest", "com.vimal.logger.test");
		myConfig.addSink(new ConsoleSink(new ConsoleSinkInitializationContext(LogLevel.INFO)));
		myConfig.addSink(new TextFileSink(new TextFileSinkInitializationContext(LogLevel.WARN, "C:\\Users\\vimal\\Downloads\\", "textSinkLogs.txt")));
		
		myLogger = LoggerFactory.getLogger(myConfig);
		
		
		foo();
		bar();
	}
}
