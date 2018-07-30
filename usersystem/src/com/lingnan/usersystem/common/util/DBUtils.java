package com.lingnan.usersystem.common.util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.lingnan.usersystem.common.exception.DaoException;

/**
 * 工具类，可以获取连接，关闭连接，开启事务，提交事务，回滚事务，关闭结果集及语句对象
 * @author 浩哥
 *
 */
public class DBUtils {
	
	/**
	 * 连接oracle数据库
	 * @return 
	 */
	public static Connection getConnection(){
		String url="jdbc:oracle:thin:@localhost:1521:orcl"; 
		String user="scott"; 
		String password="123456"; 
		Connection conn=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn= DriverManager.getConnection(url,user,password);  
		}catch(ClassNotFoundException e){
			throw new DaoException("检查是否jar包没有加载", e);
		}catch (SQLException e) {
			throw new DaoException("数据库连接失败！", e);
		}
		System.out.println("oracle数据库连接成功！");
		return conn;      
	}
	
	/**
	 * 关闭oracle数据库连接、关闭结果集及语句对象
	 * @param conn
	 * @param rs
	 * @param stmt
	 */
	public static void closeStatement(ResultSet rs,Statement stmt){
		try{
			if(rs!=null){
				rs.close();
				rs=null;
			}
			if(stmt!=null){
				stmt.close();
				stmt=null;
			}										
		}catch(SQLException e){
			throw new DaoException("数据库结果集及语句对象关闭失败", e);
			//e.printStackTrace();
		}		
	}
	
	public static void closeConnection(Connection conn){
		try {
			if(conn!=null){
				conn.close();
				conn=null;
			}	
		} catch (Exception e) {
			throw new DaoException("数据库连接关闭失败", e);
		}
		
	}
	
	/**
	 * 开启事务
	 * @param conn
	 */
	public static void beginTransaction(Connection conn){
		try {
			//将事务的自动提交模式设为假
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			throw new DaoException("开启事务失败！", e);
		}
	}
	
	/**
	 * 提交事务
	 * @param conn
	 */
	public static void commit(Connection conn){
		try {
			//提交事务
			conn.commit();
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new DaoException("提交事务失败！", e);
		}
	}
	
	/**
	 * 事务回滚
	 * @param conn
	 */
	public static void rollback(Connection conn){
		try {
			//回滚事务
			conn.rollback();
			//将事务的自动提交模式设为真
			conn.setAutoCommit(true);
		} catch (SQLException e) {
			throw new DaoException("事务回滚失败！", e);
		}
	}
}
