package com.vimal.logger.sink;

import com.vimal.logger.log.LogLevel;

public class TextFileSinkInitializationContext extends SinkInitializationContext {
	
	private String directory;
	private String fileName;
	
	public TextFileSinkInitializationContext(LogLevel logLevel, String directory, String fileName) {
		super(logLevel);
		this.directory = directory;
		this.fileName = fileName;
	}

	public String getDirectory() {
		return directory;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
}
