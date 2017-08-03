// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.transaction.system.base.proxy.java;

import java.lang.reflect.Proxy;

import com.mmc.transaction.system.base.proxy.java.impl.RealHelloProxy;

/** 
 * ClassName: ProxyMain<br/>
 * Description: proxy测试<br/>
 * Author: GW<br/>
 * Create： 2017年8月2日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class ProxyMain {

	public static void main(String[] args) {
		HelloProxy helloProxy = new RealHelloProxy();
		
		/*
		       实现了 InvocationHandler 接口，并能实现方法调用从代理类到委托类的分派转发 
        * 其内部通常包含指向委托类实例的引用，用于真正执行分派转发过来的方法调用. 
        * 即：要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法 
        */
		MockHelloProxy mockHelloProxy = new MockHelloProxy(helloProxy);
		
		ClassLoader classLoader = helloProxy.getClass().getClassLoader();
		Class<?>[] interfaces = helloProxy.getClass().getInterfaces();
		HelloProxy subject = (HelloProxy) Proxy.newProxyInstance(classLoader, interfaces, mockHelloProxy);
		System.out.println("代理对象：：：" + subject.getClass().getName());
		String result = subject.helloProxy("gw");
		System.out.println(result);
		
		
	}
}
