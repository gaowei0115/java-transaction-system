// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.stu.CountryDomain;
import com.mmc.transaction.system.spring.service.stu.StuCountryService;

/** 
 * className: StuCountryServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月28日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class StuCountryServiceTest extends BaseTest {

	@Autowired
	private StuCountryService countryService;
	
	@Test
	public void test() {
		CountryDomain country = new CountryDomain();
		country.setCountryCode("411401");
		country.setCountryName("市辖区");
		country.setCityCode("411400");
		countryService.add(country);
	}
	
	@Test
	public void test01() {
		List<CountryDomain> list = new ArrayList<CountryDomain>();
		CountryDomain country = new CountryDomain();
		country.setCountryCode("411402");
		country.setCountryName("梁园区");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411403");
		country.setCountryName("睢阳区");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411421");
		country.setCountryName("民权县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411422");
		country.setCountryName("睢县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411423");
		country.setCountryName("宁陵县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411424");
		country.setCountryName("柘城县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411425");
		country.setCountryName("虞城县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411426");
		country.setCountryName("夏邑县");
		country.setCityCode("411400");
		list.add(country);
		country = new CountryDomain();
		country.setCountryCode("411481");
		country.setCountryName("永城市");
		country.setCityCode("411400");
		list.add(country);
		countryService.batchAdd(list);
	}
	
	@Test
	public void test02() {
		List<CountryDomain> list = new ArrayList<CountryDomain>();
		CountryDomain country = null;
		for (int i = 0; i < 1000; i++) {
			country = new CountryDomain();
			String countryCode = i + "";
			int length = countryCode.length();
			StringBuffer sb = new StringBuffer();
			sb.append(countryCode);
			if (length < 6) {
				for (int j = 0; j < 6 - length; j++) {
					sb.append(random());
				}
			}
			country.setCountryCode(sb.toString());
			country.setCountryName("temp");
			country.setCityCode("411400");
			list.add(country);
		}
		countryService.batchAdd(list);
	}
	
	public String random() {
		char[] arrayC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		Random random = new Random();
		int index = random.nextInt(arrayC.length);
		return String.valueOf(arrayC[index]);
	}
}
