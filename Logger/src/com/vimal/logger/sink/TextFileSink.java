package com.vimal.logger.sink;

import java.io.File;
import java.io.PrintWriter;

import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.LogRecord;
import com.vimal.logger.log.Message;

public class TextFileSink implements Sink {

	private TextFileSinkInitializationContext context;
	private PrintWriter printWriter;
	
	public TextFileSink(TextFileSinkInitializationContext context) {
		this.context = context;
		this.initSink();
	}
	
	public void initSink() {
		try {
			File textFile = new File(this.context.getDirectory(), this.context.getFileName());
			
			if(!textFile.exists()) {
				textFile.createNewFile();
			}
			
			this.printWriter = new PrintWriter(textFile);
		}
		catch (Exception e) {
			throw new RuntimeException("Initialization of text file failed. " + e.getMessage());
		}
	}
	
	@Override
	public void writeMessage(LogLevel level, Message message) {
		if(level.getValue() >= this.context.getLogLevel().getValue()) {
			this.printWriter.println(level.toString() + message.getContent());
			this.printWriter.flush();
		}
	}

	@Override
	public void writeLogRecord(LogRecord logRecord) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Closing the text file.");
		this.printWriter.close();
	}

	
}
