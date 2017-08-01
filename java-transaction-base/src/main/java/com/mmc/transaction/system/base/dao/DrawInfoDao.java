// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.dao;

import java.sql.SQLException;

import com.mmc.transaction.system.base.domain.DrawDomain;

/** 
 * className: DrawInfoDao<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public interface DrawInfoDao {

	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param domain
	 */
	public void saveDraw(DrawDomain domain) throws SQLException;
}
