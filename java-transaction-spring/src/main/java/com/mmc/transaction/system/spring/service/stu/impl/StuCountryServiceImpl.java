// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmc.transaction.system.spring.domain.stu.CountryDomain;
import com.mmc.transaction.system.spring.mapper.StuCountryMapper;
import com.mmc.transaction.system.spring.service.stu.StuCountryService;

/** 
 * className: StuCountryServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月28日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("countryService")
public class StuCountryServiceImpl implements StuCountryService {

	private static final Logger log = LoggerFactory.getLogger(StuCountryServiceImpl.class);
	
	@Autowired
	private StuCountryMapper countryMapper;
	
	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCountryService#add(com.mmc.transaction.system.spring.domain.stu.CountryDomain)
	 */
	public void add(CountryDomain country) {
		countryMapper.saveCountry(country);
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuCountryService#batchAdd(java.util.List)
	 */
	public void batchAdd(List<CountryDomain> list) {
		log.debug("batch save start.....");
		long start = System.currentTimeMillis();
		countryMapper.batchSaveCountry(list);
		long end = System.currentTimeMillis();
		log.debug("batch save end.....cost time {}ms", (end - start));
	}

}
