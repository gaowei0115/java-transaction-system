// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.stu.ProvinceDomain;
import com.mmc.transaction.system.spring.service.stu.StuProvinceService;

/** 
 * className: StuProvinceServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class StuProvinceServiceTest extends BaseTest{

	@Autowired
	private StuProvinceService provinceService;
	private AtomicLong atomicLong = new AtomicLong(100001);
	
	@Test
	public void test() {
		ProvinceDomain domain = new ProvinceDomain();
		domain.setProvinceId("110000");
		domain.setProvinceName("北京市");
		provinceService.add(domain);
	}
	
	@Test
	public void test01() {
		List<ProvinceDomain> list = new ArrayList<ProvinceDomain>();
		ProvinceDomain domain = new ProvinceDomain();
		domain.setProvinceId("120000");
		domain.setProvinceName("天津市");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("130000");
		domain.setProvinceName("河北省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("140000");
		domain.setProvinceName("山西省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("150000");
		domain.setProvinceName("内蒙古自治区");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("210000");
		domain.setProvinceName("辽宁省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("220000");
		domain.setProvinceName("吉林省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("230000");
		domain.setProvinceName("黑龙江省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("310000");
		domain.setProvinceName("上海市");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("320000");
		domain.setProvinceName("江苏省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("330000");
		domain.setProvinceName("浙江省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("340000");
		domain.setProvinceName("安徽省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("350000");
		domain.setProvinceName("福建省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("360000");
		domain.setProvinceName("江西省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("370000");
		domain.setProvinceName("山东省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("410000");
		domain.setProvinceName("河南省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("420000");
		domain.setProvinceName("湖北省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("430000");
		domain.setProvinceName("湖南省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("440000");
		domain.setProvinceName("广东省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("450000");
		domain.setProvinceName("广西壮族自治区");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("460000");
		domain.setProvinceName("海南省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("500000");
		domain.setProvinceName("重庆市");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("510000");
		domain.setProvinceName("四川省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("520000");
		domain.setProvinceName("贵州省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("530000");
		domain.setProvinceName("云南省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("540000");
		domain.setProvinceName("西藏自治区");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("610000");
		domain.setProvinceName("陕西省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("620000");
		domain.setProvinceName("甘肃省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("630000");
		domain.setProvinceName("青海省");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("640000");
		domain.setProvinceName("宁夏回族自治区");
		list.add(domain);
		domain = new ProvinceDomain();
		domain.setProvinceId("650000");
		domain.setProvinceName("新疆维吾尔自治区");
		list.add(domain);
		provinceService.batchAdd(list);
	}
	
	@Test
	public void test02() {
		List<ProvinceDomain> list = new ArrayList<ProvinceDomain>();
		ProvinceDomain domain = null;
		for (int i = 0; i < 100000; i++) {
			domain = new ProvinceDomain();
			domain.setProvinceId(String.valueOf(atomicLong.getAndIncrement()) + "B");
			domain.setProvinceName("tempdata");
			list.add(domain);
			domain = null;
		}
		provinceService.batchAdd(list);
	}
}
