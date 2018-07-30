package com.lingnan.usersystem.common.util;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class TypeUtilsTest {

	@Test
	public void testDateTostr() {
		Date d=new Date();
		String str=TypeUtils.dateTostr(d);
		//System.out.println(d);
		System.out.println(str);
	}

	/*@Test
	public void testStrTodate() {
		String s="1997-10-01";
		Date d=TypeUtils.strTodate(s);
		System.out.println(d);
		
	}

	@Test
	public void testIsemail() {
		String s="xxxxxxxxx@wwew_163sadasdf.com.cn";
		boolean flag=TypeUtils.isemail(s);
		System.out.println(flag);
	}
*/
}
