// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.datasource;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;

/** 
 * className: DataSourceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DataSourceTest extends BaseTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void test() {
		System.out.println(dataSource);
	}
}
