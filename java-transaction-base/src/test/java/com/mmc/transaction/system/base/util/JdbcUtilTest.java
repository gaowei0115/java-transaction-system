// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.util;

import org.junit.Test;

/** 
 * className: JdbcUtilTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class JdbcUtilTest {

	@Test
	public void test() {
		System.out.println(DataBaseUtils.getConnection());
	}
}
