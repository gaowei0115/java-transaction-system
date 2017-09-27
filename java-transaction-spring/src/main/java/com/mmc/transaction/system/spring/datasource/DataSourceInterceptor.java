// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.datasource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/** 
 * className: DataSourceInterceptor<br/>
 * Description: 通过AOP指定datasource key<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Aspect
@Component
public class DataSourceInterceptor {
	
	private static final Logger log = LoggerFactory.getLogger(DataSourceInterceptor.class);

	@Pointcut("execution(* com.mmc.transaction.system.spring.service.mmcab.*.*.*(..))")
	public void dataSource01() {
		
	}
	
	@Pointcut("execution(* com.mmc.transaction.system.spring.service.impl.*.*(..))")
	private void dataSource02() {
		
	}
	
	@Before("dataSource01()")
    public void beforeDataSource1(JoinPoint jp) {
		log.debug("use datasource ........................{}", DataSourceType.DS_01.toString());
        DataSourceManager.set(DataSourceType.DS_01);
    }
	
	@Before("dataSource02()")
    public void doBefore(JoinPoint jp) {
		log.debug("use datasource ........................{}", DataSourceType.DS_02.toString());
        DataSourceManager.set(DataSourceType.DS_02);
    }
	
}
