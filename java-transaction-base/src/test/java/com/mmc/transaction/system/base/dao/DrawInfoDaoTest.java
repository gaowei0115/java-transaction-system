// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.dao;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import com.mmc.transaction.system.base.dao.impl.DrawInfoDaoImpl;
import com.mmc.transaction.system.base.domain.DrawDomain;

/** 
 * className: DrawInfoDaoTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class DrawInfoDaoTest {

	private DrawInfoDao drawInfoDao;
	
	@Before
	public void setUp () {
		drawInfoDao = new DrawInfoDaoImpl();
	}
	
	@Test
	public void test() throws SQLException {
		DrawDomain domain = new DrawDomain();
		domain.setGameCode("99201");
		domain.setGameDraw("17004");
		domain.setSaleBegin(new Date());
		domain.setSaleEnd(new Date());
		domain.setPayBegin(new Date());
		domain.setPayEnd(new Date());
		domain.setLotteryNo("1+2+3+4+5+6+7+8+8+0");
		domain.setDrawType("1");
		drawInfoDao.saveDraw(domain);
	}
}
