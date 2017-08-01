// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/** 
 * className: DataBaseUtils<br/>
 * Description: 数据库操作工具类<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DataBaseUtils {

	/**
	 * 定义数据源
	 */
	private static DataSource dataSource = new ComboPooledDataSource();
	
	/** 
     * 它为null表示没有事务 
     * 它不为null表示有事务 
     * 当开启事务时，需要给它赋值 
     * 当结束事务时，需要给它赋值为null 
     * 并且在开启事务时，让dao的多个方法共享这个Connection 
     */  
	private static ThreadLocal<Connection> t1 = new ThreadLocal<Connection>();
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @return
	 */
	public static DataSource getDataSource() {
		return dataSource;
	}
	
	public static Connection getConnection() {
		/**
		 * 如果有事务，返回当前事务的con对象
		 * 不存在事务，返回新的con对象
		 */
		Connection con = t1.get();
		if (con != null) {
			return con;
		}
		try {
			return dataSource.getConnection();
		} catch (SQLException e) {
			System.out.println("获取数据库连接池异常");
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Description：开启事务管理<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @throws SQLException 
	 */
	public static void beginTransaction() throws SQLException {
		Connection con = t1.get();
		if (con != null) {
			throw new SQLException("已经开启事务，不能重复开启");
		}
		con = dataSource.getConnection();
		con.setAutoCommit(false); // 设置事务手动提交
		t1.set(con);
	}
	
	/**
	 * Description：提交事务<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @throws SQLException 
	 */
	public static void commitTransaction() throws SQLException{
		Connection con = t1.get();
		if (con == null) {
			throw new SQLException("没有事务，不能执行提交操作");
		}
		con.commit(); // 提交事务
		con.close(); // 关闭连接
		con = null;
		t1.remove(); // 清空当前事务连接
	}
	
	/**
	 * Description：回滚事务<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @throws SQLException 
	 */
	public static void rollbackTransaction() throws SQLException {
		Connection con = t1.get();
		if (con == null) {
			throw new SQLException("没有事务，不能回滚操作");
		}
		// 回滚事务
		con.rollback();
		// 关闭连接
		con.close();
		con = null;
		t1.remove(); // 清空当前事务连接
	}
	
	/**
	 * Description：释放资源<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @throws SQLException 
	 */
	public static void releaseConnection(Connection connection) throws SQLException {
		Connection con = t1.get(); // 获取当前事务连接
		if (connection != con) { // 如果参数连接与当前事务连接不同，说明这个连接不是当前事务，可以关闭
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
}
