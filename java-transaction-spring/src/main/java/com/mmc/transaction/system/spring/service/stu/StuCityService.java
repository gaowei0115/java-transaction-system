// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.CityDomain;

/** 
 * className: StuCityService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuCityService {

	void add(CityDomain domain);
	
	void batchAdd(List<CityDomain> list);
	
	void update(CityDomain domain);
	
	List<CityDomain> query();
}
