package com.lingnan.usersystem.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.lingnan.usersystem.common.exception.DateException;
import com.lingnan.usersystem.common.exception.EmailException;



public class TypeUtils {

	/**
	 * 日期转化为字符串
	 * @param da
	 * @return
	 */
	public static String dateTostr(Date da){
		String str=null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			str=sdf.format(da);
		} catch (Exception e) {
			throw new DateException("日期转化为字符串失败", e);
		}
		return str;		
	}
	
	/**
	 * 字符串转化为日期
	 * @param str
	 * @return
	 */
	public static Date strTodate(String str){
		Date da=null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			da=sdf.parse(str);
		} catch (Exception e) {
			throw new DateException("字符串转化为日期失败", e);
		}
		return da;
	}
	
	/**
	 * 判断邮箱是否正确
	 * @param str
	 * @return
	 */
	public static boolean isemail(String str){
		boolean flag=false;
		try {
			String check="^[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}$";
			Pattern regex = Pattern.compile(check);
		    Matcher matcher = regex.matcher(str);
		    flag = matcher.matches();
		} catch (Exception e) {
			throw new EmailException("验证邮箱时出错，不能正常验证邮箱", e);
		}
		return flag;
	}
	
	/**
	 * 判断字符串是否为空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(String str){
		boolean flag=false;
		if(str == null ||"".equals(str))
		{
			flag=true;
		}
		return flag;
	}
}
