// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/** 
 * className: LoggerAspect<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Component
@Aspect
public class LoggerAspect {

	private static final Logger log = LoggerFactory.getLogger(LoggerAspect.class);
	
	@Pointcut("execution(* com.mmc.transaction.system.spring.service..*(..))")
	public void serviceLog(){
		
	}
	
	@Around("serviceLog()")
	public Object serviceAspect(ProceedingJoinPoint pjp) throws Throwable {
		String simpleName = pjp.getTarget().getClass().getSimpleName();
		log.info("{} start.........", simpleName);
		long start = System.currentTimeMillis();
		Object obj = pjp.proceed();
		long end = System.currentTimeMillis();
		log.info("{} end.........cost time {}ms", simpleName, (end - start));
		return obj;
	}
}
