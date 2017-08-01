// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base;

import java.util.HashMap;
import java.util.Map;

/** 
 * className: PhoneNumberCollectionTest<br/>
 * Description: 针对没有复写hashCode方法的PhoneNumber集合保存测试<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class PhoneNumberCollectionTest {

	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneNumber pn = new PhoneNumber(101, 1121, 63541);
		Map<PhoneNumber, String> map = new HashMap<PhoneNumber, String>();
		map.put(pn, "number01");
		System.out.println(map.get(pn));
		
		System.out.println(map.get(new PhoneNumber(101, 1121, 63541)));
	}
}
