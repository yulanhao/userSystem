package com.lingnan.usersystem.usermgr.business.service;

import java.sql.Connection;

import com.lingnan.usersystem.common.constant.EnumType;
import com.lingnan.usersystem.common.dao.DaoFactory;
import com.lingnan.usersystem.common.exception.DaoException;
import com.lingnan.usersystem.common.exception.ServiceException;
import com.lingnan.usersystem.common.util.DBUtils;
import com.lingnan.usersystem.usermgr.business.dao.UserDao;
import com.lingnan.usersystem.usermgr.domain.UserVo;

/**
 * 用户service接口的实现类
 * @author 浩哥
 *
 */
public class UserServiceImpl implements UserService{
	/**
	 * 用户service类实例，在类的内部创建唯一实例
	 */
	private static UserService userService=new UserServiceImpl();

	/**
	 * 私有构造方法
	 */
	private UserServiceImpl() {
		
	}
	
	/**
	 * 获取用户service实例
	 * @return 实例对象
	 */
	public static UserService geInstence(){
		return userService;
	}
	
	/**
	 * 用户登录
	 * @param username 用户名
	 * @param pass 密码
	 * @return 用户信息
	 */
	public UserVo login(String username,String pass){
		//声明数据库连接对象，用于保存数据库连接对象
		Connection conn=null;
		UserVo user=null;
		try {
			//调用数据库工具类的getconnection方法，取得数据库连接对象，并赋值给数据库连接对象变量
			conn=DBUtils.getConnection();
			//调用dao工厂类的getDao方法，取得指定类型的dao接口的实现类，并赋值给dao接口变量
			UserDao userMgrDao=(UserDao)DaoFactory.getDao(conn, EnumType.User_DAO);
			//调用dao中的login方法，进行登录操作，结果赋值给登录结果变量
			user=userMgrDao.login(username, pass);
		} catch (DaoException e) {
			//将自定义异常抛出
			throw e;
		}catch(Exception e){
			//将异常封装成自定义异常并抛出
			throw new ServiceException("用户登录错误", e);
		}finally{
			DBUtils.closeConnection(conn);
		}
		//返回登录结果
		return user;
	}
	
	
	
}
