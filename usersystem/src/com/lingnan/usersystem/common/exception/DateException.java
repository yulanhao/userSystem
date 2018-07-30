package com.lingnan.usersystem.common.exception;

/**
 * 日期转换异常类
 * @author haoge
 *
 */
public class DateException extends ServiceException{

	/**
	 * 默认的构造方法
	 */
	public DateException() {
		super();
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DateException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 * @param cause 异常的原因
	 */
	public DateException(String message, Throwable cause) {
		super(message, cause);
		
	}

	/**
	 * 
	 * @param message 异常的详细信息
	 */
	public DateException(String message) {
		super(message);
		
	}

	/**
	 * 
	 * @param cause 异常的原因
	 */
	public DateException(Throwable cause) {
		super(cause);
		
	}
	
}
