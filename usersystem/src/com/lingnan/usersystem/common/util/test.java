package com.lingnan.usersystem.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.lingnan.usersystem.usermgr.business.dao.UserDaoImpl;
import com.lingnan.usersystem.usermgr.domain.UserVo;

public class test {

	public static void main(String[] args) {
		/*Date date=new Date();//获得系统当前的时
		System.out.println(date);
		SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd");
		String form=sd.format(date);
		System.out.println(form);
*/
		
		/*String s="1997-10-01";
		Date d=TypeUtils.strTodate(s);
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));*/
		
		/*String s="xxxxxxxxx@wwew_163sadasdf.com.cn";
		boolean flag=TypeUtils.isemail(s);
		System.out.println(flag);*/
		
		/*String s="eeee";
		boolean flag=TypeUtils.isEmpty(s);
		System.out.println(flag);*/
		
		/*UserDaoImpl user=new UserDaoImpl();
		UserVo us=user.login("ouba", "123");
		System.out.println(us);*/
		
		/*UserDaoImpl user=new UserDaoImpl();
		UserVo us=new UserVo("mao","123","男","77777","2","1");
		System.out.println(user.insertUser(us));*/
		
	}

}
