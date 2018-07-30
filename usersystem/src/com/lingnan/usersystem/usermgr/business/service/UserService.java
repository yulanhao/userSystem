package com.lingnan.usersystem.usermgr.business.service;

import com.lingnan.usersystem.usermgr.domain.UserVo;

public interface UserService {

	/**
	 * 用户登录
	 * @param username 用户名
	 * @param pass 密码
	 * @return 用户信息
	 */
	public UserVo login(String username,String pass);
	
	/**
	 * 用户注册
	 * @param us 新用户的信息
	 * @return 是否成功插入
	 */
	//public boolean insertUser(UserVo us);
}
