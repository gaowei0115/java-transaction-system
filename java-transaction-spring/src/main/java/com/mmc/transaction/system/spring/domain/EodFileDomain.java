// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.domain;

import java.io.Serializable;
import java.util.Date;

/** 
 * className: EodFileDomain<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月26日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class EodFileDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6373181372572096923L;
	
	
	private Long id;
	private String busiDate;
	private String busiStatus;
	private Date beginDate;
	private Date endDate;
	
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the busiDate
	 */
	public String getBusiDate() {
		return busiDate;
	}
	/**
	 * @param busiDate the busiDate to set
	 */
	public void setBusiDate(String busiDate) {
		this.busiDate = busiDate;
	}
	/**
	 * @return the busiStatus
	 */
	public String getBusiStatus() {
		return busiStatus;
	}
	/**
	 * @param busiStatus the busiStatus to set
	 */
	public void setBusiStatus(String busiStatus) {
		this.busiStatus = busiStatus;
	}
	/**
	 * @return the beginDate
	 */
	public Date getBeginDate() {
		return beginDate;
	}
	/**
	 * @param beginDate the beginDate to set
	 */
	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
