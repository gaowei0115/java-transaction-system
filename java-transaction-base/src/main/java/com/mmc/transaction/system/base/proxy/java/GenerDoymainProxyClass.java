// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.proxy.java;

import java.io.File;
import java.io.FileOutputStream;

/**
 * className: GenerDoymainProxyClass<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月3日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class GenerDoymainProxyClass {

	public static void main(String[] args) throws Exception {
		String proxyName = "ProxySubject$0";
		@SuppressWarnings("restriction")
		byte[] data = sun.misc.ProxyGenerator.generateProxyClass(proxyName, new Class[] { HelloProxy.class });
		@SuppressWarnings("resource")
		FileOutputStream fot = new FileOutputStream(proxyName + ".class");
		System.out.println(new File("hello").getAbsolutePath());
		fot.write(data);
	}
}
