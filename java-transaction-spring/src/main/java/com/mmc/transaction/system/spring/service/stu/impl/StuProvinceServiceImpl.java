// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmc.transaction.system.spring.domain.stu.ProvinceDomain;
import com.mmc.transaction.system.spring.mapper.StuProvinceMapper;
import com.mmc.transaction.system.spring.service.stu.StuProvinceService;

/** 
 * className: StuProvinceServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("stuProvinceService")
public class StuProvinceServiceImpl implements StuProvinceService{

	private static final Logger log = LoggerFactory.getLogger(StuProvinceServiceImpl.class);
	
	@Autowired
	private StuProvinceMapper provinceMapper;
	
	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuProvinceService#add(com.mmc.transaction.system.spring.domain.stu.ProvinceDomain)
	 */
	public void add(ProvinceDomain domain) {
		provinceMapper.saveProvince(domain);
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuProvinceService#update(com.mmc.transaction.system.spring.domain.stu.ProvinceDomain)
	 */
	public void update(ProvinceDomain domain) {
		
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuProvinceService#query()
	 */
	public List<ProvinceDomain> query() {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuProvinceService#queryForId(java.lang.String)
	 */
	public ProvinceDomain queryForId(String provinceId) {
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuProvinceService#batchAdd(java.util.List)
	 */
	@Transactional
	public void batchAdd(List<ProvinceDomain> list) {
		long start = System.currentTimeMillis();
		log.debug("batch save start......");
		provinceMapper.batchSaveProvice(list);
		long end = System.currentTimeMillis();
		log.debug("batch save end...... cost time {}ms", (end - start));
	}

}
