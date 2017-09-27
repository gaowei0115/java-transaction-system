// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.datasource;

/** 
 * className: DataSourceManager<br/>
 * Description: 数据源管理<br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DataSourceManager {

	// 
	private static final ThreadLocal<DataSourceType> dataSourceTypes = new ThreadLocal<DataSourceType>(){
		@Override
		protected DataSourceType initialValue() {
			return DataSourceType.DS_02;
		};
	};
	
	public static DataSourceType get() {
		return dataSourceTypes.get();
	}
	
	public static void set(DataSourceType dataSourceType) {
		dataSourceTypes.set(dataSourceType);
	}
	
	public static void clear() {
		dataSourceTypes.remove();
	}
}
