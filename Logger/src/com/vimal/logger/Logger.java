package com.vimal.logger;

import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.Message;

public interface Logger {
	public void log(LogLevel logLevel, Message message);
}
