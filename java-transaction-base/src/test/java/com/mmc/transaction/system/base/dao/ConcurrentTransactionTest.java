// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base.dao;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/** 
 * className: ConcurrentTransactionTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class ConcurrentTransactionTest {

	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param args
	 */
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(100);
		for (int i = 0; i < 100; i++) {
			executorService.execute(new MockTransactionThread(i + 1));
		}
		executorService.shutdown();
	}
}
