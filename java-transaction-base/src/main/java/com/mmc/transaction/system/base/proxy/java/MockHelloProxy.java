// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.mmc.transaction.system.base.proxy.java.impl.RealHelloProxy;

/** 
 * className: MockHelloProxy<br/>
 * Description: 代理类<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月2日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class MockHelloProxy implements InvocationHandler {

	// 真实代理对象
	private Object proxyObject;
	
	public MockHelloProxy() {
		
	}
	
	/**
	 * 参数：
	 * proxy:代理目标类
	 * Method:代理方法
	 * args:代理方法入参
	 */
	/* (non-Javadoc)
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		return null;
	}

}
