// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.domain.stu;

import java.io.Serializable;

/** 
 * className: CountryDomain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月28日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class CountryDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1909730860016686583L;
	
	
	private String countryCode;
	private String countryName;
	private String CityCode;
	
	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}
	/**
	 * @param countryCode the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}
	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return CityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		CityCode = cityCode;
	}
}
