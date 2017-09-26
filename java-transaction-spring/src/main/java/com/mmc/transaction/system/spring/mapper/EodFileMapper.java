// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.mapper;

import java.util.List;

import com.mmc.transaction.system.spring.domain.EodFileDomain;

/** 
 * className: EodFileMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface EodFileMapper {

	void insertEodFile(EodFileDomain domain);

	void batchInsertEodFile(List<EodFileDomain> list);
}
