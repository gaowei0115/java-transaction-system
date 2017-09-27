// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.mapper;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.CityDomain;

/** 
 * className: StuCityMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuCityMapper {

	public void saveCity(CityDomain city);
	
	public void batchSaveCity(List<CityDomain> list);
}
