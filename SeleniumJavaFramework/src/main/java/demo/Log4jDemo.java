package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Loader;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;

public class Log4jDemo {
	
        private static Logger logger = LogManager.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		logger.trace("trace message");
		
		logger.info("Info  message");
		logger.error("error  message");
		logger.warn("warn  message");
		logger.fatal("fatal  message");
		
		System.out.println("completed");

	}

}
