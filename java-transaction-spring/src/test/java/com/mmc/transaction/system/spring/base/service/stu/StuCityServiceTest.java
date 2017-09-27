// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service.stu;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.stu.CityDomain;
import com.mmc.transaction.system.spring.service.stu.StuCityService;

/** 
 * className: StuCityServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月27日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class StuCityServiceTest extends BaseTest {

	@Autowired
	private StuCityService cityService;
	
	@Test
	public void test() {
		CityDomain city = new CityDomain();
		city.setCityCode("110101");
		city.setCityName("东城区");
		city.setProvinceCode("110000");
		cityService.add(city);
	}
	
	@Test
	public void test01() {
		List<CityDomain> list = new ArrayList<CityDomain>();
		CityDomain city = new CityDomain();
		city.setCityCode("110102");
		city.setCityName("西城区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110105");
		city.setCityName("朝阳区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110106");
		city.setCityName("丰台区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110107");
		city.setCityName("石景山区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110108");
		city.setCityName("海淀区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110109");
		city.setCityName("门头沟区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110111");
		city.setCityName("房山区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110112");
		city.setCityName("通州区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110113");
		city.setCityName("顺义区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110114");
		city.setCityName("昌平区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110115");
		city.setCityName("大兴区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110116");
		city.setCityName("怀柔区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110117");
		city.setCityName("平谷区");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110228");
		city.setCityName("密云县");
		city.setProvinceCode("110000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("110229");
		city.setCityName("延庆县");
		city.setProvinceCode("110000");
		list.add(city);
		cityService.batchAdd(list);
	}
}
