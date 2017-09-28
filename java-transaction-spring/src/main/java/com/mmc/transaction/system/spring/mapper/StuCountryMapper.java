// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.mapper;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.CountryDomain;

/** 
 * className: StuCountryMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月28日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuCountryMapper {

	void saveCountry(CountryDomain country);
	
	void batchSaveCountry(List<CountryDomain> list);
}
