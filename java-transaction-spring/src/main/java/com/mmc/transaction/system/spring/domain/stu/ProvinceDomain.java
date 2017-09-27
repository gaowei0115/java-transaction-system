// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.domain.stu;

import java.io.Serializable;

/** 
 * className: ProvinceDomain<br/>
 * Description: 省编号实体<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class ProvinceDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7118565862192855153L;
	
	private String provinceId;
	private String provinceName;
	
	
	/**
	 * @return the provinceId
	 */
	public String getProvinceId() {
		return provinceId;
	}
	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}
	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
}
