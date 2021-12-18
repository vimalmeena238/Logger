# Logger
Logger library that can be imported to log messages by any application.

## Requirements
1. Client/Application uses library to log messages to a sink.
2. Message has content of type string. Log level is associated with the Message.
3. library should support messages logging level in order of priority : FATAL, ERROR, WARN, INFO, DEBUG.
4. Sink is the destination for the message ( eg. text file, console, database etc.)
5. Sink can be configured to log all messages of levels above a specified level, for eg if log level for sink is set to INFO then FATAL, ERROR, WARN, INFO all should be logged.
6. For performance purpose application can have single instance of Logger (singleton pattern).

## Class Diagram
![Logger drawio](https://user-images.githubusercontent.com/16173594/146655837-11ddca97-a561-4124-88a1-134f593b4624.png)

## Future Work
1. Add configuration option for multiThreading Policy to log simultaniously in multiple sinks.
2. Client/Application can push messages at very high rate as well, so need to explore async logging.
