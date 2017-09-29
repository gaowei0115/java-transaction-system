// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu;

import java.util.List;

import com.mmc.transaction.system.spring.domain.stu.AddressDomain;

/** 
 * className: StuAddressService<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface StuAddressService {

	/**
	 * Description：查询省区县信息<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @return
	 */
	List<AddressDomain> queryPCCInfo();
	
	/**
	 * Description：批量保存地址信息<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param list
	 */
	void batchSave(List<AddressDomain> list);
}
