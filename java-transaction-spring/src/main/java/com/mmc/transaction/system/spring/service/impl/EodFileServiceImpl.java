// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mmc.transaction.system.spring.domain.EodFileDomain;
import com.mmc.transaction.system.spring.mapper.EodFileMapper;
import com.mmc.transaction.system.spring.service.EodFileService;

/** 
 * className: EodFileServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("eodFileServiceImpl")
public class EodFileServiceImpl implements EodFileService {
	
	private static final Logger log = LoggerFactory.getLogger(EodFileServiceImpl.class);

	@Autowired
	private EodFileMapper eodFileMapper;
	
	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.EodFileService#insert(com.mmc.transaction.system.spring.domain.EodFileDomain)
	 */
	@Transactional
	public void insert(EodFileDomain domain) {
		eodFileMapper.insertEodFile(domain);
	}
	
	private void insert1(EodFileDomain domain) {
		eodFileMapper.insertEodFile(domain);
		int i = 1 / 0;
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.EodFileService#batchSave(java.util.List)
	 */
	@Transactional
	public void batchSave(List<EodFileDomain> list) {
		long start = System.currentTimeMillis();
		log.debug("batch save start.....");
		eodFileMapper.batchInsertEodFile(list);
		long end = System.currentTimeMillis();
		log.debug("batch save end..... {}ms", (end - start));
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.EodFileService#update(com.mmc.transaction.system.spring.domain.EodFileDomain)
	 */
	public void update(EodFileDomain domain) {

	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.EodFileService#batchUpdate(java.util.List)
	 */
	public void batchUpdate(List<EodFileDomain> list) {

	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.EodFileService#batchSave1(java.util.List)
	 */
	public void batchSave1(List<EodFileDomain> list) {
		long start = System.currentTimeMillis();
		log.debug("batch save start.....");
		for (EodFileDomain domain : list) {
			insert(domain);
		}
		long end = System.currentTimeMillis();
		log.debug("batch save end..... {}ms", (end - start));
	}

}
