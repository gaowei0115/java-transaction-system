// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.domain.stu;

import java.io.Serializable;

/** 
 * className: AddressDomain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class AddressDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2252693459737291944L;

	private String addressCode;
	private String provinceCode;
	private String provinceName;
	private String cityCode;
	private String cityName;
	private String countryCode;
	private String countryName;
	private String addressDesc;
	private String postCode;
	private String linkName;
	private String linkPhone;
	private Integer isDefault;
	
	
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
	/**
	 * @return the cityName
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * @param cityName the cityName to set
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
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
	 * @return the addressCode
	 */
	public String getAddressCode() {
		return addressCode;
	}
	/**
	 * @param addressCode the addressCode to set
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	}
	/**
	 * @return the provinceCode
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * @param provinceCode the provinceCode to set
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * @return the cityCode
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * @param cityCode the cityCode to set
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
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
	 * @return the addressDesc
	 */
	public String getAddressDesc() {
		return addressDesc;
	}
	/**
	 * @param addressDesc the addressDesc to set
	 */
	public void setAddressDesc(String addressDesc) {
		this.addressDesc = addressDesc;
	}
	/**
	 * @return the postCode
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * @param postCode the postCode to set
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * @return the linkName
	 */
	public String getLinkName() {
		return linkName;
	}
	/**
	 * @param linkName the linkName to set
	 */
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	/**
	 * @return the linkPhone
	 */
	public String getLinkPhone() {
		return linkPhone;
	}
	/**
	 * @param linkPhone the linkPhone to set
	 */
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	/**
	 * @return the isDefault
	 */
	public Integer getIsDefault() {
		return isDefault;
	}
	/**
	 * @param isDefault the isDefault to set
	 */
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
}
