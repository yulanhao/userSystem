package com.lingnan.usersystem.usermgr.business.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.lingnan.usersystem.common.exception.DaoException;
import com.lingnan.usersystem.common.util.DBUtils;
import com.lingnan.usersystem.usermgr.domain.UserVo;

/**
 * UserDao接口实现类
 * @author 浩哥
 *
 */
public class UserDaoImpl implements UserDao{
	/**
	 * 数据库连接
	 */
	private Connection conn;

	/**
	 * 构造方法
	 * @param conn 数据库连接
	 */
	public UserDaoImpl(Connection conn) {		
		this.conn = conn;
	}
	
	/**
	 * 用户登录
	 */
	public UserVo login(String username,String pass){
		//声明预编译的声明对象变量，用于进行数据库操作的载体
		PreparedStatement prep=null;
		//声明结果集对象变量，用于保存数据库查询结果
		ResultSet rs=null;
		//声明用户对象变量，用于保存从结果集中提取出来的数据
		UserVo user=null;
		Connection conn=null;
		try {
			conn=DBUtils.getConnection();
			//调用连接对象的prepareStatement方法，得到预编译对象，赋值给预编译对象变量
			prep=conn.prepareStatement("select * from t_user where username=? and pass=?");
			//调用预编译对象的setxxx方法，给？号赋值
			prep.setString(1, username);
			prep.setString(2, pass);
			//调用预编译对象的executeQuery方法，执行查询操作，返回查询到的结果集
			rs=prep.executeQuery();
			//如果查询结果不为空，将取出结果集中的各个字段，封装在用户对象的各个属性中
			while(rs.next()){
				//创建一个新用户对象，赋值给用户对象变量
				user=new UserVo();
				user.setId(rs.getInt(1));
				user.setUsername(rs.getString(2));
				user.setPass(rs.getString(3));
				user.setSex(rs.getString(4));
				user.setPhone(rs.getString(5));
				user.setSupervalue(rs.getString(6));
				user.setStatus(rs.getString(7));
			}
		} catch (SQLException e) {
			//将异常封装成自定义异常
			throw new DaoException("登录时查询用户信息出错", e);
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, prep);
			DBUtils.closeConnection(conn);
		}
		return user;
	}
	
	public boolean insertUser(UserVo us){
		boolean flag=false;
		PreparedStatement prep=null;
		ResultSet rs=null;		
		Connection conn=null;
		String username=us.getUsername();
		String pass=us.getPass();
		String sex=us.getSex();
		String phone=us.getPhone();
		String supervalue=us.getSupervalue();
		String status=us.getStatus();
		try {
			conn=DBUtils.getConnection();
			//调用连接对象的prepareStatement方法，得到预编译对象，赋值给预编译对象变量
			prep=conn.prepareStatement
					("insert into t_user(username,pass,sex,phone,supervalue,status) values(?,?,?,?,?,?)");
			//调用预编译对象的setxxx方法，给？号赋值
			prep.setString(1, username);
			prep.setString(2, pass);
			prep.setString(3, sex);
			prep.setString(4, phone);
			prep.setString(5, supervalue);
			prep.setString(6, status);
			prep.executeUpdate();
			flag=true;
		} catch (SQLException e) {
			throw new DaoException("插入用户信息出错", e);
		}finally{
			//调用数据库工具类，关闭结果集对象和声明对象
			DBUtils.closeStatement(rs, prep);
			DBUtils.closeConnection(conn);
		}
		return flag;
	}
}
