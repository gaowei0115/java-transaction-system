// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.EodFileDomain;
import com.mmc.transaction.system.spring.service.EodFileService;

/** 
 * className: EodFileServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class EodFileServiceTest extends BaseTest {

	@Autowired
	private EodFileService eodFileService;
	
	private List<EodFileDomain> list = new ArrayList<EodFileDomain>();
	
	@Before
	public void setUp() {
		for (int i = 0; i < 1; i++){
			EodFileDomain domain = new EodFileDomain();
			domain.setBusiDate("20170203");
			domain.setBusiStatus("1");
			domain.setBeginDate(new Date());
			domain.setEndDate(new Date());
			list.add(domain);
		}
	}
	
	@Test
	public void test() {
		//9930ms
		eodFileService.batchSave(list);
		
		eodFileService.batchSave(list);
	}
	
	@Test
	public void test01() {
		//41129ms
		eodFileService.batchSave1(list);
	}
}
