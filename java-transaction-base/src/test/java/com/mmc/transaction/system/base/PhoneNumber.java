// Copyright (C) 2017-2017 GGWW All rights reserved
package com.mmc.transaction.system.base;

/** 
 * className: PhoneNumber<br/>
 * Description: 测试不复写hashCode导致问题<br/>
 * Author: GW<br/>
 * CreateTime： 2017年8月1日<br/>
 *
 * History: (version) Author DateTime Note <br/>
 */
public class PhoneNumber {

	private final short areaCode;
	
	private final short prefix;
	
	private final short lineNumber;
	
	/**
	 * @param areaCode
	 * @param prefix
	 * @param lineNumber
	 */
	public PhoneNumber(int areaCode, int prefix, int lineNumber) {
		checkRange(areaCode, 999, "area code");
		checkRange(prefix, 999, "prefix");
		checkRange(prefix, 9999, "linuNumber");
		this.areaCode = (short)areaCode;
		this.prefix = (short)prefix;
		this.lineNumber = (short)lineNumber;
	}
	
	/**
	 * Description：<br/>
	 * Author：GW<br/>
	 * History: (version) Author DateTime Note <br/>
	 * @param arg
	 * @param max
	 * @param name
	 */
	public static void checkRange(int arg, int max, String name) {
		if (arg < 0 && arg > max) {
			throw new IllegalArgumentException(name + " : " + arg);
		}
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		return areaCode * 2 + prefix * 8 + lineNumber * 1;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof PhoneNumber) {
			return true;
		}
		PhoneNumber pn = (PhoneNumber) obj;
		return pn.areaCode == areaCode && pn.prefix == prefix && pn.lineNumber == lineNumber;
	}
}
