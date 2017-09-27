// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmc.transaction.system.spring.domain.stu.CityDomain;
import com.mmc.transaction.system.spring.mapper.StuCityMapper;
import com.mmc.transaction.system.spring.service.stu.StuCityService;

/** 
 * className: StuCityServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("stuCityService")
public class StuCityServiceImpl implements StuCityService {

	private static final Logger log = LoggerFactory.getLogger(StuCityServiceImpl.class);
	
	@Autowired
	private StuCityMapper cityMapper;
	
	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCityService#add(com.mmc.transaction.system.spring.domain.stu.CityDomain)
	 */
	public void add(CityDomain domain) {
		cityMapper.saveCity(domain);
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCityService#batchAdd(java.util.List)
	 */
	public void batchAdd(List<CityDomain> list) {
		log.debug("batch save start......");
		long start = System.currentTimeMillis();
		cityMapper.batchSaveCity(list);
		long end = System.currentTimeMillis();
		log.debug("batch save end......cost time {}ms", (end - start));
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCityService#update(com.mmc.transaction.system.spring.domain.stu.CityDomain)
	 */
	public void update(CityDomain domain) {
		
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCityService#query()
	 */
	public List<CityDomain> query() {
		// TODO Auto-generated method stub
		return null;
	}


}
