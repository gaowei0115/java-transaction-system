// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.proxy.cglib.hello;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/** 
 * className: HelloCglibSayProxy<br/>
 * Description: cglib动态代理类<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月3日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class HelloCglibSayProxy implements MethodInterceptor{

	// 动态代理增强
	private final Enhancer enhancer = new Enhancer();
	
	/**
	 * Description：创建代理对象<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param clazz
	 * @return
	 */
	public Object getProxy(Class<?> clazz) {
		// 设置要创建子类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		// 通过字节码技术动态创建子类实例
		return enhancer.create();
	}
	
	/**
	 * 继承MethodInterceptor接口
	 * 复写intercept方法
	 * object：代理目标类
	 * method：代理目标方法
	 * args：代理目标方法入参
	 * proxy：代理类
	 * 
	 */
	/* (non-Javadoc)
	 * @see net.sf.cglib.proxy.MethodInterceptor#intercept(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], net.sf.cglib.proxy.MethodProxy)
	 */
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("proxy before process....");
		// 此处一定要使用proxy的invokeSuper调用目标类的方法
		proxy.invokeSuper(obj, args);
		System.out.println("proxy after process....");
		return null;
	}

}
