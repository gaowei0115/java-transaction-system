// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.service.stu.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mmc.transaction.system.spring.domain.stu.AddressDomain;
import com.mmc.transaction.system.spring.mapper.StuAddressMapper;
import com.mmc.transaction.system.spring.service.stu.StuAddressService;

/** 
 * className: StuAddressServiceImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
@Service("addressService")
public class StuAddressServiceImpl implements StuAddressService {

	private static final Logger log = LoggerFactory.getLogger(StuAddressServiceImpl.class);
	
	@Autowired
	private StuAddressMapper addressMapper;
	
	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuAddressService#queryPCCInfo()
	 */
	public List<AddressDomain> queryPCCInfo() {
		log.debug("查询省区县信息.....");
		return addressMapper.queryPCC();
	}

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.spring.service.stu.StuAddressService#batchSave(java.util.List)
	 */
	public void batchSave(List<AddressDomain> list) {
		log.debug("批量保存用户地址信息.......");
		addressMapper.batchSaveAddress(list);
	}

}
