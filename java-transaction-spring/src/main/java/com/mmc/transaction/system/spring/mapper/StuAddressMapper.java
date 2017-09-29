// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.mapper;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.AddressDomain;

/** 
 * className: StuAddressMapper<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuAddressMapper {

	public List<AddressDomain> queryPCC();
	
	public void batchSaveAddress(List<AddressDomain> list);
}
