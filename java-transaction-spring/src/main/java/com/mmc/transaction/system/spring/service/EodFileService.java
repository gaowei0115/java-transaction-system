// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service;

import java.util.List;

import com.mmc.transaction.system.spring.domain.EodFileDomain;

/** 
 * className: EodFileService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface EodFileService {

	void insert(EodFileDomain domain);
	
	void batchSave(List<EodFileDomain> list);
	
	void batchSave1(List<EodFileDomain> list);
	
	void update(EodFileDomain domain);
	
	void batchUpdate(List<EodFileDomain> list);
}
