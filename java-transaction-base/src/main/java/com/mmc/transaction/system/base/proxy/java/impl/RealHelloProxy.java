// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.proxy.java.impl;

import com.mmc.transaction.system.base.proxy.java.HelloProxy;

/** 
 * className: RealHelloProxy<br/>
 * Description: 目录实现类<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月2日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class RealHelloProxy implements HelloProxy {

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.base.proxy.java.HelloProxy#helloProxy(java.lang.String)
	 */
	public String helloProxy(String param) {
		System.out.println(param + "hello proxy ");
		return "success";
	}

}
