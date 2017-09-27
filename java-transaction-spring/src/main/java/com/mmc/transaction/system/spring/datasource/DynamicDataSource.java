// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.datasource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/** 
 * className: DynamicDataSource<br/>
 * Description: 动态数据源配置<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	private static final Logger log = LoggerFactory.getLogger(DynamicDataSource.class);
	
	/* (non-Javadoc)
	 * @see org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource#determineCurrentLookupKey()
	 */
	@Override
	protected Object determineCurrentLookupKey() {
		DataSourceType dataSourceType = DataSourceManager.get();
		log.info("Default start loading datasource {} .......", dataSourceType.toString());
		return dataSourceType;
	}

}
