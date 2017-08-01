// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.dao;

import java.sql.SQLException;
import java.util.Date;

import com.mmc.transaction.system.base.dao.impl.DrawInfoDaoImpl;
import com.mmc.transaction.system.base.domain.DrawDomain;

/** 
 * className: MockTransactionThread<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class MockTransactionThread implements Runnable {

	private DrawInfoDao drawInfoDao;
	private int incr;
	
	public MockTransactionThread(int i) {
		drawInfoDao = new DrawInfoDaoImpl();
		incr = i;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	public void run() {
		DrawDomain domain = new DrawDomain();
		domain.setGameCode("99201");
		domain.setGameDraw("17004" + incr);
		domain.setSaleBegin(new Date());
		domain.setSaleEnd(new Date());
		domain.setPayBegin(new Date());
		domain.setPayEnd(new Date());
		domain.setLotteryNo("1+2+3+4+5+6+7+8+8+0");
		domain.setDrawType("1");
		try {
			drawInfoDao.saveDraw(domain);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
