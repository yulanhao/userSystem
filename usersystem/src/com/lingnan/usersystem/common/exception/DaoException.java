package com.lingnan.usersystem.common.exception;

/**
 * 数据库操作异常类
 * @author haoge
 *
 */
public class DaoException extends RuntimeException {

	/**
	 * 默认的构造方法
	 */
	public DaoException() {
		super();
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DaoException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 */
	public DaoException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 */
	public DaoException(String message) {
		super(message);
		
	}

	/**
	 * 
	 * @param cause 异常的原因
	 */
	public DaoException(Throwable cause) {
		super(cause);
		
	}
		
}
