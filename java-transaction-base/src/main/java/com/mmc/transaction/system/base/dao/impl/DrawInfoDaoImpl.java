// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mmc.transaction.system.base.dao.DrawInfoDao;
import com.mmc.transaction.system.base.domain.DrawDomain;
import com.mmc.transaction.system.base.util.DataBaseUtils;

/** 
 * className: DrawInfoDaoImpl<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DrawInfoDaoImpl implements DrawInfoDao{

	/* (non-Javadoc)
	 * @see com.mmc.transaction.system.base.dao.DrawInfoDao#saveDraw(com.mmc.transaction.system.base.domain.DrawDomain)
	 */
	public void saveDraw(DrawDomain domain) throws SQLException {
		DataBaseUtils.beginTransaction();
		Connection conn = DataBaseUtils.getConnection();
		try {
			PreparedStatement ps = conn.prepareStatement("insert into t_draw (GAMECODE, GAMEDRAW, SALEBEGIN, SALEEND, PAYBEGIN, PAYEND, LOTTERYNO, DRAWTYPE)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
			ps.setString(1, domain.getGameCode());
			ps.setString(2, domain.getGameDraw());
			ps.setDate(3, new Date(domain.getSaleBegin().getTime()));
			ps.setDate(4, new Date(domain.getSaleEnd().getTime()));
			ps.setDate(5, new Date(domain.getPayBegin().getTime()));
			ps.setDate(6, new Date(domain.getPayEnd().getTime()));
			ps.setString(7, domain.getLotteryNo());
			ps.setString(8, domain.getDrawType());
			ps.execute();
			
			DataBaseUtils.commitTransaction();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.releaseConnection(conn);
		}
	}
	
}
