// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.ProvinceDomain;

/** 
 * className: StuProvinceService<br/>
 * Description: 省编号Service<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuProvinceService {

	void add(ProvinceDomain domain);
	
	void batchAdd(List<ProvinceDomain> list);
	
	void update(ProvinceDomain domain);
	
	List<ProvinceDomain> query();
	
	ProvinceDomain queryForId(String provinceId);
}
