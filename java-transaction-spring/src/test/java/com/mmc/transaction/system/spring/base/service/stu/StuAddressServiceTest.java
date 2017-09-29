// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.spring.base.service.stu;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mmc.transaction.system.spring.base.BaseTest;
import com.mmc.transaction.system.spring.domain.stu.AddressDomain;
import com.mmc.transaction.system.spring.service.stu.StuAddressService;

/** 
 * className: StuAddressServiceTest<br/>
 * Description: <br/>
 * Author: GW<br/>
 * CreateTime： 2017年9月29日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class StuAddressServiceTest extends BaseTest {

	@Autowired
	private StuAddressService addressService;
	private static AtomicInteger atomic = new AtomicInteger(5);
	
	
	@Test
	public void test() {
		List<AddressDomain> list = addressService.queryPCCInfo();
		System.out.println(list.size());
	}
	
	@Test
	public void test001() {
		if (System.out.printf("a") == null) {
			System.out.println("a");
		} else {
			System.out.println("b");
		}
	}
	
	@Test
	public void test01() {
		for (int i = 0; i < 1000; i++) {
			List<AddressDomain> list = addressService.queryPCCInfo();
			for (AddressDomain ad : list) {
				ad.setAddressCode(random());
				ad.setAddressDesc("XXX街道YYY小区ZZZ栋SSS室");
				ad.setLinkName(linkName());
				ad.setLinkPhone(phone());
				ad.setIsDefault(0);
				ad.setPostCode("XXXXXX");
			}
			addressService.batchSave(list);
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Test
	public void testLinkName() {
		for (int i = 0; i < 100; i++) {
			System.out.println(linkName());
		}
	}
	
	@Test
	public void testPhone() {
		System.out.println(phone());
	}
	
	public String phone() {
		char[] arrayC = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		StringBuffer sb = new StringBuffer();
		if (atomic.get() % 2 == 0) {
			sb.append("137");
		} else {
			sb.append("158");
		}
		Random random = new Random();
		for (int i = 0; i < 8; i++) {
			sb.append(arrayC[random.nextInt(arrayC.length)]);
		}
		return sb.toString();
	}
	
	public String linkName() {
		Random random = new Random();
		char[] firstName = {'张', '王', '李', '赵', '孙', '周', '吴', '郑', '靳', '高', 
				'冯', '陈', '朱', '位', '蒋', '沈', '韩', '杨', '秦', '许', '何', '刘', '史',
				'云', '苏', '范', '华', '谢', '苗', '方', '余', '任', '柳', '孟', '平', '习'};
		
		char[] secondName = {'梦', '洁', '静', '雅', '韵', '寒', '姿', '莉', '沛', '玲', 
				'欣', '妍', '瑶', '歆', '凌', '菲', '靖', '瑶', '瑾', '秀', '娟', '英', '华',
				'慧', '巧', '美', '静', '淑', '惠', '珠', '翠', '雅', '芝', '玉', '红', '娥',
				'芬','芳','燕','彩','春','菊','兰','凤','洁','梅','琳','素','云','莲','真','环','雪','荣','爱','妹'};
		
		char[] lastName = {'弼', '彪', '宾', '沧', '晟', '弛', '德', '铎', '峰', '浩', '庚',
				'函', '涵', '昊', '灏', '豪', '辉', '健', '剑', '建', '键', '晋',
				'俊', '骏', '凯', '铠', '朗', '利', '黎', '律', '迈', '明', '攀',
				'彭', '澎', '濮', '仁', '飒', '思', '信', '胜', '世', '舜', '泰',
				'涛', '伟', '玮', '魏', '宪', '贤', '雄', '煊', '彦', '瑜', '展', 
				'彰', '哲', '振', '征', '志', '忠', '佐', '辰', '海', '杰' };
		
		int first = random.nextInt(firstName.length);
		int second = random.nextInt(secondName.length);
		int last = random.nextInt(lastName.length);
		StringBuffer sb = new StringBuffer();
		sb.append(firstName[first]);
		sb.append(secondName[second]);
		if (atomic.getAndIncrement() % 5 != 0) {
			sb.append(lastName[last]);
		}
		System.out.println(atomic.get());
		return sb.toString();
	}
	
	public String random() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmss");
		StringBuffer sb = new StringBuffer();
		String date = sdf.format(new Date());
		sb.append(date);
		Random random = new Random();
		char[] arrayC = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
				'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
				'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		for (int i = 0; i < 5; i++) {
			int index = random.nextInt(arrayC.length);
			sb.append(arrayC[index]);
		}
		return sb.toString();
	}
}
