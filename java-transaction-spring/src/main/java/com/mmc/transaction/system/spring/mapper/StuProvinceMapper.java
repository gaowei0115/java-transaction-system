// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.mapper;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.ProvinceDomain;

/** 
 * className: StuProvinceMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuProvinceMapper {

	public void saveProvince(ProvinceDomain province);
	
	public void batchSaveProvice(List<ProvinceDomain> list);
	
}
