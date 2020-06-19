package com.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Aspect
@Component
public class ExecutionTimeTrackerAdvice {
	@Around("@annotation(com.annotation.TrackeExecutionTime)")
	public Object trackTimeTaken(ProceedingJoinPoint pjp) throws Throwable {
		long startTime = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long endTime = System.currentTimeMillis();
		log.info("Method name " + pjp.getSignature() + " ,time taken to execute:" + (endTime - startTime));
		return obj;
	}
}
