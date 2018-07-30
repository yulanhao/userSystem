package com.lingnan.usersystem.usermgr.business.dao;

import com.lingnan.usersystem.common.dao.BaseDao;
import com.lingnan.usersystem.usermgr.domain.UserVo;

public interface UserDao extends BaseDao{
	
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
	public boolean insertUser(UserVo us);
}
