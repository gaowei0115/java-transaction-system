// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base;

import org.junit.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * className: BaseRunTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class BaseRunTest {

	protected volatile static boolean isRuning = true;
	protected static Logger log = LoggerFactory.getLogger(BaseRunTest.class);
	
	@Before
	public void setUp() {
		log.debug("服务启动................");
		@SuppressWarnings({ "unused", "resource"})
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	}
	
	public static void stop() {
		isRuning = false;
	}
}
