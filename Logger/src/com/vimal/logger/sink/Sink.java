package com.vimal.logger.sink;

import com.vimal.logger.log.LogLevel;
import com.vimal.logger.log.LogRecord;
import com.vimal.logger.log.Message;

public interface Sink {
	public void writeMessage(LogLevel level, Message mssage);
	public void writeLogRecord(LogRecord logRecord);
}
