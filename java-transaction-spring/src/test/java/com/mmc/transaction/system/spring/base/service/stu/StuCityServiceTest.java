// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
	
	@Test
	public void test02() {
		List<CityDomain> list = new ArrayList<CityDomain>();
		CityDomain city = new CityDomain();
		city.setCityCode("410100");
		city.setCityName("郑州市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410200");
		city.setCityName("开封市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410300");
		city.setCityName("洛阳市");
		city.setProvinceCode("410000");
		list.add(city);
		
		city = new CityDomain();
		city.setCityCode("410400");
		city.setCityName("平顶山市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410500");
		city.setCityName("安阳市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410600");
		city.setCityName("鹤壁市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410700");
		city.setCityName("新乡市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410800");
		city.setCityName("焦作市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("410900");
		city.setCityName("濮阳市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411000");
		city.setCityName("许昌市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411200");
		city.setCityName("三门峡市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411300");
		city.setCityName("南阳市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411400");
		city.setCityName("商丘市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411500");
		city.setCityName("信阳市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411600");
		city.setCityName("周口市");
		city.setProvinceCode("410000");
		list.add(city);
		city = new CityDomain();
		city.setCityCode("411700");
		city.setCityName("驻马店市");
		city.setProvinceCode("410000");
		list.add(city);
		
		cityService.batchAdd(list);
	}
	
	
	@Test
	public void test03() {
		List<CityDomain> list = new ArrayList<CityDomain>();
		CityDomain city = null;
		for (int i = 0; i < 50000; i++) {
			city = new CityDomain();
			String cityCode = i + "";
			int length = cityCode.length();
			StringBuffer sb = new StringBuffer();
			sb.append(cityCode);
			if (length < 6) {
				for (int j = 0; j < 6; j++) {
					sb.append(random());
				}
			}
			city.setCityCode(sb.toString());
			city.setCityName("temp");
			city.setProvinceCode("410000");
			list.add(city);
			sb = null;
			city = null;
		}
		
		cityService.batchAdd(list);
	}
	
	@Test
	public void test04() {
		List<CityDomain> list = new ArrayList<CityDomain>();
		CityDomain city = null;
		for (int i = 50000; i < 100000; i++) {
			city = new CityDomain();
			String cityCode = i + "";
			int length = cityCode.length();
			StringBuffer sb = new StringBuffer();
			sb.append(cityCode);
			if (length < 6) {
				for (int j = 0; j < 6; j++) {
					sb.append(random());
				}
			}
			city.setCityCode(sb.toString());
			city.setCityName("temp");
			city.setProvinceCode("110000");
			list.add(city);
			sb = null;
			city = null;
		}
		
		cityService.batchAdd(list);
	}
	
	public String random() {
		char[] arrayC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Random random = new Random();
		int index = random.nextInt(arrayC.length);
		return String.valueOf(arrayC[index]);
	}
}
