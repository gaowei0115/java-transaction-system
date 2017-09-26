// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.mapper;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.EodFileDomain;
import com.mmc.transaction.system.spring.mapper.EodFileMapper;

/** 
 * className: EodFileMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class EodFileMapperTest extends BaseTest{

	@Autowired
	private EodFileMapper eodFileMapper;
	
	@Test
	public void test() {
		EodFileDomain domain = new EodFileDomain();
		domain.setBusiDate("20170203");
		domain.setBusiStatus("1");
		domain.setBeginDate(new Date());
		domain.setEndDate(new Date());
		eodFileMapper.insertEodFile(domain);
	}
	
	@Test
	public void testBatch() {
		long start = System.currentTimeMillis();
		List<EodFileDomain> list = new ArrayList<EodFileDomain>();
		for (int i = 0; i < 10000; i++){
			EodFileDomain domain = new EodFileDomain();
			domain.setBusiDate("20170203");
			domain.setBusiStatus("1");
			domain.setBeginDate(new Date());
			domain.setEndDate(new Date());
			list.add(domain);
		}
		eodFileMapper.batchInsertEodFile(list);
		long end = System.currentTimeMillis();
		System.out.println("执行批量耗时：" + (end - start) + "ms");
	}
}
