package com.akash.utility;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	private static final Log logger=LogFactory.getLog(LoggingAspect.class);
	
	@AfterThrowing(pointcut = "execution(* com.akash.repository.*Impl.*(..))", throwing = "exception")
	public void logExceptionFromRepository(Exception exception){
		logger.error(exception.getMessage(),exception);
	}
	@AfterThrowing(pointcut = "execution(* com.akash.service.*Impl.*(..))", throwing = "exception")
	public void logExceptionFromService(Exception exception){
		logger.error(exception.getMessage(),exception);
	}
}