// Copyright (C) 2016-2017 GWGW All rights reserved
package com.mmc.transaction.system.spring.base;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.dao.UserInfoDao;

/** 
 * ClassName: ApplicationContextTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * Create： 2017年8月1日<br/>
 *
 * History: (Version) Author dateTime description <br/>
 */
public class ApplicationContextTest extends BaseTest {

	@Autowired
	private UserInfoDao userInfoDao;
	
	@Test
	public void test() {
		System.out.println(userInfoDao);
	}
}
