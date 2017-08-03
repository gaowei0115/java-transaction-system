// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.proxy.cglib.hello;

import net.sf.cglib.core.DebuggingClassWriter;

/** 
 * className: HelloCglibSayMain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月3日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class HelloCglibSayMain {

	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D:\\code");
		HelloCglibSayProxy cglibSayProxy = new HelloCglibSayProxy();
		HelloCglibSay helloCglibSay = (HelloCglibSay) cglibSayProxy.getProxy(HelloCglibSay.class);
		helloCglibSay.say("hello");
	}
}
